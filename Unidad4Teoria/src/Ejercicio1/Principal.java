package Ejercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numEstudiantes;
        
        // Vector de vocales
        char vocales[] = new char[5];
        
        // Vector temperatura media del año
        double temperaturas[] = new double[12];
        
        // Vector con los nombres y notas de estudiantes
        System.out.print("Introduce el num de alumnos: ");
        numEstudiantes = entrada.nextInt();
        
        String nombre[] = new String[numEstudiantes];
        int notas[] = new int[numEstudiantes];
        
        // Pedimos datos
        for (int i = 0; i < nombre.length; i++) {
            // Limpiamos el buffer
            entrada.nextLine();
            
            System.out.print("Introduce el nombre del estududiante "+(i+1)+" : ");
            nombre[i] = entrada.nextLine();
            
            System.out.print("Introduce la nota del estududiante "+(i+1)+" : ");
            notas[i] = entrada.nextInt();
        }
        
        // Visualizamos notas
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Nombre: "+nombre[i]);
            System.out.println("Nota: "+notas[i]);
            System.out.println("");
        }
        
        // Vector de 5000 elementos de enteros aleatorios en el rango 1-1000
        int vector[] = new int[5000]; 
        int contador = 0;
        for (int i = 0; i < 5000; i++) {
            vector[i] = (int)(Math.random()*1000+1);
            // Comprueba cuantas veces se ha generado el numero 100
            if (vector[i] == 100) {
                contador ++;
            }
        }
        
        // Visualizamos
        for (int i = 0; i < 5000; i++) {
            System.out.print(vector[i]+"  ");
        }
        
        System.out.println("");
        System.out.println("Se ha generado "+contador+" veces el numero 100");
    }
}
