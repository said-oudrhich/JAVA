package hoja8;
public class Principal {
    public static void main(String[] args) {
        
        int vector1[] = {1,2,16,29};
        int vector2[] = {3,19,70,83};
        int ordenado[] = new int[vector1.length+vector2.length];
        
        ordenar(ordenado, vector1, vector2);
        imprimir(ordenado);
    }
    
    
    //**************************************************************************
    
    private static void ordenar(int ordenado[], int vector1[], int vector2[]){
        
        int temp;
        
        // Combinar los dos vectores en el vector ordenado
        for (int i = 0; i < vector1.length; i++) {
            ordenado[i] = vector1[i];
        }
        for (int i = 0; i < vector2.length; i++) {
            ordenado[i+vector1.length] = vector2[i];
        }
        
        // Ordena el vector usando el método de burbuja 
        for (int i = 0; i < ordenado.length - 1; i++) {
            for (int j = 0; j < ordenado.length - 1 - i; j++) {
                if (ordenado[j] > ordenado[j + 1]) {
                    // Intercambiar ordenado[j] y ordenado[j + 1] 
                    temp = ordenado[j]; 
                    ordenado[j] = ordenado[j + 1]; 
                    ordenado[j + 1] = temp; 
                }
            }
        }
    }
    
    //**************************************************************************
    
    private static void imprimir(int ordenado[]){
        for (int i = 0; i < ordenado.length; i++) {
            System.out.print(ordenado[i] + " ");
        }
    }
    
}


