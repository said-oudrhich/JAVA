
package HOJA3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
                
        int numActual;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        boolean flag = true;
        
        Scanner entrada = new Scanner(System.in);
        
        while (flag) {            
            System.out.print("Introduce un num: ");
            numActual = entrada.nextInt();
        
            // Desplazar los valores hacia la izquierda
            num1 = num2;
            num2 = num3;
            num3 = num4;
            num4 = numActual;
            
            // Verificar si hay una secuencia descendente
            if ((num1 > num2) && (num2 > num3) && (num3 > num4)) {
                System.out.println("Se ha encontrado una secuencia descendente");
                flag = false;
            }
        }
    }
}

