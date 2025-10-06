package HOJA16;
public class Calculadora {
    
    public static double sumar(double num1, double num2){
        return num1 + num2;
    }
    
    public static double resta(double num1, double num2){
        return num1 - num2;
    }
    
    public static double multiplica(double num1, double num2) {
        return num1 * num2;
    }
    
    public static double division(double num1, double num2) {
        return num1 / num2;
    }
    
    public static double resto(double num1, double num2) {
        return num1 % num2;
    }
    
    public static int elevado(int a, int b, int c) {
        return (int)Math.pow(Math.pow(a, b),c);
    }
    
    public static int factorial(int num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
