package CaminoAleatorio;

public class Principal 
{
    public static void main(String[] args) 
    {
        final int numeroNodos = 5;    // n�mero de nodos parametrizado
        
        Nodo camino[] = new Nodo[numeroNodos];
        inicializarCamino(camino);
        generarCamino(camino,numeroNodos);
        imprimir(camino);
        
    }
    /**********************************************************************/
    static void inicializarCamino(Nodo camino[])
    {
        for (int i = 0; i < camino.length; i++) 
        {
            camino[i] = new Nodo(i);
        }
    }
    /**********************************************************************/
    static void generarCamino(Nodo camino[], int numeroNodos)
    {
        int nodoSeleccionado = 0;
        int nodoSigAleatorio;
                
        for (int i = 1; i <= numeroNodos-1; i++) 
        {
            // valor aleatorio [1..5]
            nodoSigAleatorio = (int)(Math.random()*(numeroNodos-1)+1);
            
            while (!correcto(camino,nodoSeleccionado,nodoSigAleatorio))
            {
                nodoSigAleatorio = (int)(Math.random()*(numeroNodos-1)+1);
            }
            camino[nodoSeleccionado].setSigNodo(nodoSigAleatorio);
            nodoSeleccionado = nodoSigAleatorio;
        }
    }
    /*******************************************************************/
    static boolean correcto(Nodo camino[], int nodoSeleccionado,
            int nodoSigAleatorio)
    {
        boolean ok = false;
        ok =(nodoSeleccionado != nodoSigAleatorio) &&
            (camino[nodoSigAleatorio].getSigNodo() == -1);
        
        return ok;
    }
    /*******************************************************************/
    static void imprimir (Nodo camino[])
    {
        for (int i = 0; i < camino.length; i++) 
        {
            System.out.println("NODO: " + camino[i].getNumNodo() + "    SIG: "+
                    camino[i].getSigNodo());
            
        }
        
        // otro modo de imprimir
        for (int i = 0; i < camino.length; i++) 
        {
            System.out.println(camino[i].toString());
            
        }
    }
}
