package Practica3FastFood;

public class Buey extends Burger{
    
    public Buey(String tipo, double precio, String nombre) {
        super(tipo, precio, nombre);
    }

    public Buey(String tipo, double precio, String nombre, boolean oferta) {
        super(tipo, precio, nombre, oferta);
    }
    
}
