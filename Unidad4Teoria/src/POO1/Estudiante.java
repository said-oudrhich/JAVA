package POO1;
public class Estudiante {
    
    //Atríbutos
    private String nombre;
    private int edad;
    private int nota;
    private String calificacion;
    
//Constructores   
//******************************************************************************
//******************************************************************************
    // Nombre y Edad Obligatorio
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
//******************************************************************************
    // Solo Nombre
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
//******************************************************************************
//Métodos
    public void cumplirAnnos(){
        if (edad != 0) {
            edad++;
        }
    }
//******************************************************************************
    public void examinarse(){
        nota = (int)(Math.random()*11);
        actualizaCalificacion();
    }
//******************************************************************************
    private void actualizaCalificacion(){
        switch (nota) {
            case 0,1,2,3,4:
                calificacion = "SUSPENSO";
                break;
            case 5:
                calificacion = "APROBADO";
                break;
            case 6:
                calificacion = "BIEN";
                break;
            case 7,8:
                calificacion = "BIEN";
                break;
            case 9,10:
                calificacion = "SOBRESALIENTE";
                break;
            default:
                throw new AssertionError();
        }
    }
//******************************************************************************
//ToString
    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", nota=" + nota + ", calificacion=" + calificacion + '}';
    }
    
}
