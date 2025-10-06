package triangulo;
import java.util.Scanner;

/*
    Programa para calcular área de un triángulo
*/

public class Triangulo {
    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la Base: ");
        base = entrada.nextInt();
        System.out.println("Introduce la Altura: ");
        altura = entrada.nextInt();
        
        area = (base * altura) / 2;
        System.out.println("El área del tríangulo es = "+area);
    }//main()
}
