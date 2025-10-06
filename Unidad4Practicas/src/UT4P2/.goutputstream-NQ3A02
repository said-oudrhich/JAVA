package UT4P2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int dados, caras;
        int resultados[] = new int[15]; // 15 por las tiradas que se hacen

        do {
            System.out.print("Introduce el número de dados [2,3,4]: ");
            dados = entrada.nextInt();
        } while ((dados < 2) || (dados > 4)); // Bucle haata cumplir las condiciones

        do {
            System.out.print("Introduce el número de caras de los dados [6,7,8,9]: ");
            caras = entrada.nextInt();
        } while ((caras < 6) || (caras > 9)); // Bucle haata cumplir las condiciones

        posiblesResultados(dados, caras); // Imprime los posibles resultados
        tiradas(resultados, dados, caras);
    }
    
    //**************************************************************************
    
    // Imprime todos los posibles resultados con los dados y las caras introducidos anteriormente
    private static void posiblesResultados(int dados, int caras) {
        System.out.println("");
        System.out.println("TODOS LOS RESULTADOS POSIBLES SON:");

        int max = caras * dados;
        int min = dados;

        for (int i = min; i <= max; i++) 
            System.out.print(i + " ");
        
        System.out.println("");
    }

    //**************************************************************************
    
    private static void tiradas(int resultados[], int dados, int caras) {
        System.out.println("");
        System.out.println("LOS RESULTADOS OBTENIDOS DE 15 TIRADAS SIN REPETICIONES SON:");

        int contador = 0;

        // Generar todas las tiradas
        while (contador < 15) {
            int suma = 0;
            for (int i = 0; i < dados; i++) 
                // Tira los dados que hayamos pedido por las caras que hayamos puesto y los suma
                suma += (int) (Math.random() * caras) + 1;
            
            resultados[contador] = suma;
            contador++;
        }

        // Imprimir resultados sin repetición
        imprimirSinRepeticion(resultados);
    }

    //**************************************************************************
    
    private static void imprimirSinRepeticion(int[] resultados) {
        
        for (int i = 0; i < resultados.length; i++) 
            // Llama al metodo pasandole el array, el resultado de esa posicion del array y la i para poner limite, si devuelve falso lo imprime
            // se le llama para comprobar que no hay duplicados
            if (esImpreso(resultados, resultados[i], i) == false)
                System.out.print(resultados[i] + " ");
            
        
    }

    //**************************************************************************
    
    private static boolean esImpreso(int[] resultados, int numero, int limite) {
        
        for (int i = 0; i < limite; i++) 
            if (resultados[i] == numero) 
                return true;
        
        return false;
    }
}
