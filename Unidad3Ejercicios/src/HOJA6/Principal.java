package HOJA6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        String palabra;
        String frase;
        int contador = 0;
        
        //Ejercicio 1
        System.out.print("Introduce una palabra: ");
        palabra = entrada.nextLine();
        
        for (int i = 0; i < palabra.length()-1; i++) {
            System.out.print(palabra.charAt(i)+"-");
        }
        System.out.print(palabra.charAt(palabra.length()-1));
        System.out.println("");
        
        
        
        //Ejercicio2
        System.out.print("Introduce una frase: ");
        frase = entrada.nextLine();
        
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            
            if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'e') || 
                (frase.charAt(i) == 'i') || (frase.charAt(i) == 'o') || 
                (frase.charAt(i) == 'u')){
                contador += 1;
            }
        }
        System.out.println("Hay "+contador+" vocales");
    }// Main
}// Class
