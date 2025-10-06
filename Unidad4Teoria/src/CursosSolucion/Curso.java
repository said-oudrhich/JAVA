package CursosSolucion;

public class Curso 
{
    private String      curso;
    private Alumno      arrayAlumnos[];
    private int         numAlumnos = 0;  //también hace de índice de arrayAlumnos[]
    private static int  totalAlumnos = 0;
    private static int  totalCursos = 0;
    /*********************************************************/
    /*********************************************************/
    //constructor
    public Curso(String curso, int capacidad) 
    {
        this.curso = curso;
        arrayAlumnos = new Alumno[capacidad];
        totalCursos++;
    }
    /*********************************************************/
    public void nuevoAlumno(String nombre)
    {
        arrayAlumnos[numAlumnos] = new Alumno (curso, nombre);
        numAlumnos++;
        totalAlumnos++;
    }
    /*********************************************************/
    public String getCurso() {
        return curso;
    }
    /*********************************************************/
    public void todosLosAlumnosCurso() 
    {
        // recoore su array y visualiza los nombres
        for (int i = 0 ; i < numAlumnos ; i++)
            System.out.println(arrayAlumnos[i].getNombreAlumno());
    }
    /*********************************************************/
    private static boolean estaEnElCurso (Curso curso, String nombre)
    {
        boolean encontrado = false;
        
        for (int i=0 ; i<curso.numAlumnos ; i++)
            if (curso.arrayAlumnos[i].getNombreAlumno().equals(nombre)) 
                encontrado = true;
        return encontrado;
    }
    /*********************************************************/
    public static void cursosDelAlumno(Curso []cursos, String nombre)
    {
        // hay que mirar en todos los cursos.
        for (int i = 0; i < totalCursos; i++)
        {
            if (estaEnElCurso(cursos[i], nombre))
            System.out.println(nombre + " está matriculado(a) en "
                    + cursos[i].getCurso());
        }
    }
}// class Curso