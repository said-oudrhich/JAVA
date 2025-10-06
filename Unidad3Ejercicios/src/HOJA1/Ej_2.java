package HOJA1;

import java.util.Scanner;

/*
Programa que lee indefinidamente números enteros hasta la introducción de
un valor negativo, momento que debe finalizar el programa indicando el mayor
y menor de los números introducidos
*/
public class Ej_2 {
    public static void main(String[] args) {
        
        int num = 0;
        int mayor;
        int menor;
        // Inicalizamos menor y mayor a 0
        menor = mayor = num;
        
        Scanner entrada = new Scanner(System.in);
        
        // Se ejecuta mientras el numero introducido no sea menor que 0
        while (num >= 0) {            
            System.out.print("Introduce un num:");
            num = entrada.nextInt();
            // Si el numero introducido es mayor lo guardamos
            if (num > mayor)
                mayor = num;
            // Si el numero introducido es menor lo guardamos
            if (num < menor)
                menor = num;
        }
        System.out.println("Num menor: "+menor+", Num mayor: "+mayor);
    } // Main
} // Class
