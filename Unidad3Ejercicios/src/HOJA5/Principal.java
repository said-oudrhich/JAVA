package HOJA5;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        String verbo, raiz;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introducir un verbo regular: ");
        verbo = entrada.nextLine();
        
        raiz = verbo.substring(0, verbo.length()-2);
        System.out.println("yo "+raiz+"o");
        System.out.println("tú "+raiz+"as");
        System.out.println("el "+raiz+"a");
        System.out.println("nosotros "+raiz+"amos");
        System.out.println("vosotros "+raiz+"ais");
        System.out.println("ellos "+raiz+"an");
    }// Main
}// Class
