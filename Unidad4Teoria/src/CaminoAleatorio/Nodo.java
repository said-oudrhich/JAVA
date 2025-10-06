package CaminoAleatorio;

public class Nodo 
{
    private int numNodo;
    private int sigNodo  = -1;
    
    /*********************************************************************/
    /*********************************************************************/
    
    public Nodo(int numNodo) 
    {
        this.numNodo = numNodo;
    }
    /*********************************************************************/
    public void setSigNodo(int sigNodo) {
        this.sigNodo = sigNodo;
    }
    /*********************************************************************/
    public int getNumNodo() {
        return numNodo;
    }
    /*********************************************************************/
    public int getSigNodo() {
        return sigNodo;
    }
    /*********************************************************************/
    @Override
    public String toString() {
        return "Nodo{" + "numNodo=" + numNodo + ", sigNodo=" + sigNodo + '}';
    }
    /*********************************************************************/  
    
}