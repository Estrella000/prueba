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
public class calculadoraTest {
    
    public calculadoraTest() {
    }

    /**
     * Test of Sumar method, of class calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        int a = 2;
        int b = 3;
        int expResult = 5;
        int result = calculadora.Sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.println("Sumar negativos");
        a = -2;
        b = -3;
        expResult = -5;
        result = calculadora.Sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Restar method, of class calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("Restar");
        int a = 2;
        int b = 3;
        int expResult = -1;
        int result = calculadora.Restar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
