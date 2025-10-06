
package excepciones;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ejemplo3 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce números. El cero para salir");			

        int numero = -1;
        while (numero != 0)
        {
            try 
            {
                numero = entrada.nextInt();
            
                if (numero != 0)
                    lista.add(numero);
            }   
            //catch (Exception ime)
            catch (InputMismatchException ime)
            {
                System.out.println("¡Cuidado! Solo puedes insertar números. ");
                entrada.next();
            }			
        }
        if (lista.size() != 0){
            System.out.println("Has introducido : ");
            for (int i:lista)
                System.out.print(i+"  ");
        }
    }
}//class
