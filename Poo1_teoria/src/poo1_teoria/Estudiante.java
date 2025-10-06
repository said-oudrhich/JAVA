package poo1_teoria;

public class Estudiante 
{
    private String nombre;
    private int edad;
    private String acceso;
    private boolean mayorEdad;

    // Método constructor
    public Estudiante(String nombre, int edad, String acceso) {
        this.nombre = nombre;
        this.edad = edad;
        this.acceso = acceso;
        this.establecerMayoriaEdad();
    }
    
    /************************************************************************/
    
    // Método constructor para dos parametros (nombre,edad)
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    /************************************************************************/
    
    // Getter and Setter
    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }
    // Metodo para poder cambiar edad desde POO1_TEORIA
    public void setEdad(int edad) {
        this.edad = edad;
        establecerMayoriaEdad();
    }
    // Suma la edad + 1
    public void cumpleanos(){
        edad = edad + 1;
        establecerMayoriaEdad();
    }

    /************************************************************************/

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", acceso=" + acceso + ", mayorEdad=" + mayorEdad + '}';
    }
    
    /************************************************************************/
    private void establecerMayoriaEdad() {
        if (edad >= 18) {
            mayorEdad = true;
        } else {
            mayorEdad = false;
        }
    }
    /************************************************************************/

}
