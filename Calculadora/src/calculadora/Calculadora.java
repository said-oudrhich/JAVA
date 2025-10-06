import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
    	// Solicitar números al usuario
    	System.out.print("Introduce el primer número: ");
    	double numero1 = Util.leerNumero();

    	System.out.print("Introduce el segundo número: ");
    	double numero2 = Util.leerNumero();

    	// Mostrar opciones al usuario
    	System.out.println("\nElige una operación:");
    	System.out.println("1. Suma");
    	System.out.println("2. Resta");
    	System.out.println("3. Multiplicación");
    	System.out.println("4. División");
    	System.out.print("Introduce el número de la operación que deseas realizar: ");

    	int opcion = (int)Util.leerNumero();
    	double resultado;

    	// Realizar la operación seleccionada
    	switch (opcion) {
        	case 1:
            	resultado = numero1 + numero2;
            	System.out.println("El resultado de la suma es: " + resultado);
            	break;
        	case 2:
            	resultado = numero1 - numero2;
            	System.out.println("El resultado de la resta es: " + resultado);
            	break;
        	case 3:
            	resultado = numero1 * numero2;
            	System.out.println("El resultado de la multiplicación es: " + resultado);
            	break;
        	case 4:
            	if (numero2 != 0) {
                	resultado = numero1 / numero2;
                	System.out.println("El resultado de la división es: " + resultado);
            	} else {
                	System.out.println("Error: No se puede dividir entre cero.");
            	}
            	break;
        	default:
            	System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 4.");
    	}
	}
}