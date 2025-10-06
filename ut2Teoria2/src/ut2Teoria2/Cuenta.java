package ut2Teoria2;
public class Cuenta {
    //atributos
    
    private int    numCuenta;
    private String titular;
    private String titular2;
    private String tipoCuenta;
    private double saldo;
    
    //*******************************************************************************
    //*******************************************************************************
    
    // Contructores
    public Cuenta(int numCuenta, String titular, String tipoCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }
    
    //*******************************************************************************

    public Cuenta(int numCuenta, String titular, String titular2, String tipoCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.titular2 = titular2;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }
    
    //*******************************************************************************
    
    // Getter and Setters
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
    public int getNumCuenta() {
        return numCuenta;
    }

    public String getTitular() {
        return titular;
    }
    
    //*******************************************************************************
    
    // Dos metodos para ingresar y retirar dinero
    public void ingreso(int cantidad) {
        saldo = (saldo + cantidad);
    }
    
    public void retirada(int cantidad) {     // Se comprueba si tienes saldo sufiente para retirar
        if (cantidad > saldo) {
            System.out.println("SALDO INSUFICIENTE");
        } else {
        saldo = (saldo - cantidad);
        }
    }
    
    //*******************************************************************************
    
    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", titular=" + titular + ", titular2=" + titular2 + ", tipoCuenta=" + tipoCuenta + ", saldo=" + saldo + '}';
    }
    
    //*******************************************************************************
    
    
}//Class Cuenta
