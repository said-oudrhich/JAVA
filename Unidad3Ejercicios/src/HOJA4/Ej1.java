package HOJA4;

import java.util.Scanner;

/*
    Programa que visualiza los números primos desde el 1 hasta un valor introducido por el
    usuario.
*/

public class Ej1 {
    public static void main(String[] args) {
        
        int num;
        int divisor = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el numero tope: ");
        num = entrada.nextInt();
        
        for (int i = 1; i <= num; i++) { // Se calcula hasta llegar al numero introducido por pantalla
            
            divisor = 0; // Se vuelve a poner a 0 para poder calcular el siguiente i
            // Para cada num de i se busca sus divisores y se va sumando j
            for (int j = 1; j <= i; j++) {
                if ((i % j) == 0) {
                    divisor++;
                }
            }
            // cada vez que calcula todos los posibles divisores, si divisor = 2 es primo
            if (divisor == 2) { // Un numero es primo si solo tiene 2 divisores
                System.out.println("El número "+i+" es primo");    
            }
        }
        
    } // Main
} // Class