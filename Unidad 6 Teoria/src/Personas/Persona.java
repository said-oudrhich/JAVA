package Personas;

public class Persona {
    private String nombre;
    private String apellidos;

    //**************************************************************************
    
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    //**************************************************************************

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    //**************************************************************************
    
    public void caminar(){
        System.out.println("Caminando...........");
    }
    
    public void dormir() {
        System.out.println("Durmiendo...........");
    }
    
    public void visualizarInfo() {
        System.out.println("NOMBRE: " + nombre + "\tAPELLIDOS: " + apellidos);
    }
    
}
