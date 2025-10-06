package CursosSolucion;

public class Principal 
{
    public static void main(String[] args) 
    {
        int numCursos = 2;
        int capacidad = 30;
        
        //instanciamos el array de cursos (sólo 2 en este ejemplo)
        Curso cursos[] = new Curso[numCursos];
        
        //instaciamos dos cursos 
        cursos[0] = new Curso("Java",capacidad);
        cursos[1] = new Curso("Python",capacidad);
        
        //matriculamos a 3 alumnos        
        cursos[0].nuevoAlumno("Miguel Estrogoff");  //en java
        cursos[0].nuevoAlumno("Pamela Anderson");   //en java
        cursos[1].nuevoAlumno("Lope de Vega");      //en Python

        //queremos saber todos los alumno(a)s de un curso
        // no es estático, pues es un mensaje al objeto->curso concreto
        System.out.println("////queremos saber todos los alumno(a)s de un curso");
        System.out.println("////no es estático, pues es un mensaje al objeto->curso concreto");
        System.out.println("////JAVA:");
        cursos[0].todosLosAlumnosCurso();
        System.out.println("////PYTHON:");
        cursos[1].todosLosAlumnosCurso();

        //llamadas a métodos estáticos
        //queremos saber los cursos de cada alumno
        System.out.println("////llamadas a métodos estáticos");
        System.out.println("////queremos saber los cursos de cada alumno");
        Curso.cursosDelAlumno(cursos,"Miguel Estrogoff");
        Curso.cursosDelAlumno(cursos,"Pamela Anderson");
        Curso.cursosDelAlumno(cursos,"Lope de Vega");
        System.out.println("");
        
    }//main()

    
}// class Principal