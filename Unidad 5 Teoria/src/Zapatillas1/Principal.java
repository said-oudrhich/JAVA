package Zapatillas1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<Double>();
        

        lista.add(75.5);
        lista.add(49.0);
        lista.add(119.2);
        lista.add(55.0);
        lista.add(92.5);
        
        System.out.println(lista.toString());
        recorrerLista(lista);
        
        lista.add(100.25);
        lista.add(0, 200.15);
        lista.add(66.66);
        
    } //Main

    //**************************************************************************

    static void recorrerLista(ArrayList<Double> lista){
        System.out.println("");
        for (Double elemento : lista)
            System.out.println(elemento);

    }
} //Class
