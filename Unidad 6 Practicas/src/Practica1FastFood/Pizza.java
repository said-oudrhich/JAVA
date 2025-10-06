package Practica1FastFood;

public class Pizza extends Plato{
    private String tipo;

    public Pizza(String tipo, double precio, String nombre) {
        super(precio, nombre);
        this.tipo = tipo;
    }

    public Pizza(String tipo, double precio, String nombre, boolean oferta) {
        super(precio, nombre, oferta);
        this.tipo = tipo;
    }
    
}
