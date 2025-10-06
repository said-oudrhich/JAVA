package HOJA11;
public class Principal {
    public static void main(String[] args) {
        
        String mapa[][] = new String[10][10];
        int barco4 = 4;
        
        inicializarMapa(mapa); // Inicializar el mapa
        aleatoriedad(mapa, barco4);
        imprimir(mapa);
        
    }
    
    private static void inicializarMapa(String mapa[][]) {
        
        for (int i = 0; i < mapa.length; i++) 
            for (int j = 0; j < mapa[0].length; j++) 
                mapa[i][j] = "0";
            
    }
    
    private static void aleatoriedad(String mapa[][], int barco4) {
        
        int fila, columna, posicion;
        boolean valido;

        do {
            fila = (int) (Math.random() * mapa.length); // Aleatorio entre 0 y vertical
            columna = (int) (Math.random() * mapa[0].length); // Aleatorio entre 0 y horizontal
            posicion = (int) (Math.random() * 2); // Aleatorio entre 0 y 1
            valido = true;

            if (posicion == 0 && columna + barco4 > mapa[0].length) {
                valido = false;
            } else if (posicion == 1 && fila + barco4 > mapa.length) {
                valido = false;
            }

        } while (!valido);
        rellenar(mapa, fila, columna, posicion, barco4);
        
    }

    private static void rellenar(String mapa[][], int fila, int columna, int posicion, int barco4){
        
        for (int i = 0; i < barco4; i++) {
            if (posicion == 0) { // Horizontal
                mapa[fila][columna + i] = "x";
            } else { // Vertical
                mapa[fila + i][columna] = "x";
            }
        }
        
    }
    
    private static void imprimir(String mapa[][]) {
        
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) 
                System.out.print(mapa[i][j] + " ");
            
            System.out.println("");
        }
        
    }
}
