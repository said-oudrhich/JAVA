package Practica1FastFood;

public class Cliente {
    private String nombre;
    private Plato plato1;
    private Plato plato2;
    private Plato plato3;

    private int contadorPlatos;
    
    //**************************************************************************
    //**************************************************************************
    
    public Cliente(String nombre) {
        this.nombre = nombre;
        contadorPlatos = 0;
    }
    
    //**************************************************************************
    
    public String getNombre() {
        return nombre;
    }
    
    //**************************************************************************
    
    public void hacerPedido (Plato p){
        if (contadorPlatos < 3) {
            if (plato1 == null)
                plato1 = p;
            else if (plato2 == null)
                plato2 = p;
            else
                plato3 = p;
            contadorPlatos++;
        } else
            System.out.println("Ya se han pedido 3 platos.");
        
    }

    //**************************************************************************
    
    public void visualizarMisPlatos(){
        double total = 0;
        
        System.out.println("Este es el pedido de: "+ getNombre());
        System.out.println("------------------------------------");
        
        if (plato1 != null) {
            System.out.println(plato1.toString());
            total += plato1.getPrecio();
        }
        if (plato2 != null) {
            System.out.println(plato2.toString());
            total += plato2.getPrecio();
        }
        if (plato3 != null) {
            System.out.println(plato3.toString());
            total += plato3.getPrecio();
        }
        System.out.println("\nTOTAL: " + total);
    }
}
