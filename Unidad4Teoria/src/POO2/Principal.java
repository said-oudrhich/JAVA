package POO2;
public class Principal {
    public static void main(String[] args) {

        Socio socio1 = new Socio("Pepe",1111);
        Socio socio2 = new Socio("Rebeca", 2222);
        
        System.out.println(socio1.getNombre());
        System.out.println(socio2.getNombre());
        
        socio2.setNumSocio(9999);
        
        System.out.println(socio1.toString());
        System.out.println(socio2.toString());
        
        socio1.getCarne().imprimirCarne();
        socio2.getCarne().imprimirCarne();
   
    }
}
