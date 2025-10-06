package hoja7;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        int matriz[][] = new int[pedirPorPantalla()][pedirPorPantalla()];
        rellenarCruz(matriz);
        imprimir(matriz);
    }
    
    //**************************************************************************

    private static int pedirPorPantalla(){
        
        Scanner entrada = new Scanner(System.in);
        int num;
        
        
        do {            
            System.out.print("Introduce un num impar de un digito: ");
            num = entrada.nextInt();
            if (num % 2 == 0) 
                System.out.println("El número ingresado no es impar."); 
            
        } while (((num % 2) == 0) || (num >= 10) || (num < 0));
        
        System.out.println("Se ha introducido el numero "+num);
        return num;
        
    }
    
    //**************************************************************************
    
    private static void rellenarCruz(int matriz[][]){
        
        int filaCentral = matriz.length / 2; 
        int columnaCentral = matriz[0].length / 2;
        
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][columnaCentral] = '*';
        }
        
        for (int j = 0; j < matriz[0].length; j++) {
            matriz[filaCentral][j] = '*';
        }
    
    }
    
    //**************************************************************************
    
    private static void imprimir(int matriz[][]){
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == '*') {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");

            }
            System.out.println("");
        }
        
    }
}