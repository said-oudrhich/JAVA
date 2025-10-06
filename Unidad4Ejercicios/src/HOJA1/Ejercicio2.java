package HOJA1;

import java.util.Scanner;
/*
Programa que lea 10 números enteros introducidos por teclado y los
almacene en un vector. Llamamos a un método para mostrarlos en el
siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero,
etc.
*/
public class Ejercicio2 {
    public static void main(String[] args) {
       
        int vector[] = new int[10];
        rellena_vector(vector);
        
    } // Main
    
    private static void rellena_vector(int vector[]){
        
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un valor: ");
            num = entrada.nextInt();
            
            vector[i] = num;
        }
        
        imprimir(vector);
    }
    
    private static void imprimir(int vector[]){
        
        for (int i = 0; i <= vector.length/2; i++) {
            System.out.println(vector[i]+" "+vector[9-i]);
        }
    }
} // Class
