package HOJA1;

public class Vehiculo {
    
    private String color = "blanco";
    private int numSerie;
    
    //**************************************************************************

    public Vehiculo(String color, int numSerie) {
        this.color = color;
        this.numSerie = numSerie;
    }
    
    public Vehiculo(int numSerie) {
        this.numSerie = numSerie;
    }
    
    //**************************************************************************

    public String getColor() {
        return color;
    }
    
    public int getNumSerie() {
        return numSerie;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }
    
    //**************************************************************************
    
    public void pintar(String nuevoColor){
        setColor(nuevoColor);
    }
    
    //**************************************************************************
  
    public void cambiarNumSerie(int nuevo) {
        setNumSerie(nuevo);
    }
    
    //**************************************************************************
    
    public void arrancar() {
        if (this instanceof Coche)
            System.out.println("Arrancando el coche");
        else if (this instanceof Barco)
            System.out.println("Arrancando el barco");
        else if (this instanceof Tractor)
            System.out.println("Arrancando el tractor");
    }

}
