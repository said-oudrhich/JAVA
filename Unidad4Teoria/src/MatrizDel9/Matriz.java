package MatrizDel9;

public class Matriz {
    private int numMatriz;
    private int suma;
    private static int del9;
    private int matriz [][] ;// debe instanciarse de 3 x 3 en el constructor

    public Matriz(int numMatriz) {
        this.numMatriz = numMatriz;
        matriz = new int[3][3];
    }
    
    public void generarMatriz(){
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[0].length; j++)
                matriz[i][j] = (int) (Math.random() * 3);
    }
    
    public void comprobarMatriz(){
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[0].length; j++)
                suma += matriz[i][j];
    }
    
    public void visualizarTodas() {
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void visualizarLasDel9(){
        if (suma == 9) {
            del9++;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(" " + matriz[i][j]);
                }
                System.out.println("");
            }
            System.out.println("");
        }
        
    }
    
    
    public static int visualizarCuantasDel9(){
        return del9;
    }


    public void visualizarUna(Matriz matriz){
        matriz.visualizarTodas();
    }
}