package HOJA1Extra;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado() {
        pedirDatos();
    }

    @Override
    public void pedirDatos() {
        System.out.print("Introduce el lado del cuadrado: ");
        lado = getEntrada().nextDouble();
        calcularArea();
        calcularPerimetro();
    }

    @Override
    public void calcularArea() {
        setArea(lado * lado);
    }

    @Override
    public void calcularPerimetro() {
        setPerimetro(4 * lado);
    }

    @Override
    public String toString() {
        return "Cuadrado - " + super.toString();
    }
}