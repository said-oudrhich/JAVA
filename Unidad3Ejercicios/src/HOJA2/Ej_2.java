package HOJA2;

import java.util.Scanner;

/*
    Algoritmo que lea un número entero (altura) y a partir de él cree una
    escalera de asteriscos con esa altura. Deberá quedar así si ponemos una
    altura de 5.
 */

public class Ej_2 {
    public static void main(String[] args) {
        
        int altura;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce altura: ");
        altura = entrada.nextInt();
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; i >= j; j++) {
                System.out.print("*");
            }
        System.out.println("");
        }
    }
}
