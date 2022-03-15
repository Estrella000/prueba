/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estrella
 */
public class arrays062Test {
    
    public arrays062Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of mostrar method, of class arrays062.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        int[] numeros = {2, 3, 4, 5};
        arrays062.mostrar(numeros);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of rellenar method, of class arrays062.
     */
    @Test
    @SuppressWarnings("empty-statement")
    public void testRellenar1() {
        System.out.println("rellenar");
        int P = 2;
        int Q = 5;
        int[] expResult={2, 3, 4, 5};
        int[] result;
        result = arrays062.rellenar(P, Q);
        
       assertArrayEquals(expResult, result);
                // TODO review the generated test code and remove the default call to fail.
  
   
        expResult=new int[]{5, 4, 3, 2};
        result = arrays062.rellenar(Q, P);
        
       assertArrayEquals(expResult, result);
                // TODO review the generated test code and remove the default call to fail.
  
         P = 2;
         Q = 2;
        expResult=new int[]{2, 3};
        
        result = arrays062.rellenar(P, Q);
        
       assertArrayEquals(expResult, result);
                // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of main method, of class arrays062.
     */
  /*  @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        arrays062.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
