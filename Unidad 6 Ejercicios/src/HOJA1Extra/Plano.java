package HOJA1Extra;

public class Plano {
    public static void main(String[] args) {
        // Instanciar 2 rectángulos
        System.out.println("=== RECTÁNGULOS ===");
        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo();
        
        // Instanciar 2 triángulos
        System.out.println("\n=== TRIÁNGULOS ===");
        Triangulo triangulo1 = new Triangulo();
        Triangulo triangulo2 = new Triangulo();
        
        // Instanciar 2 cuadrados
        System.out.println("\n=== CUADRADOS ===");
        Cuadrado cuadrado1 = new Cuadrado();
        Cuadrado cuadrado2 = new Cuadrado();
        
        // Mostrar resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.println(rectangulo1);
        System.out.println(rectangulo2);
        System.out.println(triangulo1);
        System.out.println(triangulo2);
        System.out.println(cuadrado1);
        System.out.println(cuadrado2);
    }
}