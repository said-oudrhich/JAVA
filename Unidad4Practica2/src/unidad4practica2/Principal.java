package unidad4practica2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        // Se llama al metodo para que devuelva la las caras y los dados
        int dados = solicitarEntrada("Introduce el númreo de dados[2,3,4]: ",2,4);
        int caras = solicitarEntrada("Introduce el númreo de caras de los dados[6,7,8,9]: ",6,9);
        
        int tiradas[] = new int[15];
        
        //Imprime todos los resultados posibles
        posibilidades(dados, caras);
        tiradasAletorias(tiradas, dados, caras);
        // Imprimir resultados sin repetición
        imprimirSinRepeticion(tiradas);
        
    } //Main
    
    //**************************************************************************
    
    private static int solicitarEntrada(String mensaje, int minimo, int maximo) {
        
        Scanner entrada = new Scanner(System.in);
        int valor;
        do {
            System.out.print(mensaje);
            valor = entrada.nextInt();
        } while (valor < minimo || valor > maximo);
        return valor;
        
    }
    
    //**************************************************************************
    
    private static void posibilidades(int dados, int caras){
        
        System.out.println("");
        System.out.println("TODOS LOS RESULTADOS POSIBLES SON:");

        int max = caras * dados; // El max va a ser siempre los dados por las caras que tenga el dado
        int min = dados; //El resultado min siempre va a ser el num de dados que se tiren
        
        // Imrpime todas las posibilidades
        for (int i = min; i <= max; i++) 
            System.out.print(i + " ");
        
    }
    
    //**************************************************************************
    
    private static void tiradasAletorias(int tiradas[], int dados, int caras){
        
        System.out.println("");
        System.out.println("LOS RESULTADOS OBTENIDOS DE 15 TIRADAS SIN REPETICIONES SON:");
        
        int contador = 0;

        // Generar todas las tiradas (Una tirada es la suma de los valores de todos los dados)
        while (contador < 15) {
            int suma = 0;
            for (int i = 0; i < dados; i++) 
                // Tira los dados que hayamos pedido por las caras que hayamos puesto y los suma
                suma += (int) (Math.random() * caras) + 1;
            
            tiradas[contador] = suma;
            contador++;
        }
        
    }
    
    //**************************************************************************
    
    private static void imprimirSinRepeticion(int[] tiradas) {
        
        for (int i = 0; i < tiradas.length; i++) 
            // Llama al metodo pasandole el array, el resultado de esa posicion del array y la i para poner limite, si devuelve falso lo imprime
            // se le llama para comprobar que no hay duplicados
            if (!esImpreso(tiradas, tiradas[i], i))
                System.out.print(tiradas[i] + " ");
        
    }

    //**************************************************************************
    
    private static boolean esImpreso(int[] tiradas, int numero, int limite) {
        
        for (int i = 0; i < limite; i++) 
            if (tiradas[i] == numero) 
                return true;
        return false;
        
    }
    
} //Class

