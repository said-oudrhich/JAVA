package CursosAlumnos;

import java.util.Arrays;

public class Curso {
    private String      curso;
    private Alumno      arrayAlumnos[];
    private int         numAlumnos;
    private static int  totalAlumnos = 0;
    
    //**************************************************************************
    //**************************************************************************

    public Curso(String curso, int numAlumnos) {
        this.curso = curso;
        this.numAlumnos = 0;
        this.arrayAlumnos = new Alumno[numAlumnos];
    }
    
    //**************************************************************************
    
    public void nuevoAlumno(String nombre) {
        arrayAlumnos[numAlumnos] = new Alumno(curso, nombre);
        numAlumnos++;
        totalAlumnos++;
    }
    
    //**************************************************************************

    @Override
    public String toString() {
        return "Curso{" + "curso=" + curso + ", arrayAlumnos=" + Arrays.toString(arrayAlumnos) + ", numAlumnos=" + numAlumnos + '}';
    }
    
    
}
