
package hoja2ej2;

import java.util.Scanner;

public class Hoja2Ej2 {
    public static void main(String[] args) {
        
        int altura;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce altura: ");
        altura = entrada.nextInt();
        
        for (int i = 0; i <= altura; i++) {
            for (int j = 1; i >= j; j++) {
                System.out.print("*");
            }
        System.out.println("");
        }
    }
    
}
