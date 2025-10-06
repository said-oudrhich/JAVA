package awd;

public class Persona {

    private String nombre;
    private String apellidos;
    private String direccion;
    private String codigoPostal;
    private String telefono;
    private String dni;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private String email;

    public Persona(String nombre, String apellidos, String direccion, String codigoPostal, String telefono, String dni, int diaNacimiento, int mesNacimiento, int anioNacimiento, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
        this.dni = dni;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static boolean comprobarDni(String dni1) {
        if (dni1.length() != 9) return false;

        int parteNumerica = Integer.parseInt(dni1.substring(0, dni1.length() - 1));
        char letra = Character.toUpperCase(dni1.charAt(dni1.length() - 1));
        char letraCorrecta = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(parteNumerica % 23);

        return letra == letraCorrecta;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", telefono='" + telefono + '\'' +
                ", dni='" + dni + '\'' +
                ", diaNacimiento=" + diaNacimiento +
                ", mesNacimiento=" + mesNacimiento +
                ", anioNacimiento=" + anioNacimiento +
                ", email='" + email + '\'' +
                '}';
    }
}
