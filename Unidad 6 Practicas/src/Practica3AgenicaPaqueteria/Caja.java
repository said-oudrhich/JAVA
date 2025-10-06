package Practica3AgenicaPaqueteria;

public class Caja extends Paquete {
    public Caja(int peso, boolean certificado) {
        super(peso, certificado);
    }

    @Override
    protected double calcularPrecio() {
        if (peso <= 150) 
            return certificado ? 20 + 6 : 20;
        if (peso <= 250) 
            return certificado ? 25 + 6 : 25;
        return certificado ? 30 + 6 : 30;
    }

    @Override
    public String toString() {
        return "TIPO: Caja, " + super.toString();
    }
}
