/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleMath;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Personal
 */
public class SimpleMathTest {
    
    public SimpleMathTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class SimpleMath.
     */
    @Test
    public void testAdd() {
        System.out.println("Prueba del metodo add");
        int a = 2;
        int b = 2;
        int expResult = 4;
        int result = SimpleMath.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class SimpleMath.
     */
    @Test
    public void testMultiply() {
        System.out.println("Prueba del metodo multiply");
        int a = 9;
        int b = 10;
        int expResult = 90;
        int result = SimpleMath.multiply(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of substract method, of class SimpleMath.
     */
    @Test
    public void testSubstract() {
        System.out.println("Prueba del metodo substract");
        int a = 50;
        int b = 20;
        int expResult = 30;
        int result = SimpleMath.substract(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
