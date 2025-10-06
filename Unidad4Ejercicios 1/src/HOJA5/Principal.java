package hoja5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        int loteria[][] = new int[numLoterias()][7];
        generarApuesta(loteria);

    } // Main
    
    //**************************************************************************
    
    private static int numLoterias(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el número de apuestas que quieres generar: ");
        return entrada.nextInt();
    }
    
    //**************************************************************************
    
     // Método para generar y mostrar una apuesta
    private static void generarApuesta(int loteria[][]){

        //Se ejecuta tantas veces como haya pedido el usuario
        for (int i = 0; i < loteria.length; i++) { 
            
            //Rellena la posicion 0 en un num aleatorio entre 0 y 9
            loteria[i][0] = (int) (Math.random()*10);
            
            int numero = 0;
            // Rellena el array de la posicion 1 a la 5 de num aleatorios entre 49 - 1
            for (int j = 1; j < loteria[0].length; j++) { 
                loteria[i][j] = (int) (Math.random()*49 + 1);
                                
                if (loteria[i][j] == numero) {
                    
                }
            }
        }
        
        //Imprime las apuestas
        System.out.println("Tus apuestas son:");
        
        for (int i = 0; i < loteria.length; i++) {
            for (int j = 1; j < loteria[0].length; j++) 
                System.out.print(loteria[i][j]+", ");
            
            System.out.print("reintegro "+loteria[i][0]);
            System.out.println("");
        }
    }
    
} // Class
