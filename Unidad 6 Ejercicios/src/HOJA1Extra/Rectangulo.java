package HOJA1Extra;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo() {
        pedirDatos();
    }

    @Override
    public void pedirDatos() {
        System.out.print("Introduce la base del rectángulo: ");
        base = getEntrada().nextDouble();
        System.out.print("Introduce la altura del rectángulo: ");
        altura = getEntrada().nextDouble();
        calcularArea();
        calcularPerimetro();
    }

    @Override
    public void calcularArea() {
        setArea(base * altura);
    }

    @Override
    public void calcularPerimetro() {
        setPerimetro(2 * (base + altura));
    }

    @Override
    public String toString() {
        return "Rectángulo - " + super.toString();
    }
}