package org.pue.saidp2junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalesTest {
    private GestorAnimales ga;
    
    @BeforeEach
    public void setUp(){
        ga = new GestorAnimales();
    }
    
    @Test
    public void annadirAnimal_DebeDevolverTrue(){
        
        Animal simba = new Animal("Simba", "Leon");
        boolean resultado = ga.anadirAnimal(simba);
        
        int cantidad = ga.obtenerCantidad();
        assertEquals(1, cantidad);
        assertTrue(resultado);
    }
    
    @Test
    public void annadirAnimalDuplicado_DebeSalirMal(){
        ga.anadirAnimal(new Animal("Simba", "Leon"));
        boolean resultado = ga.anadirAnimal(new Animal("Simba", "Leon"));
        
        int cantidad = ga.obtenerCantidad();
        assertEquals(1, cantidad);
        assertFalse(resultado);
    }
    
    @Test
    public void eliminarAnimal_DebeSalirBien(){
        ga.anadirAnimal(new Animal("Simba", "Leon"));
        boolean resultado = ga.eliminarAnimal("Simba");
        
        assertTrue(resultado);
    }
    
    @Test
    public void eliminarAnimal_DebeSalirMal(){
        ga.anadirAnimal(new Animal("Simba", "Leon"));
        boolean resultado = ga.eliminarAnimal("Smba");
        
        assertFalse(resultado);
    }
    
    @Test
    public void buscarAnimal_DebeSalirBien(){
        ga.anadirAnimal(new Animal("Simba", "Leon"));
        Animal resultado = ga.buscarAnimal("Simba");
        
        assertNotNull(resultado);
    }
    
    @Test
    public void buscarAnimal_DebeSalirMal(){
        ga.anadirAnimal(new Animal("Simba", "Leon"));
        Animal resultado = ga.buscarAnimal("Smba");
        
        assertNull(resultado);
    }
}