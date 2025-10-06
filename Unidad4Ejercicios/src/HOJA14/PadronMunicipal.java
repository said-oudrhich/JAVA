package HOJA14;

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
        int codigoPostal = entrada.nextInt();

        System.out.print("Ingrese su teléfono: ");
        String telefono = entrada.nextLine();

        System.out.print("Ingrese su DNI: ");
        String dni = entrada.nextLine();

        System.out.print("Ingrese su día de nacimiento: ");
        int diaNacimiento = entrada.nextInt();

        System.out.print("Ingrese su mes de nacimiento: ");
        int mesNacimiento = entrada.nextInt();

        System.out.print("Ingrese su año de nacimiento: ");
        int anioNacimiento = entrada.nextInt();
        entrada.nextLine(); // Limpiar buffer

        System.out.print("Ingrese su email: ");
        String email = entrada.nextLine();

        // Comprueba si es correcto el DNI
        if(Persona.comprobarDni(dni)){
            Persona persona = new Persona(nombre, apellidos, direccion, codigoPostal, telefono, dni, diaNacimiento, mesNacimiento, anioNacimiento, email);
            System.out.println("Persona empadronada correctamente:");
            persona.setDireccion("Calle Sol, 16");
            persona.setCodigoPostal(28680);
        }else{
            System.out.println("El dni es incorrecto");
        }

    }
}
