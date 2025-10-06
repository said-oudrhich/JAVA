package examentema4said;

public class Principal {
    public static void main(String[] args) {
        // Crear un array de 5 jugadas
        Jugada[] jugadas = new Jugada[5];
        int totalAciertos = 0;

        // Generar y mostrar las jugadas
        for (int i = 0; i < jugadas.length; i++) {
            jugadas[i] = new Jugada();
            System.out.println("Soy la Jugada: " + (i + 1));
            System.out.println("He encontrado: " + jugadas[i].getAciertos() + " TRES EN RAYA");
            jugadas[i].imprimirMatriz();
            System.out.println("-------------------");
            totalAciertos += jugadas[i].getAciertos();
        }

        // Imprimir el total de tres en raya encontrados
        System.out.println("TOTAL TRES EN RAYA ENCONTRADOS: " + totalAciertos);

        // Comparar las dos últimas jugadas
        Jugada mejor = Jugada.mayorDeDos(jugadas[numJugadas - 2], jugadas[numJugadas - 1]);

        System.out.println("Comparación entre las dos últimas jugadas:");
        if (mejor == null) {
            System.out.println("Ambas jugadas tienen el mismo número de aciertos.");
        } else {
            System.out.println("La mejor jugada entre las dos últimas es:");
            mejor.imprimirMatriz();
        }
    }
}
