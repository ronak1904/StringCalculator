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
}
