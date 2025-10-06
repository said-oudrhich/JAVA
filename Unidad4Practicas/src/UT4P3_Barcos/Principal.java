package UT4P3_Barcos;

public class Principal {
    public static void main(String[] args) {
        
        // Plano de 12x12
        char plano[][] = new char[12][12];
        
        // Longitud de cada barco que necesito colocar.
        int barcoActual[] = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};
        
        // Inicializo el plano
        inicializarPlano(plano);
        
        // Coloco todos los barcos en el plano.
        colocarBarcos(barcoActual, plano);
        
        // Imprimo el plano final
        Imprimir(plano);
    }
    
    //**************************************************************************
    
    private static void inicializarPlano(char plano[][]) {

        for (int i = 0; i < plano.length; i++)
            for (int j = 0; j < plano[0].length; j++)
                // Los bordes del plano con 'T'.
                if (i == 0 || i == plano.length - 1 || j == 0 || j == plano[0].length - 1)
                    plano[i][j] = 'T';
                // En el resto del plano '-'.
                else
                    plano[i][j] = '-';
    }
    
    //**************************************************************************
    
    private static void colocarBarcos(int barcoActual[], char plano[][]) {
        // Recorro el array de longitudes de barcos para colocar cada uno
        for (int i = 0; i < barcoActual.length; i++)
            colocarBarco(barcoActual[i], plano);
    }
    
    //**************************************************************************
    
    private static void colocarBarco(int barcoActual, char plano[][]) {
        int fila, columna, posicion;
        boolean valido;
        
        // Intento colocar el barco hasta que encuentre una posición válida.
        do {
            // aleatoriamente si el barco será horizontal (0) o vertical (1).
            posicion = (int) (Math.random() * 2);
            
            // Si el barco es horizontal, elijo una columna dentro de los límites permitidos
            if (posicion == 0) {
                columna = 1 + (int) (Math.random() * (plano[0].length - 1 - barcoActual));
                fila = 1 + (int) (Math.random() * (plano.length - 2));
            } 
            // Si el barco es vertical, elijo una fila dentro de los límites permitidos
            else {
                fila = 1 + (int) (Math.random() * (plano.length - 1 - barcoActual));
                columna = 1 + (int) (Math.random() * (plano[0].length - 2));
            }
            
            // Verifico si la posición elegida es válida llamando al método
            valido = (probarBarco(plano, fila, columna, posicion, barcoActual));
        } while (!valido); // Repito el proceso hasta encontrar una posición válida.
        
        // Una vez encontrada la posición válida, pinto el barco en el plano.
        pintarBarco(plano, fila, columna, posicion, barcoActual);
    }
    
    //**************************************************************************
    
    private static boolean probarBarco(char plano[][], int fila, int columna, int posicion, int barcoActual) {
        // Recorro cada casilla donde se colocará el barco
        for (int i = 0; i < barcoActual; i++) {
            int nuevaFila = fila;
            int nuevaColumna = columna;
            
            // Si el barco es horizontal, calculo la nueva columna
            if (posicion == 0)
                nuevaColumna += i;
            // Si el barco es vertical, calculo la nueva fila
            else
                nuevaFila += i;
            
            // Reviso todas las casillas vecinas alrededor de cada parte del barco
            for (int x = -1; x <= 1; x++) 
                for (int y = -1; y <= 1; y++) {
                    int filaVecina = nuevaFila + x;
                    int columnaVecina = nuevaColumna + y;
                    
                    // Verifico si la casilla vecina está dentro de los límites del plano
                    if (filaVecina >= 0 && filaVecina < 12 && columnaVecina >= 0 && columnaVecina < 12) 
                        // Si alguna casilla vecina ya tiene un 'x', significa que hay conflicto
                        if (plano[filaVecina][columnaVecina] == 'x')
                            return false; // La posición no es válida.
            }
        }
        // Si no encontré ningún conflicto, devuelvo true.
        return true;
    }
    
    //**************************************************************************
    
    private static void pintarBarco(char plano[][], int fila, int columna, int posicion, int barcoActual) {
        
        for (int i = 0; i < barcoActual; i++)
            if (posicion == 0)
                // Si el barco es horizontal, pinto en la misma fila pero incremento la columna
                plano[fila][columna + i] = 'x';
            else
                // Si el barco es vertical, pinto en la misma columna pero incremento la fila.
                plano[fila + i][columna] = 'x';
        
    }
    
    //**************************************************************************
    
    private static void Imprimir(char plano[][]) {

        for (int i = 0; i < plano.length; i++)
            for (int j = 0; j < plano[0].length; j++)
                System.out.print(plano[i][j]);
            System.out.println("");
            
    }
    
} // Class