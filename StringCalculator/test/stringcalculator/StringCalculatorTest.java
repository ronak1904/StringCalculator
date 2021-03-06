/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalculator;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Dell
 */
public class StringCalculatorTest {
    
    public StringCalculatorTest() {
    }    
    
    @Test
    public void testEmptyString() {
       assertEquals(0,StringCalculator.Add(""));
    }
    
    @Test
    public void testSingleNumber() {
       assertEquals(2,StringCalculator.Add("2"));
    }
    
    @Test
    public void testTwoNumbers() {
       assertEquals(3,StringCalculator.Add("1,2"));
    }
    
    @Test
    public void testMultipleNumbers() {
       assertEquals(6,StringCalculator.Add("1,2,3"));
    }
    
    @Test
    public void testNewlineDelimeter() {
       assertEquals(6,StringCalculator.Add("1,2\n3"));
    }
    
    @Test
    public void testCustomDelimeter() {
       assertEquals(3,StringCalculator.Add("//;\n1;2"));
    }
    
    
}
