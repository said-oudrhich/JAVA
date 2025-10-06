package Principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        int array[] = new int[10];
        rellenarArray(array);
        Imprimir(array);
    } // Main
    
    //**************************************************************************
    
    private static void rellenarArray(int array[]){
        
        Scanner entrada = new Scanner(System.in);
        
        int flag = 0;
        int num = 0;
        
        while (flag < 10) {
            System.out.print("Introduce un número: ");
            num = entrada.nextInt();
            
            if (num == 0) 
                System.out.println("El num 0 no es valido");
            else 
                if (compruebaNumEnArray(array, num)) 
                    System.out.println("El numero introducido esta en el array, no se va apuntar");
                
                else{
                    array[flag] = num; //Agrega el número al array 
                    System.out.println("El numero " + num + " se ha introducido en el array");
                    flag++;
                }
            }
    }
    
    //**************************************************************************

    private static boolean compruebaNumEnArray(int array[], int num){
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                return true;
            }
        }
        return false;
    }
    
    //**************************************************************************
    
    private static void Imprimir(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // Imprime con espacio
        }
    }
    
} // Class
