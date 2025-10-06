package HOJA12;
public class Principal {
    public static void main(String[] args) {
        
        Autobus a1 = new Autobus("a24232j");
        Autobus a2 = new Autobus("e23832f", "opas");
        Autobus a3 = new Autobus("s24353g", "fsgs");

        a1.setNumPlazas(30);
        a2.setNumPlazas(50);
        a3.setNumPlazas(25);
        
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        
        System.out.println("*********************************************************************");
        
        a1.setNumPlazas(10);
        a2.setNumPlazas(30);
        a3.setNumPlazas(40);

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }
}
