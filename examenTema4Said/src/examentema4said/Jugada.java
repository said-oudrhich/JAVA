package examentema4said;

public class Jugada {
    private char[][] matriz;  // Matriz 3x3 para la jugada
    private int aciertos;     // Número de tres en raya encontrados

    // Constructor
    public Jugada() {
        matriz = new char[3][3];
        aciertos = 0;
        rellenarMatriz();
        comprobarTresEnRaya();
    }

    // Método para rellenar la matriz con 'x' o '.' aleatoriamente
    private void rellenarMatriz() {
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < 3; j++)
                matriz[i][j] = (Math.random() < 0.5) ? 'x' : '.';
    }

    // Método para comprobar cuántos tres en raya hay
    private void comprobarTresEnRaya() {
        // Comprobar filas
        for (int i = 0; i < 3; i++)
            if (matriz[i][0] == 'x' && matriz[i][1] == 'x' && matriz[i][2] == 'x')
                aciertos++;

        // Comprobar columnas
        for (int j = 0; j < 3; j++)
            if (matriz[0][j] == 'x' && matriz[1][j] == 'x' && matriz[2][j] == 'x')
                aciertos++;

        // Comprobar diagonales
        if (matriz[0][0] == 'x' && matriz[1][1] == 'x' && matriz[2][2] == 'x')
            aciertos++;
        if (matriz[0][2] == 'x' && matriz[1][1] == 'x' && matriz[2][0] == 'x')
            aciertos++;
    }

    // Método para imprimir la matriz
    public void imprimirMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matriz[i][j] + " ");
            System.out.println();
        }
    }

    // Método para obtener el número de aciertos
    public int getAciertos() {
        return aciertos;
    }

    // Método para comparar dos jugadas y devolver la que tiene más aciertos
    public static Jugada mayorDeDos(Jugada j1, Jugada j2) {
        int aciertos1 = j1.contarTresEnRaya();
        int aciertos2 = j2.contarTresEnRaya();

        if (aciertos1 > aciertos2) return j1;
        if (aciertos2 > aciertos1) return j2;
        return null; // Indica que tienen la misma cantidad de aciertos
    }
}
