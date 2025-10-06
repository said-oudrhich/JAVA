package Practica2FastFood;

public class MasaGruesa extends Pizza{
    
    public MasaGruesa(String tipo, double precio, String nombre) {
        super(tipo, precio, nombre);
    }

    public MasaGruesa(String tipo, double precio, String nombre, boolean oferta) {
        super(tipo, precio, nombre, oferta);
    }
    
}
