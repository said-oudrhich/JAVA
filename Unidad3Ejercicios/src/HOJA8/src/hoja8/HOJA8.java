package hoja8;

import java.util.Scanner;

public class HOJA8 {
    
    public static void main(String[] args) {

        switch (menu()) {
            case 1:
                System.out.println("El area del Circulo es: "+circulo());
                break;
            case 2:
                System.out.println("El area del Cuadrado es: "+cuadrado());
                break;
            case 3:
                System.out.println("El area del Triangulo es: "+triangulo());
                break;
            default:
                throw new AssertionError();
        }
        
    }// Main
    
    //************************************************************************************
    
    //Menú
    public static int menu(){
        Scanner entrada = new Scanner(System.in);
        int respuesta;

        do {
            System.out.println("Introduce el num de la figura para calcular su area");
            System.out.println("1. Circulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triangulo");
            System.out.print("Respuesta: ");
            respuesta = entrada.nextInt();
        } while (respuesta < 0 || respuesta >3);
        return (respuesta);
    }
    
    //************************************************************************************

    //Circulo : (radio2)*PI
    public static double circulo(){
        Scanner entrada = new Scanner(System.in);
        double radio;
        
        System.out.print("Introduce el radio: ");
        radio = entrada.nextDouble();
        
        return ((radio * radio) * Math.PI);
    }
    
    //************************************************************************************

    //Cuadrado : lado * lado
    public static int cuadrado(){
        Scanner entrada = new Scanner(System.in);
        int lado;
        
        System.out.print("Introduce el lado del cuadrado: ");
        lado = entrada.nextInt();
        
        return (lado * lado);
    }

    //************************************************************************************

    //Triangulo : (base * altura) / 2
    public static int triangulo(){
        Scanner entrada = new Scanner(System.in);
        int base, altura;
        
        System.out.print("Introduce la base del Triangulo: ");
        base = entrada.nextInt();
        System.out.print("Introduce la altura del Triangulo: ");
        altura = entrada.nextInt();
        return ((base * altura) / 2);
    }
    
}// Class
