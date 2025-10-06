package Practica2FastFood;

public class MasaFina extends Pizza{
    
    public MasaFina(String tipo, double precio, String nombre) {
        super(tipo, precio, nombre);
    }

    public MasaFina(String tipo, double precio, String nombre, boolean oferta) {
        super(tipo, precio, nombre, oferta);
    }
    
}
