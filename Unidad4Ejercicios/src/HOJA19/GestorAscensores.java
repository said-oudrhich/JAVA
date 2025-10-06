package HOJA19;

import java.util.Scanner;

public class GestorAscensores {
    public static void main(String[] args) {

        Ascensor ascensor[] = new Ascensor[10];
        int ascensorSolicitado = -1;
        
        inicializarAscensores(ascensor);
        imprimir(ascensor);
        
       
        do {       
            ascensorSolicitado = solicitud();
            ascensorCercano(ascensorSolicitado, ascensor).cambiosAscensor(ascensorSolicitado);
            imprimir(ascensor);
        } while (ascensorSolicitado != -1);
       
        System.out.println("Saliendo del programa...");
        
    }
    
    
    //**************************************************************************
    
    static void inicializarAscensores(Ascensor ascensor[]){
    
        for (int i = 0; i < ascensor.length; i++) {
            if (i <= 1) 
                ascensor[i] = new Ascensor(i+1, 0);
            else {
                if (i <= 6)
                    ascensor[i] = new Ascensor(i+1, 36);
                else
                    ascensor[i] = new Ascensor(i+1, 77);
            }
        }
    }
    
    //**************************************************************************
    
    static int solicitud(){
        Scanner entrada = new Scanner(System.in);
       
        int opcion, planta;
        
        do {
            System.out.println("--------------------------");
            System.out.println("| 1. Solicitar ascensor  |");
            System.out.println("| 2. Salir               |");
            System.out.println("--------------------------");
            System.out.print("Elige opcion: ");
            opcion = entrada.nextInt();
        } while (opcion > 2 || opcion < 1);
        
        if (opcion == 1) {
            System.out.print("Introduce la planta donde se solicita el ascensor (-4 hasta 71): ");
            planta = entrada.nextInt();
            if (planta > 71 || planta < -4)
                System.out.println("La planta introducida es incorrecta");
            else
                return planta;
        }
        // En caso de pulse 2
        return -1;
    }
    
    //**************************************************************************
    
    static Ascensor ascensorCercano(int plantaSolicitada, Ascensor ascensor[]){
        
        Ascensor ascensorElegido = null;
        int distancia, menorDistancia;
        
        menorDistancia = Math.abs(ascensor[0].getPlantaActual() - (plantaSolicitada));
        ascensorElegido = ascensor[0];
        
        // Por cada objeto, si encuentra uno mas cerca lo guarda en la en el objeto ascensorElegido
        //Si la distancia entre la solicitada y el ascensor es menor lo guarda
        //así recorriendo todos lo ascensores
        for (Ascensor ascensores : ascensor) {
            distancia = Math.abs(ascensores.getPlantaActual() - (plantaSolicitada));
            if (distancia < menorDistancia) {
                menorDistancia = distancia;
                ascensorElegido = ascensores;
            }
        }
        return ascensorElegido;
    }
    
    //**************************************************************************
    
    static void imprimir(Ascensor ascensor[]){
        for (Ascensor cadaAscensor : ascensor) {
            System.out.println(cadaAscensor.toString());
        }
    }
   
    
}//Class
