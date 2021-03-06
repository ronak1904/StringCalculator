/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalculator;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Test
    public void testNegativeNumber() {
       exception.expect(ArithmeticException.class);
       exception.expectMessage("negatives not allowed : -2");
       int answer = StringCalculator.Add("//;\n1;-2");
    }
    
    
    @Test
    public void testNumberBiggerThanThousand() {
       assertEquals(2,StringCalculator.Add("//;\n1001;2"));
    }
    
    @Test
    public void testMorethanoneLengthDelimeter() {
       assertEquals(6,StringCalculator.Add("//[***]\n1***2***3"));
    }

    @Test
    public void testMultipleDelimeter() {
       assertEquals(6,StringCalculator.Add("//[****][%%]\n1****2%%3"));
    }
    
}
