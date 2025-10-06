package hoja2;

public class Principal {

    public static void main(String[] args) {

        // Crear e inicializar el vector
        int vector[] = new int[100];

        inicializar(vector);
        pon1(vector);
        System.out.println("El 1 se encuentra en la posición " + buscarEl1(vector) + " del vector");

    } // Main

    //**************************************************************************

    // Método para inicializar el vector con -9
    private static void inicializar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = -9;
        }
    }

    //**************************************************************************

    // Método para colocar un 1 en una posición aleatoria
    private static void pon1(int[] vector) {
        int numAle = (int) (vector.length * Math.random());
        vector[numAle] = 1;
    }

    //**************************************************************************

    // Método para buscar la posición del 1 en el vector
    private static int buscarEl1(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 1) {
                return i;
            }
        }
        return -1; // Si no se encuentra el 1
    }

} // Class
