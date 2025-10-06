package HOJA1;

import java.util.Scanner;

/*
Calcular y visualizar la suma de los números pares comprendidos entre M y
N (ambos incluidos). M y N se le piden al usuario
*/
public class Ej_1 {
    public static void main(String[] args) {
        
        int m;
        int n;
        int suma = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce M (Num alto): ");
        m = entrada.nextInt();
        
        System.out.println("Introduce N (Num najo): ");
        n = entrada.nextInt();
        

        // Asegurarnos de que M sea mayor o igual que N
        // Si no es así se cambia el num de n a m y el de m a n
        if (m < n) {
            int temp = n;
            n = m;
            m = temp;
        }

        // Calcular la suma de los números pares entre M y N
        
        for (int i = n; i <= m; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
            }
        }
        
        // Mostrar la suma
        System.out.println("La suma de los números pares entre " + m + " y " + n + " es: " + suma);
    }
}