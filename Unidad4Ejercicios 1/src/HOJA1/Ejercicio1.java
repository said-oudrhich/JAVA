package HOJA1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int tamano = 0, vector[], num;
        
        System.out.print("Introduce el tamaño del vector: ");
        tamano = entrada.nextInt();
        vector = new int[tamano];
        
        System.out.print("Introduce el número para generar sus múltiplos: ");
        num = entrada.nextInt();
        
        rellenamos(tamano, vector, num);
        
    } // Main
    
    //**************************************************************************
    
    private static void rellenamos(int tamano, int vector[], int num){
        
        for (int i = 0; i < tamano; i++) {
            vector[i] = num * (i+1);
        }
        
        imprimir(vector);
    }
    
    //**************************************************************************

    private static void imprimir(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
} // Class