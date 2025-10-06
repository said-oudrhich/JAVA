package ArrayConIndice;
public class Principal {
    public static void main(String[] args) {
        
        int vector[] = new int[2000];
        int encontrados[] = new int[26];
        
        // Rellena el vector de numeros aleatorios entre 0 y 25
        for (int i = 0; i < vector.length; i++) 
            vector[i] = (int)(Math.random()*26);
        
        contarNumeros(vector, encontrados);
    }
    
    private static void contarNumeros(int vector[], int encontrados[]){
        
        int contador = 0;
        
        for (int i = 0; i < encontrados.length; i++) {
            contador = 0;
            for (int j = 0; j < vector.length; j++) {
                if (i == vector[j]) {
                    contador++;
                }
            }
            encontrados[i] = contador;
        }
        
        //Imprime el resultado
        for (int i = 0; i < encontrados.length; i++) {
            System.out.println("El num "+i+" aparece "+encontrados[i]);
        }
    }
    
    
}
