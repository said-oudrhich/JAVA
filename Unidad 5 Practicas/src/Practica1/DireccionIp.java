package Practica1;

public class DireccionIp {
    private String direccion;
    private int[] bytes;
    private char clase;
    private String tipo;
    private static int contadorA = 0, contadorB = 0, contadorC = 0;
    
    //**************************************************************************
    
    public DireccionIp(String direccion) {
        this.direccion = direccion;
        this.bytes = sacarBytes(direccion);
        this.clase = comprobarClase();
        this.tipo = tipoIp();
        contadorClase();
    }
    
    //**************************************************************************
    
    private int[] sacarBytes(String direccion) {
        String[] partes = direccion.split("\\.");
        int[] resultado = new int[4];
        for (int i = 0; i < 4; i++)
            resultado[i] = Integer.parseInt(partes[i]);
        return resultado;
    }
    
    //**************************************************************************
    
    private char comprobarClase() {
        if (bytes[0] >= 1 && bytes[0] <= 127) 
            return 'A';
        if (bytes[0] >= 128 && bytes[0] <= 191)
            return 'B';
        if (bytes[0] >= 192 && bytes[0] <= 223) 
            return 'C';
        return 'X'; // Si no es A, B o C, devuelve un valor de error
    }

    //**************************************************************************
    
    private String tipoIp() {
        if ((bytes[0] == 10)
                || (bytes[0] == 172 && bytes[1] >= 16 && bytes[1] <= 31)
                || (bytes[0] == 192 && bytes[1] == 168)) {
            return "Privada";
        } else
            return "Pública";
    }

    //**************************************************************************
    
    private void contadorClase() {
        switch (clase) {
            case 'A': contadorA++; 
                break;
            case 'B': contadorB++; 
                break;
            case 'C': contadorC++; 
                break;
        }
    }
    
    //**************************************************************************
    
    public void generaAleatoria(){
        // Generar el primer byte dentro de las clases A, B o C
        int primerByte;
        do {
            primerByte = (int) (Math.random() * 223) + 1;
        } while (primerByte == 127); // 127 es reservado
        bytes[0] = primerByte;
        
        // Generar los otros tres bytes aleatorios
        for (int i = 1; i < 4; i++)
            bytes[i] = (int) (Math.random() * 256); // 0-255
        
        this.direccion = bytes[0] + "." + bytes[1] + "." + bytes[2] + "." + bytes[3];
        this.bytes = sacarBytes(direccion);
        this.clase = comprobarClase();
        this.tipo = tipoIp();
        contadorClase();
    }
    
    //**************************************************************************
    
    public static int getContadorA() {
        return contadorA;
    }

    public static int getContadorB() {
        return contadorB;
    }

    public static int getContadorC() {
        return contadorC;
    }

    //**************************************************************************

    @Override
    public String toString() {
        return "IP: " + direccion + "\t Clase: " + clase + "\t Tipo: " + tipo;
    }
}
