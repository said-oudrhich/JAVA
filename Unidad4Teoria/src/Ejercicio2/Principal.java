package Ejercicio2;
public class Principal {
    public static void main(String[] args) {
        
        int todos[] = new int[1000];
        int impares[] = new int[1000];
        int pares[] = new int[1000];
        
        int numImpares = 0, numPares = 0;
        
        for (int i = 0; i < todos.length; i++) {
            
            todos[i] = (int)(Math.random() * (9999 - 5000 + 1) + 5000);
            
            if (todos[i] % 2 == 0) {
                pares[numPares] = todos[i];
                numPares++;
            }
            else{
                impares[numImpares] = todos[i];
                numImpares++;
            }
        }
        
        System.out.println("Hay "+numImpares+" numeros impares");
        System.out.println("Hay "+numPares+" numeros pares");
        
        
        System.out.println("Aparece "+buscar(todos, 5100)+" veces el numero 5100");
        System.out.println("Suma de los numeros entre 6000 y 6999 es: "+todosSeisMiles(todos));

    } // Main
    
    //**************************************************************************
    
    private static int buscar(int todos[],int num){
        int contador = 0;
        
        for (int i = 0; i < todos.length; i++) 
            if (todos[i] == num) 
                contador ++;
            
        
        return contador;
    }
    
    //**************************************************************************
    
    private static int todosSeisMiles(int todos[]){
        int suma = 0;
        for (int i = 0; i < todos.length; i++)
            if (todos[i] >=6000 && todos[i] <= 6999 )
                suma += todos[i];
            
        
        return suma;
    }
} // Class
