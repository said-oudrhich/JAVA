package CursosSolucion;

public class Alumno 
{
    private String      nombreAlumno;
    private String      curso;
        
    /**********************************************************/
    public Alumno(String curso, String nombre) // constructor 
    {
        this.nombreAlumno = nombre;
        this.curso = curso;
    }
    /**********************************************************/
    @Override
    public String toString() {
        return "Alumno{" + "nombreAlumno=" + nombreAlumno + ", curso=" + curso + '}';
    }
    /**********************************************************/
    public String getNombreAlumno() {
        return nombreAlumno;
    }
    /**********************************************************/
    
    
}// class Alumno