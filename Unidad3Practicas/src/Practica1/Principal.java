package Practica1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        int n = 0;
        Scanner entrada = new Scanner(System.in);
        
        // Validar que N esté en el rango permitido
        while (n < 1 || n > 10) {
            System.out.print("Introduce un num (entre 1 y 10): ");
            n = entrada.nextInt();  
        }
       
        // Dibujar el cuadrado N-hueco
        for (int i = 0; i < n; i++) {
            
            if (i == 0 || i == n - 1) {
                // Primera y última fila completamente llenas de asteriscos
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            }
            else {
                // Filas intermedias: asteriscos en los bordes y espacios en el medio
                System.out.print("*");
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            
            System.out.println(); // Salto de línea después de cada fila
        }
        entrada.close();

    }// Main
}// Class
