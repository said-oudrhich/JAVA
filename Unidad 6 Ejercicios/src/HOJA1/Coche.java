package HOJA1;

public class Coche extends Vehiculo{
    
    private int cilindrada;
    
    //**************************************************************************
    
    public Coche(String color, int numSerie, int cilindrada) {
        super(color, numSerie);
        this.cilindrada = cilindrada;
    }
    
    public Coche(int numSerie, int cilindrada) {
        super (numSerie);
        this.cilindrada = cilindrada;
    }
    
}
