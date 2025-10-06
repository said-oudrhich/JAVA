package apiString;

import java.util.Scanner;

public class claseString {
    public static void main(String[] args) {
        
        String nombre = "como mola Java";
        String cadena = "como mola Java";
        
        Scanner entrada = new Scanner(System.in);
        String email = "pepito.ruiz@yahoo.es";
        
        int l;
        l = nombre.length();
        System.out.println(l);
        // Muestra el total de caracteres que hay en la variable nombre
        System.out.println(nombre.length());
        
        System.out.println("La cadena "+nombre+" tiene "+nombre.length()+" caracteres");
        // Imprime el valor 0 e 1 de la cadena nombre
        System.out.println(nombre.charAt(0));
        System.out.println(nombre.charAt(1));
        
        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
        }
        
        // Para comparar cadenas
        if (nombre.equals(cadena))
            System.out.println("Son iguales");
        else
            System.out.println("son diferentes");
        
        // Imprime en mayuscula 
        System.out.println(nombre.toUpperCase());
        
        //Imprimir el ultimo caracter de una cadena
        System.out.println(nombre.charAt(nombre.length() - 1));
        
        System.out.print("Introduce un texto: ");
        nombre = entrada.nextLine();
        System.out.println(nombre);
        System.out.println(nombre.charAt(nombre.length() - 1));
        
        // Extraer subcadenas
        boolean correcto = false;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@'){
                correcto = true;
            }
        }
        if (correcto == true) 
            System.out.println("email correcto");
        else
            System.out.println("email incorrecto");
        
        
        // Dividir cadena
        System.out.println(email.substring(12));
        System.out.println(email.substring(0, 11));
    }// Main
}// Class
