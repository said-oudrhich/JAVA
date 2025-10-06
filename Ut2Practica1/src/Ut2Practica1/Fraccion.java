package Ut2Practica1;
public class Fraccion {   
    
    private int numerador;
    private int denominador;
    private double cociente;
    private String tipo;
    
//******************************************************************************
        
    //Getters
    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public double getCociente() {
        return cociente;
    }

    public String getTipo() {
        return tipo;
    }
    
//******************************************************************************
    
    // Contructores (Segundo permite introducir solo un num y se le asigna al denominador y al numerador)
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        calculaCociente();
        estableceTipo();
    }
   
    public Fraccion(int numero) {
        this.numerador = numero;
        this.denominador = numero;
        calculaCociente();
        estableceTipo();
    }
    
//******************************************************************************
    
    //Metodo para calcular Cociente
    private void calculaCociente(){
        cociente = numerador / denominador;
    }
    
//******************************************************************************
    
    //Metodo para establecer el tipo (propia, impropia ó unitaria)
    private void estableceTipo(){
        if (numerador < denominador){
            tipo = "propia";
        } 
        else{
            if (numerador > denominador){
            tipo = "impropia";
            } else {
                tipo = "unitaria";
            }
        }
    }
    
//******************************************************************************
    
    //Método público multiplica. Que recibe dos parámetros enteros(a y b) y calcula el producto.
    public void multiplica(int a, int b){
        numerador = numerador * a;
        denominador = denominador * b;
        calculaCociente();
        estableceTipo();
    }
    
//******************************************************************************

    @Override
    public String toString() {
        return "Fraccion{" + "numerador=" + numerador + ", denominador=" + denominador + ", cociente=" + cociente + ", tipo=" + tipo + '}';
    }

//******************************************************************************

}// Class
