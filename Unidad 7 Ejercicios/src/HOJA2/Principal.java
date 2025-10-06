package HOJA2;

import java.io.*;
import java.util.*;

public class Principal {

    private static List<Alumno> alumnosDam = new ArrayList<>();
    private static List<Alumno> alumnosDaw = new ArrayList<>();

    public static void main(String[] args) {
        generarListas();
        generarFicheros();
        mostrarMenu();
    }

    // Método para leer el fichero y generar las listas de alumnos
    public static void generarListas() {
        try {
            BufferedReader fr = new BufferedReader(new FileReader("/home/m/Descargas/listado1.txt"));
            String line;
            fr.readLine();  // Ignorar la cabecera

            int contador = 0;
            while ((line = fr.readLine()) != null && contador < 30) {
                String[] datos = line.split(",");
                String nombre = datos[0];
                String identificador = datos[1];
                String curso = (contador < 15) ? "DAW" : "DAM";  // Los primeros 15 son DAW, los siguientes DAM

                Alumno alumno = new Alumno(curso, nombre, identificador);
                if (curso.equals("DAW")) {
                    alumnosDaw.add(alumno);
                } else {
                    alumnosDam.add(alumno);
                }

                contador++;
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para generar los ficheros de salida
    public static void generarFicheros() {
        try {
            BufferedWriter bwDam = new BufferedWriter(new FileWriter("/home/m/Descargas/alumnosDam.txt"));
            BufferedWriter bwDaw = new BufferedWriter(new FileWriter("/home/m/Descargas/alumnosDaw.txt"));

            for (Alumno alumno : alumnosDam) {
                bwDam.write(alumno.getNombre() + "\n");
            }
            for (Alumno alumno : alumnosDaw) {
                bwDaw.write(alumno.getNombre() + "\n");
            }

            bwDam.close();
            bwDaw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para mostrar el menú y manejar la selección
    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Visualizar los alumnos aprobados de DAM");
            System.out.println("2. Visualizar los alumnos aprobados de DAW");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    visualizarAprobados("DAM");
                    break;
                case 2:
                    visualizarAprobados("DAW");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    // Método para visualizar los alumnos aprobados de un curso
    public static void visualizarAprobados(String curso) {
        List<Alumno> lista = curso.equals("DAM") ? alumnosDam : alumnosDaw;

        System.out.println("\nAlumnos aprobados de " + curso + ":");
        for (Alumno alumno : lista) {
            alumno.generarNotaFinal();  // Genera la nota final
            if (alumno.getNotaFinal() >= 5) {
                System.out.println(alumno);
            }
        }
    }
}
