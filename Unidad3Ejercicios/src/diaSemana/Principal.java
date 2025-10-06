package diaSemana;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        int diaSemana;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el dia de la semana:  ");
        diaSemana = entrada.nextInt();
        
        switch (diaSemana) {
            case 1:
                System.out.println("Comienzo de la semana");
                break;
            case 2,3,4:
                System.out.println("Mediados de semana");
                break;
            case 5:
                System.out.println("Se acerca el finde");
                break;
            case 6:
                System.out.println("El mejor día");
                break;
            case 7:
                System.out.println("Manaña otra vez programación");
                break;
            default:
                System.out.println("Valor invalido");
        }
        
    } // Main
}// Class
