package HOJA20;

public class Principal {

    public static void main(String[] args) {
        int[][] m1 = {{0, 0, 1, 1},
        {0, 0, 1, 1},
        {4, 3, 4, 1},
        {1, 1, 3, 2}};

        int[][] m2 = {{1, 2, 4, 4},
        {2, 2, 1, 1},
        {2, 3, 2, 1},
        {2, 3, 1, 3}};

        Matriz cuadrado1 = new Matriz(m1);
        Matriz cuadrado2 = new Matriz(m2);

        cuadrado1.dividirMatriz();
        cuadrado2.dividirMatriz();
    }
}
