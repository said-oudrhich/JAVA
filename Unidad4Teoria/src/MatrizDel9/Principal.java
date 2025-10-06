package MatrizDel9;

public class Principal {
    public static void main(String[] args) {
        
        int tamanioLista = 5; // Puedes cambiar el tamaño del array
        Matriz lista[] = new Matriz[tamanioLista];

        // Instanciar los objetos y llenar la lista
        for (int i = 0; i < tamanioLista; i++) {
            lista[i] = new Matriz(i);
            lista[i].generarMatriz();
            lista[i].comprobarMatriz();
        }

        
        // Visualizar todas las matrices
        System.out.println("Todas las matrices:");
        for (Matriz matriz : lista) {
            matriz.visualizarTodas();
        }
        
        // Visualizar solo las que contienen una suma de 9
        System.out.println("Matrices con suma 9:");
        for (int i = 0; i < lista.length; i++) {
            lista[i].visualizarLasDel9();
        }
        
        // Mostrar cuántas matrices tienen una suma de 9
        System.out.println("Número de matrices con suma 9: " + Matriz.visualizarCuantasDel9());

        // Visualizar una matriz específica
        System.out.println("Visualizando una matriz específica:");
        lista[0].visualizarUna(lista[0]);
    }
}