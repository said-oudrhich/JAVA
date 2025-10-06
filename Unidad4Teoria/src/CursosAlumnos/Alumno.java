package CursosAlumnos;
public class Alumno {
    
    private String curso;
    private String nombreAlumno;
    
    //**************************************************************************

    public Alumno(String curso, String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.curso = curso;
    }
    
    //**************************************************************************

    @Override
    public String toString() {
        return "Alumno{" + "curso=" + curso + ", nombreAlumno=" + nombreAlumno + '}';
    }
    
    
}
