package HOJA15;
import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num;
        String idPedido;
        String nombreBorrar;
        
        System.out.print("Introduce el número de electrodomésticos: ");
        num = entrada.nextInt();
        
        Electrodomestico[] electrodomesticos = new Electrodomestico[num];
        entrada.nextLine(); // Limpia buffer

        // Llamamos al método para leer los electrodomésticos
        for (int i = 0; i < num; i++) {
            electrodomesticos[i] = new Electrodomestico(); // CreO un objeto vacío para asignar valores a continuacion
            leerElectrodomestico(electrodomesticos[i], i + 1, entrada);
        }

        // Pedimos el ID para desglosar el precio
        System.out.print("Introduce el ID para desglosar precio: ");
        idPedido = entrada.nextLine();
        
        // Llamamos al método para desglosar el precio
        desglosarPrecioPorId(idPedido, electrodomesticos);
        
        // Pedimos el nombre para borrar un producto
        System.out.print("Introduce el nombre para borrar el electrodoméstico: ");
        nombreBorrar = entrada.nextLine();
        
        // Llamamos al método para poner a null ese objeto
        borrarElectrodomesticos(nombreBorrar, electrodomesticos);
        
        // Llamamos al método para mostrar todos los electrodomésticos
        mostrarElectrodomesticos(electrodomesticos);
    }
    
    //**************************************************************************
    
    // Método para leer los datos de un electrodoméstico
    private static void leerElectrodomestico(Electrodomestico electrodomestico, int numero, Scanner entrada) {
        System.out.println("Electrodoméstico " + numero);
        System.out.print("ID: ");
        electrodomestico.setId(entrada.nextLine());
        
        System.out.print("Nombre: ");
        electrodomestico.setNombre(entrada.nextLine());
        
        System.out.print("Precio: ");
        electrodomestico.setPrecio(entrada.nextDouble());
        
        System.out.print("Precio instalación: ");
        electrodomestico.setPrecioInstalacion(entrada.nextInt());
        
        System.out.print("Potencia (W): ");
        electrodomestico.setPotencia(entrada.nextInt());
        entrada.nextLine(); // Limpia buffer
    }
    
    //**************************************************************************
    
    // Método para desglosar el precio por ID
    private static void desglosarPrecioPorId(String idPedido, Electrodomestico[] electrodomesticos) {
        
        for (int i = 0; i < electrodomesticos.length; i++) 
            if (electrodomesticos[i].getId().equals(idPedido)) 
                electrodomesticos[i].desglosarPrecio();

    }
    
    //**************************************************************************
    
    // Método para mostrar todos los electrodomésticos
    private static void mostrarElectrodomesticos(Electrodomestico[] electrodomesticos) {
        
        System.out.println("Todos los electrodomésticos:");
        for (int i = 0; i < electrodomesticos.length; i++) 
            if (electrodomesticos[i] != null) 
                System.out.println(electrodomesticos[i].toString());
            
    }
    
    //**************************************************************************
    
    // Método para borrar electrodomésticos
    private static void borrarElectrodomesticos(String nombreBorrar, Electrodomestico[] electrodomesticos) {
        
        for (int i = 0; i < electrodomesticos.length; i++)
            if (electrodomesticos[i].getNombre().equals(nombreBorrar))
                electrodomesticos[i] = null;
            
    }
}