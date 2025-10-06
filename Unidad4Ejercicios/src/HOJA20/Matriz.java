package HOJA20;

public class Matriz {

    private int matriz[][];
    private Cuadrante cuadrante[];

    //**************************************************************************
    
    public Matriz(int[][] matriz) {
        this.matriz = matriz;
        this.cuadrante =  new Cuadrante[4];
    }
    
    //**************************************************************************
    
    public void dividirMatriz(){
        
        int temp[][] = new int[2][2];
        for (int i = 0; i < matriz.length / 2; i++) {
            for (int j = 0; j < matriz.length / 2; j++) {
                temp[i][j] = matriz[i][j];
                System.out.println(matriz[i][j]);
            }
            System.out.println("");
            cuadrante[i] = new Cuadrante(temp);
        }

    }
}
