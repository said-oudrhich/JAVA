package HOJA13;
public class Principal {
    public static void main(String[] args) {
        Trabajador usu1 = new Trabajador("Pepe Pérez", "proyecto de RENFE");
        Trabajador usu2 = new Trabajador("Ana Guerra", "proyecto de RENFE", "analista orgánico");
        Trabajador usu3 = new Trabajador("Luis Peralta", "proyecto de videojuego", "programador junior");
        Trabajador usu4 = new Trabajador("Carlos Gómez", "proyecto de ayuntamiento", "jefe de proyecto");
        Trabajador usu5 = new Trabajador("Laura Revilla", "proyecto de RENFE", "programador junior");
        
        usu2.setSalario(3000);
        usu3.setSalario(1500);
        usu4.setSalario(7500);
        
        System.out.println(usu1.toString());
        System.out.println(usu2.toString());
        System.out.println(usu3.toString());
        System.out.println(usu4.toString());
        System.out.println(usu5.toString());

        usu5.setSalario(1475);
        usu1.setSalario(1550);
        System.out.println("");
        System.out.println(usu1.toString());
        System.out.println(usu2.toString());
        System.out.println(usu3.toString());
        System.out.println(usu4.toString());
        System.out.println(usu5.toString());
        
        System.out.println("");
        usu2.ascender();
        usu4.ascender();
        System.out.println(usu2.toString());
        System.out.println(usu4.toString());

        
    }
} //Class