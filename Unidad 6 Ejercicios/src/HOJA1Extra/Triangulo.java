package HOJA1Extra;

public class Triangulo extends Figura {
    private double lado;

    public Triangulo() {
        pedirDatos();
    }

    @Override
    public void pedirDatos() {
        System.out.print("Introduce el lado del triángulo equilátero: ");
        lado = getEntrada().nextDouble();
        calcularArea();
        calcularPerimetro();
    }

    @Override
    public void calcularArea() {
        setArea((Math.sqrt(3) / 4) * lado * lado);
    }

    @Override
    public void calcularPerimetro() {
        setPerimetro(3 * lado);
    }

    @Override
    public String toString() {
        return "Triángulo - " + super.toString();
    }
}