package Personas;

public class Estudiante extends Persona{
    
    private String numExpediente;
    private String titulacion;
    
    //**************************************************************************
    
    public Estudiante(String numExpediente, String titulacion, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.numExpediente = numExpediente;
        this.titulacion = titulacion;
    }
    
    //**************************************************************************
    
    public String getNumExpediente() {
        return numExpediente;
    }

    public String getTitulacion() {
        return titulacion;
    }
    
    //**************************************************************************
    
    public void estudiar(){
        System.out.println("ESTUDIANDO...........");
    }
    
    //**************************************************************************
    
    public void examinarse(){
        System.out.println("EXÁMINANDOME...........");
    }
    
    //**************************************************************************

    @Override
    public void visualizarInfo() {
        System.out.println("NOMBRE: " + getNombre() + "\tAPELLIDOS: " + getApellidos() + "\tNum Expediente: " + numExpediente + "\tTitulación: " + titulacion);
    }
}
