package hoja4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        String alumnos[] = new String[5];
        double notasCalculo[] = new double[alumnos.length];
        double notasAlgebra[] = new double[alumnos.length];
        String aprobados[] = new String[alumnos.length  * 3];
        
        solicitarNombres(alumnos);
        pedirNotas(notasCalculo, notasAlgebra,alumnos);
        calcularAprobados(alumnos,notasCalculo,notasAlgebra,aprobados);
        imprimirAprobados(aprobados);
        
    } // Main

    //**************************************************************************

    private static void solicitarNombres(String alumnos[]){
        
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Introduce el nombre del alumno "+(i+1));
            alumnos[i] = entrada.nextLine();
        }
    }
    
    //**************************************************************************
    
    private static void pedirNotas(double notasCalculo[], double notasAlgebra[], String alumno[]){
        
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < alumno.length; i++) {
            System.out.print("Introduce la nota de Calculo del alumno "+alumno[i]+":");
            notasCalculo[i] = entrada.nextDouble();
            System.out.print("Introduce la nota de Algebra del alumno "+alumno[i]+":");
            notasAlgebra[i] = entrada.nextDouble();
        }
        entrada.close();
    }
    
    //**************************************************************************

    private static void calcularAprobados(String alumnos[], double notasCalculo[], double notasAlgebra[], String aprobados[]){
        String a = String.valueOf(notasCalculo);
        int index = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if ((notasCalculo[i] >= 5) && (notasAlgebra[i] >= 5)) {
                aprobados[index] = alumnos[i];
                aprobados[index + 1] = String.valueOf(notasCalculo[i]);
                aprobados[index + 2] = String.valueOf(notasAlgebra[i]);
                index += 3;
            }
        }
    }
    
    //**************************************************************************
    
    private static void imprimirAprobados(String aprobados[]){
        System.out.println("\nAlumnos aprobados en ambas materias:");
        for (int i = 0; i < aprobados.length; i += 3) {
            if (aprobados[i] != null) {
                System.out.println("Nombre: " + aprobados[i] + ", Nota Cálculo: " + aprobados[i + 1] + ", Nota Álgebra: " + aprobados[i + 2]);
            }
        }
    }

} // Class