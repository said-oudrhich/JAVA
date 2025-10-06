package Teoria2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int temp[][] = new int[31][2];
        
        int dia, tempMin, tempMax;
        
        System.out.print("Dime el dia: ");
        dia = entrada.nextInt();
        
        System.out.print("Dime la temperatura máxima: ");
        tempMax = entrada.nextInt();
        
        System.out.print("Dime la temperatura mínima: ");
        tempMin = entrada.nextInt();
        
        temp[dia-1][0] = tempMin;
        temp[dia-1][1] = tempMax;
        
        for (int fila = 0; fila < temp.length; fila++) {
            
            //for (int colum = 0; colum < temp[0].length; colum++) {
            //    temp[fila][colum] = (int) (Math.random()*15);
            //}
            temp[fila][0] = (int) (Math.random()*3+1);
            temp[fila][1] = (int) (Math.random()*15+4);
        }
        visualizar(temp);
    } // Main
    
    
    private static void visualizar(int temp[][]){
        
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                System.out.print(temp[i][j]+" ");
            }
            System.out.println("");
        }
    }
} // Class
