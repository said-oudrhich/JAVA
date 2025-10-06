package poo1_teoria;
/*
    Primer ejemplo de POO
    Programa para crear estudiantes 1ºDAW
*/
public class Poo1_teoria {

    public static void main(String[] args) {
        // Asigna estudiante1,2 y 3 de la clase estudiante
        Estudiante estudiante1 = new Estudiante("pepe",18,"SMR");
        Estudiante estudiante2 = new Estudiante("ana", 20, "bac");
        Estudiante estudiante3 = new Estudiante("lucas", 50);
        
        //imprime los parametros del estudiante 1 y 2
        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());
        System.out.println(estudiante3.toString());
        
        // La clase esta publica y se pueden cambiar los datos
        //estudiante1.edad = 19;
        //estudiante2.acceso = "prueba";
        //estudiante3.nombre = "maria";
        // Aquí se muestra los cambios hechos anteriormetente
        //System.out.println(estudiante1.toString());
        //System.out.println(estudiante2.toString());
        //System.out.println(estudiante3.toString());
        
        // Cambiamos el acceso de Ana de bac a Prueba           ****GETTER AND SETTER****
        estudiante2.setAcceso("Prueba");
        //Imprimimos el modo de acceso de Ana y de Pepe
        System.out.println("Ana accedio por: "+estudiante2.getAcceso());
        System.out.println("Pepe accedio por: "+estudiante1.getAcceso());
        
        // Cumple de Lucas se le añade 1
        estudiante3.cumpleanos();
        System.out.println(estudiante3.toString());
        
        // Cambiamos la edad de un estudiante
        estudiante1.setEdad(16);
        System.out.println(estudiante1.toString());
    }//main()
}
