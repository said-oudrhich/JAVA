package Practica1FastFood;

public class Vegetariana extends Burger{
    
    public Vegetariana(String tipo, double precio, String nombre) {
        super(tipo, precio, nombre);
    }

    public Vegetariana(String tipo, double precio, String nombre, boolean oferta) {
        super(tipo, precio, nombre, oferta);
    }
    
}
