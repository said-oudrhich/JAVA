package HOJA2;

public class Figura {
    private int fila;
    private int columna;
    private String nombre;

    public Figura(int fila, int columna, String nombre) {
        this.fila = fila;
        this.columna = columna;
        this.nombre = nombre;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean amenaza(Figura otra) {
        return false; // será sobreescrito
    }

    public String toString() {
        return nombre.substring(0, 1); // A o T
    }
}
