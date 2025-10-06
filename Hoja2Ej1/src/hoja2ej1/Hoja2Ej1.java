package hoja2ej1;

import java.util.Scanner;

public class Hoja2Ej1 {
    public static void main(String[] args) {
        
        int num;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un num: ");
        num = entrada.nextInt();
        
        while (num <= 0 || num > 9) {
            System.out.print("Introduce un num: ");
            num = entrada.nextInt();  
        }
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(num);
            }
            System.out.println("");
        }
    }
}
