package examentema4saidoudrhich;

public class Principal {

    public static void main(String[] args) {
        
        int jugadas = 5;
        int totalAciertos = 0;
        Jugada[] jugada = new Jugada[jugadas];

        
        for (int i = 0; i < jugadas; i++) {
            jugada[i] = new Jugada((i+1));
            System.out.println("Soy la Jugada: "+ (i+1));
            jugada[i].imprimirMatriz();
            System.out.println("He encontrado " + jugada[i].getAciertos() + " TRES EN RAYA");
            System.out.println("-------------------------------");
            totalAciertos += jugada[i].getAciertos();
        }
        
        System.out.println("");
        System.out.println("TOTAL TRES EN RAYA ENCONTRADOS: " + totalAciertos);

        
        
        Jugada mejorJugada = Jugada.mayorDeDos(jugada[jugadas - 2], jugada[jugadas - 1]);

        if (mejorJugada == null)
            System.out.println("HAN EMPATADO LOS DOS JUGADORES");
        else
            System.out.println("DE LAS DOS ÚLTIMAS JUGADAS, LA QUE MÁS ACIERTOS TIENE ES LA: " + mejorJugada.getNumJugador());
        
    }
    
}
