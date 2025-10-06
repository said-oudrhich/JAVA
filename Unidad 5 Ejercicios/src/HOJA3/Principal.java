package HOJA3;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        ArrayList<Atleta> finalistas = new ArrayList<>();
        ArrayList<Atleta> podios = new ArrayList<>();
        

        crearFinalistas(finalistas);
        imprimir(finalistas);
        crearPodio(finalistas, podios);
        System.out.println("\n****** EL PODIO QUEDA ASÍ ******");
        
        imprimir(podios);

    }
    
    /**********************************************************/
    
    static void crearFinalistas(ArrayList<Atleta> finalistas)
    {
        String nombre;
        
        for (int i = 0; i < 8; i++) {
            nombre = "finalista" + Integer.toString(i+1);
            finalistas.add(new Atleta(nombre, (i+1)));
        }
    }//crearFinalistas()
    
    /**********************************************************/
    
    static void imprimir(ArrayList<Atleta> finalistas)
    {
        for (Atleta atleta : finalistas)
            System.out.println(atleta.toString());
    }
    
    /**********************************************************/
    
    static void crearPodio(ArrayList<Atleta> finalistas, 
                           ArrayList<Atleta> podio)
    {
        Atleta mejorAtleta = null;
        
        for (int vez = 1; vez <= 3; vez++)  // buscamos a los 3 medallistas
        {
            mejorAtleta = buscaMejorMarca(finalistas);
            podio.add(mejorAtleta);
        }
    }//crearPodio
    
    /***********************************************************************/
    
    static private Atleta buscaMejorMarca(ArrayList<Atleta> finalistas)
    {
        double mejorActual = 10.0;    // nadie tiene esta marca tan alta
        Atleta mejorAtleta = null;
        
        for (Atleta atleta : finalistas)
            if ((atleta.getMarcaFinal() < mejorActual) && (atleta.isPremio()!= true))
            {
                mejorActual = atleta.getMarcaFinal();
                mejorAtleta = atleta;
            }    
        
        // para que no vuelva a ser elegido ponemos premio a true
        mejorAtleta.setPremio(true);
        return (mejorAtleta);
    }
}
