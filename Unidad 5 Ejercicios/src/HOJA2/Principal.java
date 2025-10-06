package HOJA2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ArrayList<Estudiante> estudianteCiclos = new ArrayList<>();
        ArrayList<Estudiante> estudianteBachillerato = new ArrayList<>();

        // Crear algunos estudiantes
        estudiantes.add(new Estudiante("Juan", 18, 7.5, "bachillerato"));
        estudiantes.add(new Estudiante("Ana", 19, 5.5, "ciclo"));
        estudiantes.add(new Estudiante("Luis", 17, 9.0, "bachillerato"));
        estudiantes.add(new Estudiante("Maria", 20, 6.0, "ciclo"));
        estudiantes.add(new Estudiante("Pedro", 18, 8.2, "bachillerato"));

        // Llamar al método dividir para clasificar los estudiantes
        dividir(estudiantes, estudianteCiclos, estudianteBachillerato);

        // Mostrar los estudiantes que pueden acceder a la universidad con nota de corte 6.0
        accedenAlaUniversidad(estudiantes, 9.0);

        // Mostrar cuántos estudiantes hay en cada tipo
        System.out.println("Total de estudiantes en Ciclo: " + Estudiante.getTotalCiclo());
        System.out.println("Total de estudiantes en Bachillerato: " + Estudiante.getTotalBachillerato());
    }

    private static void accedenAlaUniversidad(ArrayList<Estudiante> estudiantes, double notaDeCorte) {
        System.out.println("Estudiantes que acceden a la universidad (nota mínima " + notaDeCorte + "):");
        for (Estudiante est : estudiantes)
            if (est.getNota() >= notaDeCorte)
                System.out.println(est);
    }

    private static void dividir(ArrayList<Estudiante> estudiantes, ArrayList<Estudiante> estudianteCiclos, 
                               ArrayList<Estudiante> estudianteBachillerato) {
        for (Estudiante est : estudiantes) {
            if (est.getTipo().equals("ciclo"))
                estudianteCiclos.add(est);
            else if (est.getTipo().equals("bachillerato"))
                estudianteBachillerato.add(est);
        }
    }
}
