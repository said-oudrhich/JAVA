package estudioscanner;

//Estudiamos la clase de Scanner
import java.util.Scanner;

public class EstudioScanner {
    public static void main(String[] args) {
        int edad;
        double peso;
        String nombre, ciclo;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame tu nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Dame tu edad: ");
        edad = entrada.nextInt();
        
        System.out.println("Dame tu peso: ");
        peso = entrada.nextDouble();
        
        entrada.nextLine(); //hay que poner esto antes de leer un caracter ya que hemos leido antes un numero
        System.out.println("Dime tu ciclo: ");
        ciclo = entrada.nextLine();
        
        System.out.println("NOMBRE: "+nombre+" EDAD: "+edad+" PESO: "+peso+" CICLO: "+ciclo);
    }
}
