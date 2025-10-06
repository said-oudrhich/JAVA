package HOJA7;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String direccion_entera, nombre = "", dominio = "";
        
        System.out.print("Introduce dirección de email: ");
        direccion_entera = entrada.nextLine();
        
        // Llamo al metodo correo con el parametro que le pido por pantalla me reorna true o false
        if (correo(direccion_entera)){
            System.out.println("Dirección: Correcta");
        }
        else
            System.out.println("Dirección: Incorrecta");
        
    }
    
    //Devolvera usuario
    private static boolean correo (String correo){
        //Comprueba si el primer dígito es un numero
        if (Character.isDigit(correo.charAt(0))) {
            return false;
        }
        
        int indiceArro = -1; // Empieza en -1 por que los num positivos estan ocupados por el tamño del String
        // El for empieza en 1 ya que se a comprobado que el primer dig no es digito
        for (int i = 1; i < correo.length(); i++) {
            // Comprueba que solo se hayan introducido letras min, . y digitos
            if(!(correo.charAt(i) == '.' || Character.isLowerCase(correo.charAt(i)) || Character.isDigit(correo.charAt(i)) || correo.charAt(i) == '@')){
                return false;
            }
            
            // Guarda posicion del @
            if (correo.charAt(i) == '@'){
                indiceArro = i;
            }
        }
        // Comprueba si ha cambiado el indice por que no ha encontrado el @ en el for
        if (indiceArro == -1){
           return false;
        }
        
        String nombre, dominio;
        
        nombre = correo.substring(0, indiceArro);
        dominio = correo.substring(indiceArro+1);
        System.out.println("Usuario: "+nombre);
        System.out.println("Dominio: "+dominio);
        return true;
    }
    
}