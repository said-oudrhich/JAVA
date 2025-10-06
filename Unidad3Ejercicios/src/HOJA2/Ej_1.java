package HOJA2;

import java.util.Scanner;

/*
    Realizar un programa escrito en pseudocódigo, que, dado un valor introducido por el
    usuario comprendido entre 1 y 9 debe dibujar:
 */
public class Ej_1 {
        public static void main(String[] args) {
        
        int num;
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un num: ");
        num = entrada.nextInt();
        
        while (num <= 0 || num > 9) {
            System.out.print("Introduce un num: ");
            num = entrada.nextInt();  
        }
        
        for (int i = 1; i < num; i++) {
            for (int j = 1; j < num; j++) {
                System.out.print(num);
            }
            System.out.println("");
        }
    }
}
