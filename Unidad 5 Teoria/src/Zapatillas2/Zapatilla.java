
package Zapatillas2;

public class Zapatilla {
    private int ref;
    private String marca;
    private double pvp;
    
    //**************************************************************************
    //**************************************************************************
    
    public Zapatilla(int ref, String marca, double pvp) {
        this.ref = ref;
        this.marca = marca;
        this.pvp = pvp;
    }

    //**************************************************************************
    
    public int getRef() {
        return ref;
    }
    
    //**************************************************************************
    
    @Override
    public String toString() {
        return "Zapatilla{" + "ref=" + ref + ", marca=" + marca + ", pvp=" + pvp + '}';
    }

}
