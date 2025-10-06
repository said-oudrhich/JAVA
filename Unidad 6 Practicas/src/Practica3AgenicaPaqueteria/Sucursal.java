package Practica3AgenicaPaqueteria;

class Sucursal {
    private String nombre;
    private String direccion;
    private String encargado;
    private Paquete[] paquetes;
    private int contador;

    public Sucursal(String nombre, String direccion, String encargado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.encargado = encargado;
        this.paquetes = new Paquete[4];
        this.contador = 0;
    }

    public boolean agregarPaquete(Paquete p) {
        if (contador < 4) {
            paquetes[contador++] = p;
            return true;
        }
        return false;
    }

    public void imprimirPaquetes() {
        System.out.println("\n--- Sucursal: " + nombre + " ---");
        System.out.println("Dirección: " + direccion);
        System.out.println("Encargado: " + encargado);
        for (int i = 0; i < contador; i++) {
            System.out.println(paquetes[i]);
        }
    }
}