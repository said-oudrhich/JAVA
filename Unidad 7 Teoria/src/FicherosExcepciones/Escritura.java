package FicherosExcepciones;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Escritura 
{
    public static void main(String[] args)  
    {
        Scanner entrada = new Scanner(System.in);
        FileWriter fw = null;
        String cadena;
        try 
        {
            fw = new FileWriter("/home/m/Descargas/ejemplo.txt");
            PrintWriter salida = new PrintWriter(fw);
            
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
            cadena = entrada.nextLine();                //se introduce por teclado una cadena de texto    
            while (!cadena.equalsIgnoreCase("FIN")) 
            {
                salida.println(cadena);                 //se escribe la cadena en el fichero
                cadena = entrada.nextLine();             
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());                                                                   
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (fw != null) 
                    fw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }
    }//main()
}//class