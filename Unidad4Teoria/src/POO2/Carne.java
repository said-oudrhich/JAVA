package POO2;

import java.time.LocalDate;

public class Carne {
    
    private String  nombre;
    private int     numSocio;
    private int     mesCaduca;
    private int     annoCaduca;
    
//******************************************************************************    
//******************************************************************************
    
// Constructor
    public Carne(String nombre, int numSocio) {
        this.nombre = nombre;
        this.numSocio = numSocio;
        rellenarCaducidad(); //Método para generar las fechas
    }
    
//******************************************************************************
    
    //Se llama al crear el carnet para introducir la fecha anno y mes
    private void rellenarCaducidad(){
        LocalDate hoy = LocalDate.now();
        mesCaduca = hoy.getMonthValue()+1;
        annoCaduca = hoy.getYear()+1;
    }
    
//******************************************************************************

    // Setter que se llama dede Socio para que cambie tambien aqui
    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }
    
//******************************************************************************    
    public void imprimirCarne(){
        System.out.println("***********************************");
        System.out.println("Nombre: "+nombre);
        System.out.println("Num Socio: " + numSocio);
        System.out.println("Caduca el mes "+mesCaduca+" del año "+annoCaduca);
        System.out.println("***********************************");

    }
//******************************************************************************
    
    //Para que imprima las cosas del socio, se llamma desde el toString de Socio
    @Override
    public String toString() {
        return "Carne{" + "nombre=" + nombre + ", numSocio=" + numSocio + ", mesCaduca=" + mesCaduca + ", annoCaduca=" + annoCaduca + '}';
    }

}
