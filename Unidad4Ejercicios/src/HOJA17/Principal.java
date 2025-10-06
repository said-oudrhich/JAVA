package HOJA17;

import hoja17.Electrodomestico;

public class Principal {
    public static void main(String[] args) {
        
        Electrodomestico electro1 = new Electrodomestico("tostadora", "Taurus", 49);
        Electrodomestico electro2 = new Electrodomestico("freidora", "magefesa", 84);
        Electrodomestico electro3 = new Electrodomestico("freidora", "magefesa", 115,7);
        Electrodomestico electro4 = new Electrodomestico("lavadora", "Bosch", 752, "gris", 'E', 84);
        Electrodomestico electro5 = new Electrodomestico("lavadora", "Balay", 617, 77);
        Electrodomestico electro6 = new Electrodomestico("frigorifico", "AEG", 491, "blanco", 'B', 69);
        Electrodomestico electro7 = new Electrodomestico("cuchillo electronico", "Bosch", 72);
        
        // Array de electrodomésticos
        Electrodomestico electrodomesticos[] = {electro1, electro2, electro3, electro4, electro5, electro6, electro7};
        
        // Mostrar los precios de todos los electrodomésticos
        System.out.println("Lista de electrodomésticos con sus precios finales:");
        for (Electrodomestico e : electrodomesticos) {
            e.verPrecios();
        }
        
        electro4.verPrecios();
    }

    //**************************************************************************
    
    // Método bosch() que filtra solo los electrodomésticos de la marca Bosch
    public static void bosch(Electrodomestico[] electrodomesticos) {
        System.out.println("\nElectrodomésticos de marca Bosch:");
        
        Electrodomestico[] boschElectrodomesticos = new Electrodomestico[electrodomesticos.length];
        int contador = 0;

        for (Electrodomestico e : electrodomesticos)
            if ("Bosch".equalsIgnoreCase(e.getMarca())) {
                boschElectrodomesticos[contador] = e;
                contador++;
            }
        

        // Mostrar los electrodomésticos de la marca Bosch
        for (int i = 0; i < contador; i++) 
            boschElectrodomesticos[i].verPrecios();
    }
}