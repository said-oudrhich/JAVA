package numPrimo;
// Leer un numero entero [1..1000] y decir si es primo
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        int numDivisores = 0;
        int num;
        int divisor;
        
        System.out.println("Introduce un numero: ");
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();
        
        // Pide de nuevo el num si no cumple con las condiciones
        while ((num < 1) || (num > 1000)) {
            System.out.print("Introduce un numero en el rango [1..1000]: ");
            num = entrada.nextInt();
        }
        
        divisor = 1;
        while (divisor <= num) {
            if (num % divisor == 0) {
                numDivisores++;
            }
            divisor++;
        }
        
        // Un número es primo si tiene exactamente 2 divisores: 1 y el mismo número
        if (numDivisores == 2) {
            System.out.println("El numero " + num + " es primo.");
        } else {
            System.out.println("El numero " + num + " no es primo.");
        }
        
    }
}
