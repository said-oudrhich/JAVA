package POO1;

// Dos clases Estudiante y Principal
public class Principal {
    public static void main(String[] args) {
        Estudiante estu1 = new Estudiante("Pepe",18);
        Estudiante estu2 = new Estudiante("Rebeca",25);
        Estudiante estu3 = new Estudiante("Ana");
        
        estu1.cumplirAnnos();
        estu2.cumplirAnnos();
        estu3.cumplirAnnos();
        
        estu1.examinarse();
        estu2.examinarse();
        estu3.examinarse();
        
        System.out.println(estu1.toString());
        System.out.println(estu2.toString());
        System.out.println(estu3.toString());
    }
}
