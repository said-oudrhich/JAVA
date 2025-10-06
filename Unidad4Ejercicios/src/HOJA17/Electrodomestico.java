package hoja17;

public class Electrodomestico {

    private String nombre;
    private String marca;
    private int precioBase;
    private String color;
    private char consumoEnerg;
    private int peso;

    // Valores predeterminados
    public Electrodomestico() {
        this.color = "blanco";
        this.consumoEnerg = 'F';
        this.peso = 0;
    }

    //**************************************************************************

    public Electrodomestico(String nombre, String marca, int precioBase) {
        this.nombre = nombre;
        this.marca = marca;
        this.precioBase = precioBase;
    }



    public Electrodomestico(String nombre, String marca, int precioBase, int peso) {
        this();
        this.nombre = nombre;
        this.marca = marca;
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(String nombre, String marca, int precioBase, String color, char consumoEnerg, int peso) {
        this.nombre = nombre;
        this.marca = marca;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnerg = consumoEnerg;
        this.peso = peso;
    }

    //**************************************************************************

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnerg() {
        return consumoEnerg;
    }

    public int getPeso() {
        return peso;
    }

    //**************************************************************************

    public int precioFinal() {
        double precioFinal = precioBase;

        switch (consumoEnerg) {
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            case 'F':
                precioFinal += 10;
                break;
            default:
                throw new AssertionError();
        }

        // Suma por peso
        if (peso >= 0 && peso <= 19) {
            precioFinal += 10;
        } else if (peso <= 49) {
            precioFinal += 20;
        } else if (peso <= 79) {
            precioFinal += 30;
        } else {
            precioFinal += 40;
        }

        return (int) precioFinal;
    }
    
    //**************************************************************************
    
    public void verPrecios() {
        System.out.println("Nombre: " + nombre + "\nMarca: " + marca + "\nPrecio final: " + precioFinal() + "€");
    }
}
