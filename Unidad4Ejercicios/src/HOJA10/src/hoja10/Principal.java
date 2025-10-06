package hoja10;
public class Principal {
    public static void main(String[] args) {
        
        int matriz[][][] = new int[3][3][3];
        
        aleatorio(matriz); // Método para colocar aleatoriamiente los num 5,10,20
        buscarNumero(matriz, 10); // Método para buscar el num 10
        imprimir(matriz); //Imprime la maztriz
        
    } //Main
    
    
    private static void aleatorio(int matriz[][][]){

        int x, y, z;
        int contador = 1;

        while (contador <= 3) {
            do {
                x = (int) (Math.random() * 3);
                y = (int) (Math.random() * 3);
                z = (int) (Math.random() * 3);
            } while (matriz[x][y][z] != 0); // Asegura no sobreescribir un numero

            switch (contador) {
                case 1:
                    matriz[x][y][z] = 5;
                    break;
                case 2:
                    matriz[x][y][z] = 10;
                    break;
                case 3:
                    matriz[x][y][z] = 20;
                    break;
                default:
                    throw new AssertionError();
            }
            contador++;
        }

    }
    
    //**************************************************************************
    
    private static void buscarNumero(int matriz[][][], int num){
        
        int x = 0, y = 0, z = 0;
        boolean encontrado = false;
        
        if (num > 0){ // Si el numeor que se busca es mayor que 0
            
            // Recorre todo el array buscando el num, si lo encuentra  guarda las posiciones y pone encontrado en true
            for (int i = 0; i < matriz.length; i++)
                for (int j = 0; j < matriz[i].length; j++)
                    for (int k = 0; k < matriz[i][j].length; k++)
                        if (matriz[i][j][k] == num){
                            encontrado = true;
                            x=k;
                            y=j;
                            z=i;
                        }
            
            if (encontrado)
                System.out.print("Encontrado en X=" + x + " ; Y=" + y + " ; Z=" + z);
                
            else
                System.out.println("No encontrado"); // Si el numeor que se busca no se encuentra
        }
        else
            System.out.println("No válido"); // Si el numeor que se busca es menor que 1
        
        System.out.println("");
    }
    
    //**************************************************************************
    
    private static void imprimir(int matriz[][][]){
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    System.out.print(matriz[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
} //Class