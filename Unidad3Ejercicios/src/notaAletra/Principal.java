package notaAletra;

// Se desea desarrollar un programa que lea una nota (calificación) como número entero y lo pase a letra

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
       
        int nota;
        
        System.out.println("Dime tu nota:  ");
        Scanner entrada = new Scanner(System.in);
        nota = entrada .nextInt();
        
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Aprobado");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
                System.out.println("Sobresaliente");
                break;
            case 10:
                System.out.println("MH");
                break;
            default:
                System.out.println("Error");
        }
    }
}
