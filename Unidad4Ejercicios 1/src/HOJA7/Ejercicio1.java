package hoja7;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int array[][] = new int[5][5];
        int num;
        
        rellenarArray(array);
        
        System.out.print("Introduce un numero: ");
        num = entrada.nextInt();
        
        System.out.println("El valor de que has introducido aparece "+sustituirValores(array, num)+" veces");
        
    } //Main
    
    //**************************************************************************
    
    private static void rellenarArray(int array[][]){
        for (int i = 0; i < array.length; i++) {
            array[i][0] = (int) ((Math.random()*10)+1);
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) ((Math.random()*10)+1);
            }
        }
    }
    
    //**************************************************************************
    
    private static int sustituirValores(int array[][], int num){
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
               
                if(array[i][j] == num){
                    array[i][j] = -1;
                    contador++;
                }
            }
            
        }
        
        return contador;
    }
    
} //Class 
