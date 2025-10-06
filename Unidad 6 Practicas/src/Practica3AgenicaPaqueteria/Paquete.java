package Practica3AgenicaPaqueteria;

public abstract class Paquete {
    private static int contador = 1000;
    protected int id;
    protected int peso;
    protected double precio;
    protected boolean certificado;

    public Paquete(int peso, boolean certificado) {
        this.id = contador++;
        this.peso = peso;
        this.certificado = certificado;
        this.precio = calcularPrecio();
    }

    protected abstract double calcularPrecio();

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isCertificado() {
        return certificado;
    }

    public int getPeso() {
        return peso;
    }

    public String toString() {
        return "REFERENCIA: " + id + ", PESO: " + peso + "g, PRECIO: " + precio + "€, CERTIFICADO: " + certificado;
    }
}