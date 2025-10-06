package Practica2FastFood;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<Plato> Platos;

    
    //**************************************************************************
    //**************************************************************************

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.Platos = new ArrayList<>();
    }
    
    //**************************************************************************
    
    public String getNombre() {
        return nombre;
    }
    
    //**************************************************************************
    
    public void hacerPedido (Plato p){
        Platos.add(p);
        
    }

    //**************************************************************************
    
    public void visualizarMisPlatos(){
        double total = 0;
        
        System.out.println("Este es el pedido de: "+ getNombre());
        System.out.println("------------------------------------");
        for (Plato p : Platos) {
            System.out.println(p);
            total += p.getPrecio();
        }
        System.out.println("\nTOTAL: " + total);
    }
}
