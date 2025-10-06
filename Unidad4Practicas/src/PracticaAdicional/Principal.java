package PracticaAdicional;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int num1[] = new int[10];
        int num2[] = new int[10];
        
        String peliculas[] = new String[3];
        String palabras[];
        
        inicializarNum1(num1);
        pintarArray(num1);
        creaOrdenado(num1, num2);
        pedirPelis(peliculas);
        todasLasPalabras(peliculas);
        
        
        if (buscaRepetidos(num2, 20) != -1) {
            System.out.println("El numero 20 se encuentra en la posicón "+buscaRepetidos(num2, 20));
        }
        System.out.println("El numero 22 aparece "+vecesDel22(num2));
        pintarArray(num2);
    }
    
    private static void inicializarNum1(int num1[]){
        for (int i = 0; i < num1.length; i++) {
            num1[i] = (int) (Math.random()*6+20);
        }
    }
    
    //**************************************************************************
    
    private static void pintarArray(int num1[]) {
        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i]+" ");
        }
    }
    
    //**************************************************************************
    
    private static void creaOrdenado(int num1[], int num2[]) {
        for (int i = 0; i < num1.length; i++) {
            num2[i] = num1[i];
        }
        Arrays.sort(num2);
    }
    
    //**************************************************************************
    
    private static void pedirPelis(String peliculas[]) {
        Scanner scanner = new Scanner(System.in);
        boolean contieneElGuardaespaldas = false;

        for (int i = 0; i < 3; i++) {
            System.out.print("Introduce el nombre de la película " + (i + 1) + ": ");
            String pelicula = scanner.nextLine();
            peliculas[i] = pelicula;

            // Comparación directa usando `==`
            if (pelicula.equals("El guardaespaldas")) 
                contieneElGuardaespaldas = true;
        }

        if (!contieneElGuardaespaldas) 
            System.out.println("Una de las películas debe ser El guardaespaldas");
    }
    
    //**************************************************************************
    
    private static void todasLasPalabras(String peliculas[]) {

        String palabras[];
        
        for (int i = 0; i < peliculas.length; i++) {
            palabras = peliculas[i].split(" ");
            for (int j = 0; j < palabras.length; j++) {
                System.out.println(palabras[j]);
            }
        }
    }
    
    //**************************************************************************
    
    private static int buscaRepetidos(int num2[], int num) {
        
        for (int i = 0; i < num2.length; i++) {
            if (num2[i] == num) {
                return i;
            }
        }
        return -1;
    }
    
    //**************************************************************************
    
    private static int vecesDel22(int num2[]){
        int contador = 0;
        for (int i = 0; i < num2.length; i++) {
            if (num2[i] == 22) {
                contador++;
            }
        }
        return contador;
    }
}