package examentema4saidoudrhich;

public class Jugada {
    private int aciertos;
    private int tamanoMatriz;
    private char[][] matriz;
    private int numJugador;

    //**************************************************************************

    public Jugada(int numJugador) {
        this.numJugador = numJugador;
        tamanoMatriz = 3;
        matriz = new char[tamanoMatriz][tamanoMatriz];
        aciertos = 0;
        rellenarMatriz();
        this.aciertos = comprobar3EnRaya();
    }

    //**************************************************************************
    
    // Getter de aciertos
    public int getAciertos() {
        return aciertos;
    }
    
    // Getter para saber le núm de jugador
    public int getNumJugador() {
        return numJugador;
    }
    
    //**************************************************************************
    
    // Método para rellenar la matriz
    void rellenarMatriz() {
        int aleatorio;
        for (int i = 0; i < tamanoMatriz; i++)
            for (int j = 0; j < tamanoMatriz; j++){
                aleatorio = (int) (Math.random() * 2);
                if (aleatorio == 1) 
                    matriz[i][j] = 'x';
                else 
                    matriz[i][j] = '·';
            }
    }
    
    //**************************************************************************
    
    // Método para comprobar cuantas TRES EN RAYA
    int comprobar3EnRaya() {
        int aciertos = 0;
        // Comprobar filas y columnas
        for (int i = 0; i < tamanoMatriz; i++) {
            if (matriz[i][0] == 'x' && matriz[i][1] == 'x' && matriz[i][2] == 'x') 
                aciertos++;
            if (matriz[0][i] == 'x' && matriz[1][i] == 'x' && matriz[2][i] == 'x') 
                aciertos++;
        }

        // Comprobar diagonales
        if (matriz[0][0] == 'x' && matriz[1][1] == 'x' && matriz[2][2] == 'x') 
            aciertos++;
        if (matriz[0][2] == 'x' && matriz[1][1] == 'x' && matriz[2][0] == 'x') 
            aciertos++;
        
        return aciertos;
    }

    
    //**************************************************************************
    
    // Método para imprimir la matriz
    void imprimirMatriz() {
        for (int i = 0; i < tamanoMatriz; i++) {
            for (int j = 0; j < tamanoMatriz; j++)
                System.out.print(matriz[i][j] + " ");
            System.out.println();
        }
    }
    
    //**************************************************************************
    
    // Método para comparar dos jugadas
    static Jugada mayorDeDos(Jugada ultima, Jugada penultima) {
        int aciertos1 = ultima.getAciertos();
        int aciertos2 = penultima.getAciertos();

        if (aciertos1 > aciertos2) 
            return ultima;
        if (aciertos2 > aciertos1) 
            return penultima;
        return null; // Si es empate
    }
}
