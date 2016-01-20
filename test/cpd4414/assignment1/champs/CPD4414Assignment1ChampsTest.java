/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment1.champs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0663965
 */
public class CPD4414Assignment1ChampsTest {
    
    public CPD4414Assignment1ChampsTest() {
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
    public void testLessThanOneShouldReturnNull() {
        System.out.println("testLessThanOneShouldReturnNull");
        String str = "";
        int a = 0;
        String expResult = null;
        String result = CPD4414Assignment1Champs.stringPower(str, a);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStringAndOneShouldReturnString() {
        System.out.println("testStringAndOneShouldReturnString");
        String str = "hello";
        int a = 1;
        String expResult = "hello";
        String result = CPD4414Assignment1Champs.stringPower(str, a);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStringAndTwoShouldReturnStringDoubled(){
        System.out.println("testStringAndTwoShouldReturnStringDoubled");
        String str="bob";
        int a=2;
        String expResult="bobbob";
        String result = CPD4414Assignment1Champs.stringPower(str, a);
        assertEquals(expResult, result);
    }
    @Test
    public void testEmptyStringShouldReturnEmptyString (){
        System.out.println("testEmptyStringShouldReturnEmptyString");
        String str="";
        int a=2;
        String expResult="";
        String result = CPD4414Assignment1Champs.stringPower(str, a);
        assertEquals(expResult, result);
    }
}
