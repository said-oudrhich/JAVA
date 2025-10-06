package ut3.practica2;
public class UT3Practica2 {
    public static void main(String[] args) {
        
        double sumatorio = 0.0;  // Variable que acumula la suma de los términos
        double termino;          // Término individual de la serie
        double limite = 0.0000001; // Límite de precisión (mil-millonésima)
        int i = 0;
        boolean flag = true;
        double pi;
        double denominador;
        
        // Usamos un for con un límite arbitrario, ya que el número de iteraciones depende de la precisión
        while (flag == true){
            // Calculamos el denominador de la serie (número impar)
            denominador = 2 * i + 1;
            // Calculamos el término, alternando el signo (sumando o restando)
            if (i % 2 == 0) {
                termino = 1.0 / denominador;  // Término positivo
            } else {
                termino = -1.0 / denominador; // Término negativo
            }

            // Sumamos el término al sumatorio
            sumatorio += termino;

            // Verificamos si el valor absoluto del término es menor que el límite
            if (Math.abs(termino) < limite) {
                flag = false; // Si es menor, terminamos el ciclo
            }

            // Pasamos al siguiente término (aumentamos i)
            i++;
        }

        // Calculamos PI multiplicando el sumatorio por 4
        pi = sumatorio * 4;

        // Mostramos el resultado
        System.out.println("Aproximación de PI: " + pi);
        
    }// Main
}// Class
