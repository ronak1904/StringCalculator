/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalculator;

/**
 *
 * @author Dell
 */
public class StringCalculator {

    /**
     * @param args the command line arguments
     */
    
    StringCalculator() {
        
    }
     public static String get_default_delimeter() {
        return ",|\n";
    }
     
    public static String[] get_number_lists(String delimeter, String number_string) {
        String[] operands = number_string.split(delimeter);
        return operands;
    }
    
    public static int get_sum_of_operands(String[] operands){
        int answer = 0;
        for(String operand: operands) {
            int temp = Integer.parseInt(operand);
            answer+=temp;
         
        }
        return answer;
    }
    
    public static int Add(String numbers) {
        String delimeter = "";
        if(numbers.isEmpty()) {
            return 0;
        }
        
        if(numbers.startsWith("//")) {
            String firstLine = numbers.split("\n")[0];
            numbers = numbers.split("\n")[1];
            delimeter = firstLine.substring(2);
            
        }
        else {
           delimeter = get_default_delimeter();            
        }
        
        String[] operands = get_number_lists(delimeter, numbers);
        
        int answer = 0;
        answer = get_sum_of_operands(operands);
        
        return answer;
    }
    
}
