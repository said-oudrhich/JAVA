package apiMath;

public class claseMath 
{
    public static void main(String[] args) 
    {
        double a,b,c,d;
        int numero, i;
        
        a = 2.0;
        b = 3.0;
        c = 4.5;
        d = -2.5;
        
        // algunos m�todos de la clase Math
        System.out.println("El valor absoluto de d = "  + Math.abs(d));
        System.out.println("Redondeo de c con round "   + Math.round(c));
        System.out.println("Redondeo de c con ceil "    + Math.ceil(c));
        System.out.println("Redondeo de c con floor "   + Math.floor(c));
        System.out.println("a elevado a b = " + (int)Math.pow(a, b));
        System.out.println("\nN�mero aleatorio entre 1 y 100  = " + (int)(Math.random()*100+1));
        System.out.println("\ndel valor [-2.5] primero valor absoluto y luego redondea");
        System.out.println( Math.round(Math.abs(d)));
        
        // este bucle imprime 10 n�meros aleatorios en el rango [1..100]
        System.out.println("\n10 n�meros aleatorios en el rango [1..100]");
        for (i = 1 ; i <= 10 ; i++ )
        {
            numero = (int)(Math.random()*100+1);
            System.out.print(numero+"  ");
        }
        // este bucle imprime 10 n�meros aleatorios en el rango [5..9]
        System.out.println("\n\n10 n�meros aleatorios en el rango [5..9]");
        int desde = 5, hasta = 9;
        for (i = 1 ; i <= 10 ; i++ )
        {
            numero = (int)(Math.random()*(hasta-desde+1)+desde);
            System.out.print(numero+"  ");
        }
    }//main()
}//class
