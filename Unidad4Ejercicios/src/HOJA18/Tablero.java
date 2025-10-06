package HOJA18;

public class Tablero {
    private Casilla[] casillas = new Casilla[42];
    private int[] ocas = {3, 13, 20, 31};  // Posiciones fijas de ocas
    private int[] muerte = {8, 9, 24, 30, 38}; // Posiciones fijas de muerte

    public Tablero() {
        // Inicializamos todas las casillas como "normal"
        for (int i = 0; i < 42; i++) {
            casillas[i] = new Casilla(i, "normal", i);
        }

        // Asignar casillas "muerte"
        for (int pos : muerte) {
            casillas[pos] = new Casilla(pos, "muerte", 0);
        }

        // Asignar casillas "oca"
        for (int i = 0; i < ocas.length - 1; i++) {
            casillas[ocas[i]] = new Casilla(ocas[i], "oca", ocas[i + 1]);
        }
        // La última oca no salta a ningún lado
        casillas[ocas[ocas.length - 1]] = new Casilla(ocas[ocas.length - 1], "oca", ocas[ocas.length - 1]);
    }

    public Casilla getCasilla(int posicion) {
        return casillas[posicion];
    }
}