package awd;

import java.util.Scanner;

public class PadronMunicipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese sus apellidos: ");
        String apellidos = entrada.nextLine();

        System.out.print("Ingrese su dirección: ");
        String direccion = entrada.nextLine();

        System.out.print("Ingrese su código postal: ");
        String codigoPostal = entrada.nextLine();

        System.out.print("Ingrese su teléfono: ");
        String telefono = entrada.nextLine();

        System.out.print("Ingrese su DNI: ");
        String dni1 = entrada.nextLine();

        System.out.print("Ingrese su día de nacimiento: ");
        int diaNacimiento = entrada.nextInt();
        entrada.nextLine(); // Limpiar buffer

        System.out.print("Ingrese su mes de nacimiento: ");
        int mesNacimiento = entrada.nextInt();
        entrada.nextLine(); // Limpiar buffer

        System.out.print("Ingrese su año de nacimiento: ");
        int anioNacimiento = entrada.nextInt();
        entrada.nextLine(); // Limpiar buffer

        System.out.print("Ingrese su email: ");
        String email = entrada.nextLine();

        if (Persona.comprobarDni(dni1)) {
            Persona persona = new Persona(nombre, apellidos, direccion, codigoPostal, telefono, dni1, diaNacimiento, mesNacimiento, anioNacimiento, email);
            System.out.println("\nPersona empadronada correctamente:");
        } else {
            System.out.println("El DNI es incorrecto");
        }
    }
}
