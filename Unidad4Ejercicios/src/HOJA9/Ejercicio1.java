package hoja9;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Definimos una matriz cuadrada de 4x4
        int matriz[][] = new int[4][4];

        System.out.println("Introduce los elementos de la matriz 4x4 (16 números):");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostramos los resultados
        System.out.println("La matriz introducida " + (esMatrizSimetrica(matriz) ? "no es" : "es") + " simétrica.");
        System.out.println("La suma de la diagonal principal es: " + calcularSumaDiagonalPrincipal(matriz));

    } //Main
    
    
    private static boolean esMatrizSimetrica(int matriz[][]){
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    
    }
    
    private static int calcularSumaDiagonalPrincipal(int matriz[][]) {
        
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
        
    }
} //Class