package ut3.practica3;

import java.util.Scanner;

public class UT3Practica3 {
    public static void main(String[] args) {
        int entidad; // 4 dígitos
        int oficina; // 4 dígitos
        long cuenta; // 10 dígitos
        
        int suma1 = 0, suma2 = 0;

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el número de la Entidad (4 dígitos): ");
        entidad = entrada.nextInt();
        System.out.print("Introduce el número de la Oficina (4 dígitos): ");
        oficina = entrada.nextInt();
        System.out.print("Introduce el número de Cuenta (10 dígitos): ");
        cuenta = entrada.nextLong();
        
        entrada.close();
        
        
        // Calcular primer dígito de control (cc1)
        suma1 += (entidad / 1000) * 10;          
        suma1 += ((entidad / 100) % 10)* 5;    
        suma1 += ((entidad / 10) % 10) * 8;     
        suma1 += (entidad % 10) * 4;            

        suma1 += (oficina / 1000) * 6;           
        suma1 += ((oficina / 100) % 10) * 3;     
        suma1 += ((oficina / 10) % 10) * 7;      
        suma1 += (oficina % 10) * 9;
        
        suma1 = 11 - (suma1 % 11);

        if (suma1 == 10) {
            suma1 = 1;
        } else if (suma1 == 11) {
            suma1 = 0;
        }

        
        // Calcular los dígitos de la cuenta para cc2
        suma2 += (cuenta / 1000000000 % 10) * 1;
        suma2 += (cuenta / 100000000 % 10) * 2;
        suma2 += (cuenta / 10000000 % 10) * 4;
        suma2 += (cuenta / 1000000 % 10) * 8;
        suma2 += (cuenta / 100000 % 10) * 5;
        suma2 += (cuenta / 10000 % 10) * 10;
        suma2 += (cuenta / 1000 % 10) * 9;
        suma2 += (cuenta / 100 % 10) * 7;
        suma2 += (cuenta / 10 % 10 * 3);
        suma2 += (cuenta % 10) * 6;
        
        suma2 = 11 - (suma2 % 11);
        
        if (suma2 == 10) {
            suma2 = 1;
        } else if (suma2 == 11) {
            suma2 = 0;
        }
        
        // Resultado
        System.out.println("Cuenta: " + entidad + "-" + oficina + "-" + suma1 + suma2 + "-" + cuenta);
        System.out.println("El primer dígito del código de control es: " + suma1);
        System.out.println("El segundo dígito del código de control es: " + suma2);
    }
}
