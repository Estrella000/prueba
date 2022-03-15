/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estrella
 */
public class arrays06Test {
    
    public arrays06Test() {
    }

    /**
     * Test of mostrarArray method, of class Arrays6.
     */
    @Test
    public void testMostrarArray() {
        System.out.println("mostrarArray");
        int[] lista = null;
        Arrays6.mostrarArray(lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearArray method, of class Arrays6.
     */
    @Test
    public void testCrearArray() {
        System.out.println("crearArray");
        int P = 0;
        int Q = 0;
        int[] expResult = null;
        int[] result = Arrays6.crearArray(P, Q);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Arrays6.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Arrays6.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
