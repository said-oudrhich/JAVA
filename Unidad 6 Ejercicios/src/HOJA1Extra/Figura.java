package HOJA1Extra;

import java.util.Scanner;

public class Figura {
    private double area;
    private double perimetro;
    Scanner entrada = new Scanner(System.in);
    
    //**************************************************************************
    
    // Getters y setters
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public Scanner getEntrada() {
        return entrada;
    }
    
    //**************************************************************************


    public void pedirDatos() {
    }
    
    
    public void calcularArea(){

    }    
    
    
    public void calcularPerimetro(){

    }
    
    //**************************************************************************
    
    @Override
    public String toString() {
        return "area=" + area + ", perimetro=" + perimetro;
    }
}
     
    
