package Practica3AgenicaPaqueteria;

class Sobre extends Paquete {
    private String color;

    public Sobre(int peso, boolean certificado, String color) {
        super(peso, certificado);
        this.color = color;
    }

    @Override
    protected double calcularPrecio() {
        if (peso <= 150) 
            return certificado ? 10 + 6 : 10;
        if (peso <= 250) 
            return certificado ? 15 + 6 : 15;
        return 0; // No aplica
    }

    @Override
    public String toString() {
        return "TIPO: Sobre, " + super.toString() + ", Color: " + color;
    }
}
