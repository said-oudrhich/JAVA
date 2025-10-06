package bocatas;

import java.util.Scanner;

/*

Menú de un restaurante de bocadillos. Diseñar un algoritmo capaz de leer el número
de unidades consumidas de cada producto y escriba la nota con el precio

Vamos a suponer que estos precios son fijos.
Producto      Precio
Bocadillo      3,5 €
Refresco       2,25 €
Cerveza        2,75 €
*/
public class Principal {
    public static void main(String[] args) {
        
        int cantidad;
        double total, precioBocata, precioRefresco, precioCerveza;
        
        precioBocata = 3.5;
        precioRefresco = 2.25;
        precioCerveza = 2.75;
        
        System.out.println("Bocadillo      3,5 €");
        System.out.println("Refresco       2,25 €");
        System.out.println("Cerveza        2,75 €");
        
        
        System.out.println("¿Cuantos bocatas quieres?");
        Scanner entrada = new Scanner(System.in);
        cantidad = entrada.nextInt();
        total = (cantidad * precioBocata);
        
        System.out.println("¿Cuantos Refrescos quieres?");
        cantidad = entrada.nextInt();
        total = total + (cantidad * precioRefresco);
        
        System.out.println("¿Cuantas Cervezas quieres?");
        cantidad = entrada.nextInt();
        total = total + (cantidad * precioCerveza);
        
        System.out.println("El total de la compra es: "+total);
    }
    
}
