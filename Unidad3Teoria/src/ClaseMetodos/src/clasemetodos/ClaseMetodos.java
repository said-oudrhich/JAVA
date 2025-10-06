
package clasemetodos;

import java.util.Scanner;

public class ClaseMetodos {
    public static void main(String[] args) {
        
        String cadena = "Todos los seres humanos nacen libres e iguales en dignidad y derechos y, dotados como están de razón y conciencia, deben comportarse fraternalmente los unos con los otros";
        int dato1 = 10, dato2 = 20, dato3 = 30;
        
        //sumaTodos()
        System.out.println(sumaTodos(dato1, dato2, dato3));
        
        //comprueba que dos valores iguales
        System.out.println(hayIguales(dato1, dato2, dato3));
        
        //Pone punto al final del String
        System.out.println(puntoFinal(cadena));
        
        //Imprime todos los espacios que hay en el Sting
        espacios(cadena);
        
        //Devuelve el numero de espacios que hay en el String
        System.out.println(espacios2(cadena));
        
        //Cambia el valor de los 3 int
        dato1 = leerDatos();
        dato2 = leerDatos();
        dato3 = leerDatos();
       
        //rellena con tantos espacios al final con la longitud de dato1
        rellena(cadena, dato1);
        
        //comprueba si el num de la var dato3 es perfecto
        if (perfecto(dato3)) {
            System.out.println("El numero "+dato3+" es perfecto");
        }else
            System.out.println("El numero " + dato3 + " no es perfecto");
        
        //Tiene que preguntar por pantalla y devolver solo un num dentro del rango
        numeroDentroDeUnRango(100, 200);
        
        //Devuelve un num aleatorio entre los dos parametros
        System.out.println("Numero aleatorio "+aleatorio(1,100));

        //Devuelve estudiante + un num aleatorio hasta el num pasado por param
        System.out.println(estudianteAleatorio(999));

    }// Main
    
    //*****************************************************************************
    
    private static int sumaTodos(int dato1, int dato2, int dato3){
        return (dato1+dato2+dato3);
    }
    
    //*****************************************************************************

    private static boolean hayIguales(int a, int b, int c){
        return ((a == b) || (a == c) || (b == c));
    }

    //*****************************************************************************

    private static String puntoFinal(String cadena){
        return (cadena+".");
    }
    
    //*****************************************************************************

    private static void espacios(String cadena){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                contador += 1;
            }
        }
        System.out.println("Hay "+contador+" espacios.");
    }
    
    //*****************************************************************************
    
    private static int espacios2(String cadena){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                contador += 1;
            }
        }
        return contador;
    }
    
    //*****************************************************************************
    
    private static int leerDatos(){
        Scanner entrada = new Scanner(System.in);
        int valor;
        System.out.print("Introduce un valor: ");
        valor = entrada.nextInt();
        return valor;
    }
    
    //*****************************************************************************

    private static void rellena(String cadena, int dato1){
        System.out.print(cadena);
        for (int i = 0; i <= dato1; i++) {
            System.out.print(" ");
        }
        System.out.println("");
    }
    
    //*****************************************************************************

    private static boolean perfecto(int dato3){
        int divisores = 0;
        // Encontramos los divisores de dato3 (sin incluir el mismo número)
        for (int i = 1; i < dato3; i++) {
            if (dato3 % i == 0) { // Si i es divisor de dato3
                divisores += i;
            }
        }
        
        // Comparamos la suma de los divisores con dato3
        return divisores == dato3;
    }
    
    //*****************************************************************************

    private static int numeroDentroDeUnRango(int min, int max){
        Scanner entrada = new Scanner(System.in);
        int respuesta;
        
        do {            
            System.out.print("Introduce un valor dentro del rango ["+min+", "+max+"]: ");
            respuesta = entrada.nextInt();
        } while (respuesta > max || respuesta < min);
        
        return respuesta;
    }
    
    //*****************************************************************************

    public static int aleatorio(int min, int max) {
        // Generar un número aleatorio entre min (inclusive) y max (exclusive)
        return (int)(Math.random() * (max - min)) + min;
    }

    //*****************************************************************************

    public static String estudianteAleatorio(int max) {
        // Generar un número aleatorio entre 100 y max (inclusive)
        int numeroAleatorio = (int)(Math.random() * (max - 100)) + 100;
        
        // Devolver el formato "EstudianteXXX"
        return "Estudiante" + numeroAleatorio;
    }
}// Class
