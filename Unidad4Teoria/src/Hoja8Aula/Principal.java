package Hoja8Aula;

/*
    Programa java que implemente estos dos vectores:
    int vector1[] = {1,2,16,29};
    int vector2[] = {3,19,70,83};
    Tras ello debe rellenar este otro vector : int ordenado[] = new int[8];
    con los valores de ambos en orden creciente. El resultado debe ser:
    ordenado ? 1 2 3 16 19 29 70 83
*/

public class Principal 
{
    public static void main(String[] args) 
    {
        int vector1[] = {1,2,16,29};
        int vector2[] = {3,19,70,83};
        int vectorFinal[] = new int[8];
        
        enfrentar(vector1, vector2, vectorFinal);
        
        imprimir(vector1, vector2, vectorFinal);
    }
    
    /****************************************************************/
    
    private static void enfrentar(int vector1[],int vector2[],int vectorFinal[])
    {
        boolean terminar = false;
        int i=0, j=0, k=0;
        
        while (!terminar)
        {
            if (vector1[i] < vector2[j])
            {
                vectorFinal[k] = vector1[i];
                i++;
            }
            else
            {    
                vectorFinal[k] = vector2[j];
                j++;
            }
            k++;
            
            if (i == vector1.length)   // se ha agotado vector1, vuelco el otro
            {    
                volcado(vector2, j, vectorFinal, k);
                terminar = true;
            }    
            if (j == vector2.length)   // se ha agotado vector2, vuelco el otro
            {    
                volcado(vector1, i, vectorFinal, k);
                terminar = true;
            }    
        }
    }//enfrentar()
    /****************************************************************/
    private static void volcado(int v[], int indice, int vectorFinal[], int indicevf)
    {
        for (int vcb = indice; vcb < v.length; vcb++)
        {    
            vectorFinal[indicevf] = v[vcb];
            indicevf++;
        }    
    }
    /****************************************************************/
    private static void imprimir (int v1[], int v2[], int vf[])
    {
        System.out.print("V1 -->  ");
        for (int i = 0; i < v1.length; i++)          
            System.out.print(v1[i]+"  ");
        System.out.print("\nV2 -->  ");
        for (int i = 0; i < v1.length; i++)          
            System.out.print(v2[i]+"  ");
        System.out.print("\nVFinal -->  ");
        for (int i = 0; i < vf.length; i++)          
            System.out.print(vf[i]+"  ");
    }//imprimir()
    
}//class
