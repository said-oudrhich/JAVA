package excepciones;

import java.util.Arrays;

public class ejemplo1 
{

    public static void main(String args[])
    {
        try 
        {
            int a[] = new int[5];
            for (int i=0 ; i<= a.length ; i++)
                a[i] = i; 
            System.out.println(Arrays.toString(a));
            // size 5
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array se sale del rango");
        }
    }
}//class ejemplo1
