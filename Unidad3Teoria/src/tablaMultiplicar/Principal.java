package tablaMultiplicar;

// Tabla de multiplicar del 1 al 10

public class Principal {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++){
            System.out.println("------------");
            for (int j = 1; j <= 10; j++) 
                System.out.println(i+" x "+j+" = "+i * j);
        }
        
    } // Main
} // Class
