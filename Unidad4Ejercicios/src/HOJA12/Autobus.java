package HOJA12;
public class Autobus {
    private String matricula;
    private String modelo;
    private int potenciaCV = 200;
    private int numPlazas;

    //**************************************************************************
    //**************************************************************************

    //Contructores
    public Autobus(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public Autobus(String matricula) {
        this.matricula = matricula;
    }
    
    //**************************************************************************

    //Setter
    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }
    
    //Getters
    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public int getNumPlazas() {
        return numPlazas;
    }
    
    //**************************************************************************

    @Override
    public String toString() {
        return "Autobus{" + "matricula=" + matricula + ", modelo=" + modelo + ", potenciaCV=" + potenciaCV + ", numPlazas=" + numPlazas + '}';
    }
    
}
