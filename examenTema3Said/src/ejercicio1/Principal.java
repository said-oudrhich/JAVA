package ejercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n;
        
        //Preguntamos por pantalla
        System.out.print("Introduce el valor para N: ");
        n = entrada.nextInt();
        
        // Se comprueba que el numero N cumple con las condiciones
        if (n >= 1 && n <= 9) {
            //Si las culple llamamos la metodo indicandole el numero
            piramide(n);
        }
        else // Si no cumple las condiciones se imprime el aviso
            System.out.println("El número introducido no cumple las condiciones");
    }
    
    //**************************************************************************
    
    //Metodo para imprimir piramide
    private static void piramide (int n){
        //Recorre todos los numeros empieza en 1 por que es la restriccion que se le a puesto anteriormente
        for (int i = 1; i <= n; i++) {
            
            //Sirve para dejar los espacios de al principio
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            
            //Imprime los numeros en ascendente
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            //Imprime los numero en descendente
            //se le pone el -1 para que no imprima el numero n otra vez
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
            //Saltos de linea
            System.out.println("");
        }
    }
}
