package HOJA3;
public class Principal {
    public static void main(String[] args) {
        
        int vector[] = new int[50];
        int contador[] = new int[11];
        
        aleatorio(vector);
        cuentaNumeros(vector, contador);
        visualizarNumeros(contador);
    } // Main
    
    //**************************************************************************
    
    private static void aleatorio(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*11);
        }
    }
    
    //**************************************************************************
    
    private static void cuentaNumeros(int vector[], int contador[]){
        for (int i = 0; i < vector.length; i++) {
            contador[vector[i]]++;
        }
    
    }
        
    //**************************************************************************
    
    private static void visualizarNumeros(int contador[]){
        for (int i = 0; i < contador.length; i++) {
            System.out.println("El numero "+i+" se repite "+contador[i]+" veces");
        }
    
    }
} // Class
