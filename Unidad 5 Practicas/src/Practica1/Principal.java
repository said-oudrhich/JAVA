package Practica1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<DireccionIp> lista = new ArrayList<>();
        int numIps;
        String ipScanner;
        
        System.out.println("Introduce direcciones IP (escribe exit para salir):");
        while (true) {
            ipScanner = entrada.nextLine();
            if (ipScanner.equalsIgnoreCase("exit"))
                break;
            lista.add(new DireccionIp(ipScanner));
        }
        
        System.out.print("Introduce cuantas IP aleatorias quieres: ");
        numIps = entrada.nextInt();
        for (int i = 0; i < numIps; i++) {
            DireccionIp ip1 = new DireccionIp("0.0.0.0");
            ip1.generaAleatoria();
            lista.add(ip1);
        }

        System.out.println("\nResumen de direcciones ingresadas:");
        for (DireccionIp ip : lista)
            System.out.println(ip);
        
        
        System.out.println("Cantidad de direcciones por clase:");
        System.out.println("Clase A: " + DireccionIp.getContadorA());
        System.out.println("Clase B: " + DireccionIp.getContadorB());
        System.out.println("Clase C: " + DireccionIp.getContadorC());
    }
}