package HOJA18;
import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Tablero tablero = new Tablero();
        int posicion = 0; // Posición inicial del jugador
        int meta = 41;
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int nuevaPosicion;

        System.out.println("\n¡Comienza el Juego de la Oca!\n");

        while (posicion < meta) {
            System.out.println("Presiona ENTER para tirar el dado...");
            entrada.nextLine();

            int dado = random.nextInt(6) + 1; // Generar número entre 1 y 6
            System.out.println("Has sacado un " + dado);

            nuevaPosicion = posicion + dado;

            // Obtener la casilla a la que se moverá
            Casilla casilla = tablero.getCasilla(nuevaPosicion);
            posicion = nuevaPosicion;

            // Comprobar si es una casilla especial
            if (casilla.getTipo().equals("muerte")) {
                System.out.println("Caíste en una casilla de muerte. Vuelves al inicio.");
                posicion = 0;
            } else if (casilla.getTipo().equals("oca")) {
                System.out.println("¡De oca en oca y tiro porque me toca! Avanzas a la casilla " + casilla.getSiguiente());
                posicion = casilla.getSiguiente();
            }

            System.out.println("Ahora estás en la casilla " + posicion + "\n");
        }

        System.out.println("¡Felicidades! Has llegado a la meta.");
    }

}
