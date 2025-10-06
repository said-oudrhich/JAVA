package ejercicio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        double m,n;
        
        //Llamamos al metodo 2 veces para guardar el valor para m y n
        m = leerNumero();
        n = leerNumero();
        
        //Se compruba que compla las condiciones
        if (m > n && n > 0)
            //Si cumple las condiciones imprime el resultado
            //Llama al metoodo para calcular el combinatorio lo imprimimos con un casting para que no salgan los decimales
            System.out.println("Resultado = "+(int)calcularCombinatorio(m, n));
        else 
            // Si no cumple las condiciones
            System.out.println("No cumple las condiciones");
    }
    
    //**************************************************************************
    
    //Lee por pantalla 
    private static double leerNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        return entrada.nextDouble();
    }
    
    //**************************************************************************
    
    //Metodo que devuelve el valor  
    private static double calcularCombinatorio(double m, double n){
        
        double factorialM, factorialN, factorialMmenosN;
        //Formula para un calcular combinatorio: m! / (n! * (m - n)!)
        factorialM = factorial(m); // llama al metodo para calcular el factorial de m
        factorialN = factorial(n); // llama al metodo para calcular el factorial de n
        factorialMmenosN = factorial(m - n); // llama al metodo para calcular el factorial de (m - n)
        
        //Devolvemos el resultado calculandolo direcctamente
        return factorialM / (factorialN * factorialMmenosN); // m! / (n! * (m - n)!)
    }
    
    //**************************************************************************
    
    //Metodo para calcular el factorial de un numero
    private static double factorial(double numero){
        
        double resultado = 1; //1 ya que empieza multiplicando por 1
        
        // Formula para calcular el factorial 5! = 5*4*3*2*1
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        
        return resultado;
    }
}
