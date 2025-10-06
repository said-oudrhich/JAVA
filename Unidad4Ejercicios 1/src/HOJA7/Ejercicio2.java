package hoja7;
public class Ejercicio2 {
    public static void main(String[] args) {
        
        int matriz[][] = new int[7][7];
        diagonal(matriz);
        imprimir(matriz);
    }
    
    
    private static void diagonal(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][i] = 1;
        }
    }
    
    private static void imprimir(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
