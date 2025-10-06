package HOJA2;

import java.util.ArrayList;
import java.util.Scanner;

public class Tablero {
    private Figura tablero[][];
    private ArrayList<Figura> figuras;

    public Tablero() {
        tablero = new Figura[8][8];
        figuras = new ArrayList<>();
    }

    public boolean puedeColocar(Figura nueva) {
        for (Figura f : figuras)
            if (f.amenaza(nueva) || nueva.amenaza(f)) 
                return false;
        
        return tablero[nueva.getFila()][nueva.getColumna()] == null;
    }

    public void colocarFigura(Figura f) {
        tablero[f.getFila()][f.getColumna()] = f;
        figuras.add(f);
    }

    public void imprimirTablero() {
        for (int i = 0; i < tablero[0].length; i++) {
            for (int j = 0; j < tablero[0].length; j++)
                if (tablero[i][j] == null)
                    System.out.print(". ");
                else
                    System.out.print(tablero[i][j] + " ");
            
            System.out.println();
        }
    }

    public void juego() {
        Scanner entrada = new Scanner(System.in);
        int alfilesColocados = 0;
        int torresColocadas = 0;
        int fila, col;

        // Colocación de 3 alfiles
        System.out.println("Coloca 3 alfiles:");

        while (alfilesColocados < 3) {
            System.out.println("\nAlfil " + (alfilesColocados + 1));

            System.out.print("Introduce fila: ");
            fila = entrada.nextInt();

            System.out.print("Introduce columna: ");
            col = entrada.nextInt();

            Alfil alfil = new Alfil(fila, col);

            if (puedeColocar(alfil)) {
                colocarFigura(alfil);
                alfilesColocados++;
            } else {
                System.out.println("POSICIÓN NO VÁLIDA");
            }
        }

        // Colocación de 4 torres
        System.out.println("\nColoca 4 torres:");

        while (torresColocadas < 4) {
            System.out.println("\nTorre " + (torresColocadas + 1));

            System.out.print("Introduce fila: ");
            fila = entrada.nextInt();

            System.out.print("Introduce columna: ");
            col = entrada.nextInt();

            Torre torre = new Torre(fila, col);

            if (puedeColocar(torre)) {
                colocarFigura(torre);
                torresColocadas++;
            } else
                System.out.println("POSICIÓN NO VÁLIDA");
        }

        // Mostrar tablero final
        System.out.println("\nTablero final:");
        imprimirTablero();
    }

}
