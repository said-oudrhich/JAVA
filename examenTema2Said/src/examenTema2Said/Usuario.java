package examenTema2Said;
public class Usuario {
    
    // Variables como privadas
    private String usuario;
    private String Password;
    private int diaCaduca;
    private int mesCaduca;
    
//******************************************************************************

    // Constructores
    public Usuario(String usuario, String Password, int diaCaduca, int mesCaduca) {
        this.usuario = usuario;
        this.Password = Password;
        this.diaCaduca = diaCaduca;
        this.mesCaduca = mesCaduca;
    }
    
    // Contructor sin contraseña
    public Usuario(String usuario, int diaCaduca, int mesCaduca) {
        this.usuario = usuario;
        this.diaCaduca = diaCaduca;
        this.mesCaduca = mesCaduca;
    }
    
//******************************************************************************

    // Getters
    public int getDiaCaduca() {
        return diaCaduca;
    }

    public int getMesCaduca() {
        return mesCaduca;
    }
    
    // Setters
    public void setPassword(String Password) {
        this.Password = Password;
    }
    
//******************************************************************************
    
    // Método público para comprobar si ha caducado la contraseña
    public void comprobar(int dia, int mes){
        if ((dia > diaCaduca) && (mes >= mesCaduca))
            System.out.println("SÍ HA CADUCADO");
        else
            System.out.println("NO HA CADUCADO");
    }

//******************************************************************************

    // Método toString para mostrar todos los parámetros
    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", Password=" + Password + ", diaCaduca=" + diaCaduca + ", mesCaduca=" + mesCaduca + '}';
    }
    
} // Class
