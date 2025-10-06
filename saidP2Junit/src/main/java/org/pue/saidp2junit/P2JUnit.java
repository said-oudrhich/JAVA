package org.pue.saidp2junit;

import java.util.ArrayList;

class Animal {
    private String nombre;
    private String especie;

    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", especie=" + especie + '}';
    }
}

class GestorAnimales {
    private ArrayList<Animal> animales;

    public GestorAnimales() {
        animales = new ArrayList<Animal>();
    }

    public boolean anadirAnimal (Animal nuevoAnimal) {
        for (Animal animal : animales) {
            if (animal.getNombre().equalsIgnoreCase(nuevoAnimal.getNombre())) {
                return false;
            }
        }
        
        animales.add(nuevoAnimal);
        return true;
    }

    public boolean eliminarAnimal(String nombre) {
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getNombre().equalsIgnoreCase(nombre)) {
                animales.remove(i);
                return true;
            }
        }
        
        return false;
    }
    
    public Animal buscarAnimal(String nombre) {
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return animales.get(i);
            }
        }
        return null;
    }

    public int obtenerCantidad() {
        return animales.size();
    }

    @Override
    public String toString() {
        return "GestorAnimales{" + "listaAnimal=" + animales + '}' + "Cantidad: " +obtenerCantidad();
    } 
}

// 1.- Hacer 2 pruebas con eliminar (que se elimine bien y que no)
// 2.- Método buscar donde le des  un nombre de  un animal y devuelva el objeto.

public class P2JUnit {
    public static void main(String[] args) {
        
    }
}