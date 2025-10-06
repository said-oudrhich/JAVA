package HOJA1;

import java.io.*;
import java.util.*;

public class SepararNumeros {
    
    public static void main(String[] args) {
        // Crear las listas para los números pares e impares
        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();
        
        // Ruta del archivo de entrada
        String archivoEntrada = "/home/m/Descargas/numeros.txt";
        
        // Ruta de los archivos de salida
        String archivoPares = "/home/m/Descargas/pares.txt";
        String archivoImpares = "/home/m/Descargas/impares.txt";
        
        // Leer el archivo de entrada
        try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada))) {
            String linea;
            
            // Leer cada línea del archivo
            while ((linea = br.readLine()) != null) {
                // Convertir la línea a entero
                try {
                    int numero = Integer.parseInt(linea.trim());
                    
                    // Clasificar el número como par o impar
                    if (numero % 2 == 0)
                        numerosPares.add(numero); // Si es par, agregar a la lista de pares
                    else
                        numerosImpares.add(numero); // Si es impar, agregar a la lista de impares
                    
                } catch (NumberFormatException e) {
                    System.out.println("Error al leer el número: " + linea);
                }
            }
            
            // Escribir los números pares en el archivo pares.txt
            try (BufferedWriter bwPares = new BufferedWriter(new FileWriter(archivoPares))) {
                for (Integer numero : numerosPares)
                    bwPares.write(numero + "\n");
                
            } catch (IOException e) {
                System.out.println("Error al escribir el archivo de pares: " + e.getMessage());
            }
            
            // Escribir los números impares en el archivo impares.txt
            try (BufferedWriter bwImpares = new BufferedWriter(new FileWriter(archivoImpares))) {
                for (Integer numero : numerosImpares)
                    bwImpares.write(numero + "\n");
                
            } catch (IOException e) {
                System.out.println("Error al escribir el archivo de impares: " + e.getMessage());
            }

            System.out.println("Archivos generados con éxito: " + archivoPares + " y " + archivoImpares);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
