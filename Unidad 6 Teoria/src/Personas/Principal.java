package Personas;

public class Principal {

    public static void main(String[] args) {
        Persona persona = new Persona("Pepe", "Castillo");
        Estudiante estudiante = new Estudiante("1234", "DAW1", "Rebeca", "Palacios");
        
        persona.caminar();
        persona.dormir();
        
        estudiante.estudiar();
        estudiante.examinarse();
        
        System.out.println("\n**INFO**");
        persona.visualizarInfo();
        estudiante.visualizarInfo();
        
        Persona personas[] = new Persona[3];
        personas[0] = new Persona("Carlos", "Ramirez");
        personas[1] = new Persona("Ana", "Rios");
        personas[2] = new Estudiante("5678", "DAW1", "Tito", "Puente");
        
        personas[0].dormir();
        personas[1].caminar();
        personas[2].dormir();
        
        //personas[0].estudiar(); No se puede ejecutar ya que la herencia va de abajo arriba
        
        //refundición
        ((Estudiante)personas[2]).estudiar();
        
        System.out.println("");
        for (int i = 0; i < personas.length; i++)
            personas[i].visualizarInfo();

    }
    
}
