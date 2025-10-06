package numAlreves;
// Visualizar números de 4 cifras al revés

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce un número de 4 CIFRAS: ");
        num = entrada.nextInt();
        
        // Se ejecuta mientras el numero no se de 4 digitos
        while ((num <= 999) || (num >= 9999)){
            System.out.print("Introduce un número de 4 CIFRAS: ");
            num = entrada.nextInt();
        }
        
        // Imprime los digitos de atras alante
        while (num > 0){
            System.out.println(num % 10);
            num = num / 10;    
        }
        
    } // Main
} // Class
