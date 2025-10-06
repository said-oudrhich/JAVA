package examenTema2Said;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        // Creo los usuarios 1 y 2
        Usuario usuario1 = new Usuario("Mortadelo", "r2d2", 30, 11);
        Usuario usuario2 = new Usuario("Filemón", 30, 6);
        
        // Inicializo las variables que voy a utilizar
        String nomUs3;
        String passUs3;
        int diaCadUs3;
        int mesCadUs3;
        String passUs2; // Variable de lectura de contraseña por pantalla
        
        //Pido por pantalla los datos para crear el usuario 3
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el usuario: ");
        nomUs3 = entrada.nextLine();
        
        System.out.println("Introduce la password: ");
        passUs3 = entrada.nextLine();
        
        System.out.println("Introduce el día de caducidad: ");
        diaCadUs3 = entrada.nextInt();
        
        System.out.println("Introduce el mes de caducidad: ");
        mesCadUs3 = entrada.nextInt();
        
        // Creo el usuario con las variables anteriores
        Usuario usuario3 = new Usuario(nomUs3, passUs3, diaCadUs3, mesCadUs3);
        
        System.out.println("---------------------------------------------------------------------");
        
        // Muestro los datos de los tres usuarios
        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);
        
        System.out.println("---------------------------------------------------------------------");
        
        // Llamo al método credo anteriormente para poder cambiar la contraseña
        System.out.println("Introduce la password del usuario2: ");
        passUs2 = entrada.next();
        usuario2.setPassword(passUs2);
        
        System.out.println("---------------------------------------------------------------------");
        
        // Pido al usuario 1 los getters de día y mes
        System.out.println("Día que caduca usuario1 = "+usuario1.getDiaCaduca());
        System.out.println("Mes que caduca usuario1 = "+usuario1.getMesCaduca());
        
        System.out.println("---------------------------------------------------------------------");
        
        // Llamo al método comprobar con el usuario1 pasandole por páramentro el día y mes de los ejemplos
        usuario1.comprobar(31, 12);
        usuario1.comprobar(31, 10);

        System.out.println("---------------------------------------------------------------------");
        
        // Muestro de nuevo los usuario para ver los cambios
        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);
        
    } // Main
} // Class
