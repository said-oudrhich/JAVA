package EjercicioClase;
public class Principal {
    public static void main(String[] args) {
        Instrumentos instrumento1 = new Instrumentos("Guitarra", 900);
        Instrumentos instrumento2 = new Instrumentos("Saxo", 1200);
        Instrumentos instrumento3 = new Instrumentos("Trompeta", 1500);

        instrumento2.setTipo("viento");
        
        System.out.println(instrumento1.toString());
        System.out.println(instrumento2.toString());
        System.out.println(instrumento3.toString());
        
        instrumento2.venta(2);
        instrumento3.venta(5);
        instrumento1.venta(4);
        
        System.out.println(instrumento1.toString());
        System.out.println(instrumento2.toString());
        System.out.println(instrumento3.toString());
    }
}
