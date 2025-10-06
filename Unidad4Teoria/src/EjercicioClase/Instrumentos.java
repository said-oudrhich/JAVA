package EjercicioClase;

import java.nio.file.Files;

public class Instrumentos {
    
    private String nombre;
    private String tipo;
    private int precio;
    private int existencias = 5;
    
//******************************************************************************
//******************************************************************************

    public Instrumentos(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
        
    }
    
//******************************************************************************

    public String getNombre() {
        return nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    //******************************************************************************

    public void venta(int unidades)
    {
       existencias -= unidades;
       
    }
    
//******************************************************************************
    
    @Override
    public String toString() {
        return "Instrumentos{" + "nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + ", existencias=" + existencias + '}';
    }

}
