package Zapatillas2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        ArrayList <Zapatilla> lista = new ArrayList<Zapatilla>();
        
        lista.add(new Zapatilla(1234, "adidas", 75.5));
        lista.add(new Zapatilla(5555, "converse", 49.0));
        lista.add(new Zapatilla(9876, "nike", 119.2));
        lista.add(new Zapatilla(1010, "salomon", 55.0));
        lista.add(new Zapatilla(2222, "adidas", 92.5));
        
        lista.add(new Zapatilla(4545, "nike", 100.25));
        
        //Muestra todas las zapatillas
        mostrarZapatillas(lista);
        
        System.out.println("");
        System.out.println(lista.get(2));
        
        //Muestra la zapatilla con ref 1010
        System.out.println(lista.get(buscarPorRef(lista, 1010)));
        
        //Borra la zapatilla con ref 4545
        lista.remove(buscarPorRef(lista, 4545));
        
        //Muestra todas las zapatillas
        mostrarZapatillas(lista);

       
    }
    
    //**************************************************************************
    
    static void mostrarZapatillas(ArrayList <Zapatilla> lista) {
        System.out.println("");
        for (Zapatilla zapatilla : lista)
            System.out.println(zapatilla.toString());
    }
    
    //**************************************************************************
    
    static int buscarPorRef(ArrayList <Zapatilla> lista, int refBuscada) {
        int pos = -1;
        System.out.println("");
        for (Zapatilla zapatilla : lista)
            if(zapatilla.getRef() == refBuscada)
                pos = lista.lastIndexOf(zapatilla);
        
        return pos;
    }
    
}
