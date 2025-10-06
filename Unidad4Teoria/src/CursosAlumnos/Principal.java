package CursosAlumnos;
public class Principal {
    public static void main(String[] args) {
        
        int numCursos = 2;
        int capacidad = 30;
        
        Curso cursos[] = new Curso[numCursos];
        
        // Creamos dos cursos
        cursos[0] = new Curso("Java", capacidad);
        cursos[1] = new Curso("Python", capacidad);
        
        // Matriculamos estudiantes
        cursos[0].nuevoAlumno("Miguel Estrogoff");
        cursos[0].nuevoAlumno("Pamela Anderson");
        cursos[1].nuevoAlumno("Lope de Vega");
        
        System.out.println(cursos[0].toString());
        System.out.println(cursos[1].toString());
    }
}
