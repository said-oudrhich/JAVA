package Practica3AgenicaPaqueteria;

import java.util.Scanner;

public class Agencia {
    private Sucursal sucursalA;
    private Sucursal sucursalB;
    private Scanner entrada;

    public void Agencia() {
        entrada = new Scanner(System.in);
        System.out.println("Introduce los datos de la Sucursal A:");
        System.out.print("Encargado: ");
        String encA = entrada.nextLine();
        
        System.out.print("Dirección: ");
        String dirA = entrada.nextLine();
        sucursalA = new Sucursal("Sucursal A", dirA, encA);

        System.out.println("\nIntroduce los datos de la Sucursal B:");
        System.out.print("Encargado: ");
        String encB = entrada.nextLine();
        
        System.out.print("Dirección: ");
        String dirB = entrada.nextLine();

        sucursalB = new Sucursal("Sucursal B", dirB, encB);

        generarPaquetes();
        imprimirResultados();
    }

    public void asignarSucursal(Paquete p) {
        if (!sucursalA.agregarPaquete(p))
            if (!sucursalB.agregarPaquete(p))
                System.out.println("\nAmbas sucursales están llenas. No se puede añadir el paquete con ID " + p.getId());
            
    }

    public void generarPaquetes() {
        asignarSucursal(new Sobre(70, false, "Rojo"));
        asignarSucursal(new Caja(230, false));
        asignarSucursal(new Caja(2078, true));
        asignarSucursal(new Sobre(182, true, "Verde"));
        asignarSucursal(new Caja(210, true));
        asignarSucursal(new Caja(1000, false));
        asignarSucursal(new Sobre(160, true, "Azul"));   
    }
    

    public void imprimirResultados() {
        sucursalA.imprimirPaquetes();
        sucursalB.imprimirPaquetes();
    }

    public static void main(String[] args) {
        new Agencia();
    }
}

