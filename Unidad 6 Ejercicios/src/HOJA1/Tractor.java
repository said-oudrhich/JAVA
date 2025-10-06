package HOJA1;

public class Tractor extends Vehiculo{
    private String tipo;
    private String estado;
    
    //**************************************************************************
    
    public Tractor(String color, int numSerie, String tipo, String estado) {
        super(color, numSerie);
        this.tipo = tipo;
        this.estado = estado;
    }
    
    //**************************************************************************
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //**************************************************************************
    
    private void cambiarEstado(){
        
    }
}
