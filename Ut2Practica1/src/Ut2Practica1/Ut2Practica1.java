package Ut2Practica1;
public class Ut2Practica1 {
    public static void main(String[] args) {
        
        // Creamos las fracciones
        Fraccion frac1 = new Fraccion(2,3);
        Fraccion frac2 = new Fraccion(9,4);
        Fraccion frac3 = new Fraccion(5);
        
        System.out.println("Fraccion 1: "+frac1.toString());
        System.out.println("Fraccion 2: "+frac2.toString());
        System.out.println("Fraccion 3: "+frac3.toString());
        
        //llamamos a los getters para pedir cierta info
        System.out.println(frac3.getDenominador());
        System.out.println(frac2.getNumerador());
        System.out.println(frac1.getTipo());
        
        //frac1 llama al metodo multiplica
        frac1.multiplica(4, 3);
        System.out.println("Fraccion 1: "+frac1.toString());
    }
}
