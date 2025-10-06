package HOJA1;

public class Principal {
    public static void main(String[] args) {
        Vehiculo vehiculo[] = new Vehiculo[6];
        
        vehiculo[0] = new Coche("gris", 1111, 1600);
        vehiculo[1] = new Coche(2222, 1800);
        vehiculo[2] = new Barco(3333);
        vehiculo[3] = new Barco(4444);
        vehiculo[4] = new Coche("gris", 5555, 1700);
        
        series(vehiculo);
        
        vehiculo[3].pintar("gris");
        
        colores(vehiculo, "gris");
        
        vehiculo[0].cambiarNumSerie(9999);
        vehiculo[2].cambiarNumSerie(8888);

        
        vehiculo[vehiculo.length-1] = new Tractor("verde", 1000, "compacto", "nuevo");
        
        for (int i = 0; i < vehiculo.length; i++)
            vehiculo[i].arrancar();
    }
    
    
    public static void series(Vehiculo v[]){
        
        System.out.println("--LOS NÚMEROS DE SERIE DE TODOS--");
        for (int i = 0; i < v.length -1; i++)
            System.out.println(v[i].getNumSerie());
            
    }
    
    public static void colores(Vehiculo []v, String color){
        
        System.out.println("--LOS VEHÍCULOS GRIS SON--");
        for (int i = 0; i < v.length-1; i++)
            if (v[i].getColor().equalsIgnoreCase(color))
                System.out.println(v[i].getNumSerie());
        
        System.out.println("--LOS COCHES GRIS SON--");
        for (int i = 0; i < v.length-1; i++)
            if (v[i] instanceof Coche && v[i].getColor().equalsIgnoreCase(color)) 
                System.out.println(v[i].getNumSerie());
            
    }
}
