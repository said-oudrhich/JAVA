package HOJA19;
public class Ascensor {
    
    private int idAscensor;
    private int plantaActual;
    private int numViajes = 0;
    
    //**************************************************************************
    //**************************************************************************
    
    public Ascensor(int idAscensor, int plantaActual) {
        this.idAscensor = idAscensor;
        this.plantaActual = plantaActual;
    }
    
    //**************************************************************************

    public int getPlantaActual() {
        return plantaActual;
    }
    
    //**************************************************************************
    
    public void cambiosAscensor(int plantaActual){
        this.plantaActual = plantaActual;
        this.numViajes += 1;
    }
    
    //**************************************************************************
    
    @Override
    public String toString() {
        return "Ascensor" + "id=" + idAscensor + ", plantaActual=" + plantaActual + ", numViajes=" + numViajes;
    }
    
}
