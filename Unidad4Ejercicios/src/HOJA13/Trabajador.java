package HOJA13;
public class Trabajador {
    
    // atributos
    private String nombre;
    private double salario = 0;
    private String proyecto;
    private String nivel = niveles[0];
            
    private static String[] niveles = {"prácticas", "becario", "programador junior",
        "programador senior", "analista orgánico",
        "analista funcional", "jefe de proyecto"};
    
    //**************************************************************************
    //**************************************************************************

    public Trabajador(String nombre, String proyecto) {
        this.nombre = nombre;
        this.proyecto = proyecto;
    }
    
    public Trabajador(String nombre, String proyecto, String nivel) {
        this.nombre = nombre;
        this.proyecto = proyecto;
        this.nivel = nivel;
    }

    //**************************************************************************

    //Setter
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //**************************************************************************

    public void ascender(){
        
        int i = 0;
        
        while (!(niveles[i].equals(nivel))) {
            i++;
        }
        
        if (i < niveles.length - 1) 
            nivel = niveles[i+1];
        else
            System.out.println("El trabajador " + nombre + " está en el máximo puesto.");
        
    }
    
    //**************************************************************************

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", salario=" + salario + ", proyecto=" + proyecto + ", nivel=" + nivel + '}';
    }


}
