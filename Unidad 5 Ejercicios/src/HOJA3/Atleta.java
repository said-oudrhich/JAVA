package HOJA3;

public class Atleta {
    private String nombre;
    private int calle;
    private double marcaFinal;
    private boolean premio = false;  // se marca a true si obtiene medalla
    
    //**************************************************************************

    public Atleta(String nombre, int calle) {
        this.nombre = nombre;
        this.calle = calle;
        this.marcaFinal = marcaFinal();
    }
    
    //**************************************************************************
    
    private double marcaFinal(){
        return (9.58 + (Math.random() * (9.99 - 9.58)));
    }
    
    //**************************************************************************
    
    public double getMarcaFinal() {
        return marcaFinal;
    }
    
    public boolean isPremio() {
        return premio;
    }
    
    public void setPremio(boolean premio) {
        this.premio = premio;
    }
    
    //**************************************************************************

    @Override
    public String toString() {
        return "nombre=" + nombre + ", calle=" + calle + ", marcaFinal=" + marcaFinal;
    }
    
    
}
