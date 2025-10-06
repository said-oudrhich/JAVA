package HOJA2;

import java.util.Random;

public class Alumno {
    private String curso;
    private String nombre;
    private String identificador;
    private int notaFinal;

    // Constructor
    public Alumno(String curso, String nombre, String identificador) {
        this.curso = curso;
        this.nombre = nombre;
        this.identificador = identificador;
        this.notaFinal = 0;
    }

    // Método para generar una nota aleatoria entre 1 y 10
    public void generarNotaFinal() {
        Random rand = new Random();
        this.notaFinal = (int)(Math.random() * 10) + 1;
    }

    // Getters
    public String getCurso() {
        return curso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    // Método toString
    @Override
    public String toString() {
        return this.nombre + " - " + this.notaFinal;
    }
}
