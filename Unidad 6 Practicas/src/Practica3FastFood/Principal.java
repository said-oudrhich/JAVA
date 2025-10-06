package Practica3FastFood;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private static ArrayList<Plato> carta;
    private static ArrayList<Cliente> clientes;
    private static Scanner entrada;

    public static void main(String[] args) {
        clientes = new ArrayList<>();
        entrada  = new Scanner(System.in);
        
        inicializarCarta();
        procesarPedidos();
        mostrarResumenPedidos();
    }
    
    //**************************************************************************
    
    // Crea y añade los platos disponibles a la carta
    private static void inicializarCarta() {
        carta = new ArrayList<>();
        
        carta.add(new Ternera("simple", 15.5, "Hamburguesa de ternera básica"));
        carta.add(new Buey("doble", 25.5, "Hamburguesa de ternera doble"));
        carta.add(new Vegetariana("simple", 19.0, "Hamburguesa vegetariana"));
        
        carta.add(new MasaFina("pequeña", 16.75, "Pizza masa fina pequeña"));
        carta.add(new MasaFina("mediana", 25.0, "Pizza masa fina mediana"));
        carta.add(new MasaFina("grande", 31.25, "Pizza masa fina grande"));
        
        carta.add(new MasaGruesa("pequeña", 20.0, "Pizza masa gruesa pequeña"));
        carta.add(new MasaGruesa("mediana", 28.0, "Pizza masa gruesa mediana"));
        carta.add(new MasaGruesa("grande", 33.60, "Pizza masa gruesa grande"));
    }
    
    //**************************************************************************
    
    // Procesa los pedidos de todos los clientes
    private static void procesarPedidos() {
        System.out.print("Cuántos clientes van a pedir?: ");
        int numClientes = entrada.nextInt();
        entrada.nextLine(); // Limpiar buffer

        for (int i = 0; i < numClientes; i++) {
            Cliente cliente = registrarCliente(i);
            procesarPedidoCliente(cliente);
            clientes.add(cliente);
        }
    }
    
    //**************************************************************************
    
    // Registra un nuevo cliente
    private static Cliente registrarCliente(int indice) {
        System.out.print("Nombre del cliente " + (indice + 1) + ": ");
        String nombre = entrada.nextLine();
        return new Cliente(nombre);
    }
    
    //**************************************************************************
    
    // Procesa el pedido de un cliente
    private static void procesarPedidoCliente(Cliente cliente) {
        boolean seguirPidiendo = true;
        
        while (seguirPidiendo) {
            mostrarCarta();
            Plato platoSeleccionado = seleccionarPlato();
            
            if (platoSeleccionado != null) {
                cliente.hacerPedido(platoSeleccionado);
                seguirPidiendo = confirmarContinuarPedido();
            } else
                System.out.println("Plato no válido.");
            
        }
    }
    
    //**************************************************************************
    
    // Muestra la carta de platos disponibles
    private static void mostrarCarta() {
        System.out.println("\nCarta de platos:");
        for (int i = 0; i < carta.size(); i++)
            System.out.println((i + 1) + ". " + carta.get(i));
        
    }
    
    //**************************************************************************
    
    // Permite al usuario seleccionar un plato de la carta
    private static Plato seleccionarPlato() {
        System.out.print("Selecciona num de plato que quieres pedir: ");
        int opcion = entrada.nextInt();
        entrada.nextLine(); // Limpiar buffer

        if (opcion >= 1 && opcion <= carta.size())
            return carta.get(opcion - 1);
        
        return null;
    }
    
    //**************************************************************************
    
    // Pregunta al usuario si desea continuar pidiendo
    private static boolean confirmarContinuarPedido() {
        System.out.print("¿Quieres pedir otro plato? (s/n): ");
        String respuesta = entrada.nextLine();
        return respuesta.equalsIgnoreCase("s");
    }

    //**************************************************************************
    
    private static void mostrarResumenPedidos() {
        System.out.println("\n--- RESUMEN DE PEDIDOS ---");
        for (Cliente c : clientes) {
            c.visualizarMisPlatos();
        }
    }
}