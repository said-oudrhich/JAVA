package Principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int contador_fallos = 0, random = 0, respuesta = 0;
        
        // Llamamos al metodo para que nos devuelva un numero random entre 1 y 200
        random = random();
        System.out.println(random);
        
        // Se ejecuta mientras no averiguemos el numero y mientras no llegues a 7 fallos
        while (random != respuesta || contador_fallos < 7) {
            
            System.out.println("Intenta averiguar el numero: ");
            respuesta = entrada.nextInt();
            
            // Suma los fallos si no lo adivina
            if (respuesta != random) {
                contador_fallos++;
            }
            
            switch (contador_fallos) {
                case 0:
                    break;
                case 1:
                    fallo1();
                    break;
                case 2:
                    fallo2();
                    break;
                case 3:
                    fallo3();
                    break;
                case 4:
                    fallo4();
                    break;
                case 5:
                    fallo5();
                    break;
                case 6:
                    fallo6();
                    break;
                case 7:
                    fallo7();
                    break;
                default:
                    throw new AssertionError();
            }
            
            // Si lo adivina
            if (respuesta == random) {
                System.out.println("Has adivinado el numerooo!!!!");
            }
            if (contador_fallos == 7) {
                System.out.println("¡Has perdido! El número era: " + random);
            }
        }
        
    } // Main
    
    /**************************************************************************/

    private static int random(){
        return (int)(Math.random()*120+1);
    }
    
    /**************************************************************************/
    
    private static void fallo1 ()
    {
        System.out.println("\t\t _______ ");
        System.out.println("\t\t/       \\");
        System.out.println("\t\t| #   # | ");
        System.out.println("\t\t|   @   |");
        System.out.println("\t\t|  ---  |");
        System.out.println("\t\t|_______|");
    }
    
    /**************************************************************************/
    
    private static void fallo2()
    {
        System.out.println("\t\t _______ ");
        System.out.println("\t\t/       \\");
        System.out.println("\t\t| #   # | ");
        System.out.println("\t\t|   @   |");
        System.out.println("\t\t|  ---  |");
        System.out.println("\t\t|_______|");
        for (int i = 1; i<= 6; i++)
            System.out.println("\t\t  |   |");
    }
    
    /**************************************************************************/
    
    private static void fallo3()
    {
        System.out.println("\t\t _______ ");
        System.out.println("\t\t/       \\");
        System.out.println("\t\t| #   # | ");
        System.out.println("\t\t|   @   |");
        System.out.println("\t\t|  ---  |");
        System.out.println("\t\t|_______|");
        for (int i = 1; i<= 2; i++)
            System.out.println("\t\t  |   |");
            System.out.println("\t\t  |   |");
            System.out.println("\t\t  |   |---------<");
        for (int i = 1; i<= 3; i++)
            System.out.println("\t\t  |   |");    
    }
        
    /**************************************************************************/
    
    private static void fallo4()
    {
        System.out.println("\t\t _______ ");
        System.out.println("\t\t/       \\");
        System.out.println("\t\t| #   # | ");
        System.out.println("\t\t|   @   |");
        System.out.println("\t\t|  ---  |");
        System.out.println("\t\t|_______|");
        for (int i = 1; i<= 2; i++)
            System.out.println("\t\t  |   |");
            System.out.println("\t\t  |   |");
            System.out.println("\t>---------|   |---------<");
        for (int i = 1; i<= 3; i++)
            System.out.println("\t\t  |   |");    
    }
    
    /**************************************************************************/
    
    private static void fallo5()
    {
        System.out.println("\t\t _______ ");
        System.out.println("\t\t/       \\");
        System.out.println("\t\t| #   # | ");
        System.out.println("\t\t|   @   |");
        System.out.println("\t\t|  ---  |");
        System.out.println("\t\t|_______|");
        for (int i = 1; i<= 2; i++)
            System.out.println("\t\t  |   |");
            System.out.println("\t\t  |   |");
            System.out.println("\t>---------|   |---------<");
        for (int i = 1; i<= 3; i++)
            System.out.println("\t\t  |   |");
        System.out.println("\t\t       \\");
        System.out.println("\t\t        \\");
        System.out.println("\t\t         \\");
        System.out.println("\t\t          \\");
    }
    
    /**************************************************************************/

    private static void fallo6()
    {
        
        System.out.println("\t\t _______ ");
        System.out.println("\t\t/       \\");
        System.out.println("\t\t| #   # | ");
        System.out.println("\t\t|   @   |");
        System.out.println("\t\t|  ---  |");
        System.out.println("\t\t|_______|");
        for (int i = 1; i<= 2; i++)
            System.out.println("\t\t  |   |");
            System.out.println("\t\t  |   |");
            System.out.println("\t>---------|   |---------<");
        for (int i = 1; i<= 3; i++)
            System.out.println("\t\t  |   |");
        System.out.println("\t         /     \\");
        System.out.println("\t        /       \\");
        System.out.println("\t       /         \\");
        System.out.println("\t     _/           \\_");
    }
    
    /**************************************************************************/

    private static void fallo7()
    {
        for (int i = 1; i<= 2; i++)
            System.out.println("\t\t  |   |");
            System.out.println("\t\t  |   |");
            System.out.println("\t>---------|   |---------<");
        for (int i = 1; i<= 3; i++)
            System.out.println("\t\t  |   |");
        System.out.println(" _______         /     \\");
        System.out.println("/       \\       /       \\");
        System.out.println("| -   - |      /         \\");
        System.out.println("|   -   |    _/           \\_");
    } 
}
