package HOJA16;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        double num1, num2;
        
        System.out.println("La suma de los numeros (3.25 , 18.37) es: " + Calculadora.sumar(3.25, 18.37));
        
        System.out.println("La resta de los numeros (100.0 , 25.75) es: " + Calculadora.resta(100.0, 25.75));
        
        num1 = leerNum();
        num2 = leerNum();
        
        System.out.println("La multiplicacion de los numeros (" + num1 + ", " + num2 + ") es: " + Calculadora.multiplica(num1, num2));

        num1 = leerNum();
        num2 = leerNum();
        
        System.out.println("La division de los numeros (" + num1 + ", " + num2 + ") es: " + Calculadora.division(num1, num2));
        
        System.out.println("El resto de los numeros (1000, 250) es: " + Calculadora.resto(1000, 250));
        
        System.out.println("La resultado de la formula (a^b)^c es: " + Calculadora.elevado(2, 3, 2));

        System.out.println("El factoria del 10 es: " + Calculadora.factorial(10));
    }
    
    private static double leerNum() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un num real: ");
        return entrada.nextDouble();
    }
}
