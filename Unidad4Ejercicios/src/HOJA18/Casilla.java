package HOJA18;

public class Casilla {
    private int numero;
    private String tipo;  // "normal", "oca", "muerte"
    private int siguiente; // Si es oca, indica la próxima oca. Si es muerte, es 0.

    public Casilla(int numero, String tipo, int siguiente) {
        this.numero = numero;
        this.tipo = tipo;
        this.siguiente = siguiente;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public int getSiguiente() {
        return siguiente;
    }
}
