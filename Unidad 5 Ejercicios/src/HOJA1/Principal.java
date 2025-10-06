package HOJA1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        
        generarNumeros(lista);
        visualizarLista(lista);
        
        System.out.println("Suma de los numeros: " + sumarNumeros(lista));
        
        insertarUnos(lista);
        visualizarLista(lista);
        
        eliminarImpares(lista);
        visualizarLista(lista);
    }

    public static void generarNumeros(ArrayList<Integer> lista) {
        
        for (int i = 0; i < 20; i++) {
            lista.add((int)(Math.random() * 5) + 1);
        }
    }

    public static void visualizarLista(ArrayList<Integer> lista) {
        System.out.println(lista);
    }

    public static int sumarNumeros(ArrayList<Integer> lista) {
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return suma;
    }

    public static void insertarUnos(ArrayList<Integer> lista) {
        lista.add(0, 1);
        lista.add(1);
    }

    public static void eliminarImpares(ArrayList<Integer> lista) {
        lista.removeIf(i -> (i % 2 != 0));
    }
}