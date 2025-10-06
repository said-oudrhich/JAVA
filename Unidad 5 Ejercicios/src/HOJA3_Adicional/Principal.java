package HOJA3_Adicional;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int hora, min;
        
        System.out.print("Introduce la hora: ");
        hora = entrada.nextInt();
        System.out.print("Introduce el minuto: ");
        min = entrada.nextInt();
        
        espejo(hora, min);

    }
    
    private static void espejo(int hora, int min){
        int hora1 = -1, min1 = -1;

        if (hora == 12 && min == 0)
            System.out.println(hora + ":" + min);
        else {
            if(min == 0){
                min1 = 0;
                hora1 = 12 - hora;
            }else{
                hora1 = 11 - hora;
                min1 = Math.abs(min - 60);
            }
            if (hora1 <= 0)
                hora1 += 12;
            
            System.out.println(hora1 + " : " + min1);
        }
    
    }
}
