
package HOJA2;
public class Estudiante {
    private String nombre;
    private int edad;
    private double nota;
    private String tipo;

    
    private static int totalCiclo = 0;
    private static int totalBachillerato = 0;

    
    public Estudiante(String nombre, int edad, double nota, String tipo) {
        
        if (tipo.equalsIgnoreCase("bachillerato")) {
            this.tipo = "bachillerato";
            totalBachillerato++;
        } else if (tipo.equalsIgnoreCase("ciclo")) {
            this.tipo = "ciclo";
            totalCiclo++;
        }
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNota() {
        return nota;
    }

    public String getTipo() {
        return tipo;
    }
    
    public static int getTotalCiclo() {
        return totalCiclo;
    }

    public static int getTotalBachillerato() {
        return totalBachillerato;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", nota=" + nota + ", tipo=" + tipo + '}';
    }
}