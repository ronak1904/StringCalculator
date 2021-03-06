/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalculator;

import java.util.ArrayList;
import java.util.List;

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
        String negatives = "";
        for(String operand: operands) {
            if(!operand.isEmpty()) {
                int temp = Integer.parseInt(operand);
                if(temp < 0) {
                    negatives += operand;
                }else  {
                    if(temp <= 1000) {
                      answer += temp;                    
                    }
                }
            }
        }
        
         if(!negatives.isEmpty()) {
            throw new ArithmeticException("negatives not allowed : " + negatives);
        }
        return answer;
    }
    
    public static String get_multiple_delimeter(String firstLine) {
        List<String> list = new ArrayList<String>();
        for(int i=2; i<firstLine.length(); i++) {
            String temp = "";
            temp += "[";
            int j=i+1;
            while(j < firstLine.length() && firstLine.charAt(j) != ']') {
                temp += firstLine.charAt(j);
                j++;
            }
            temp += "]";
            i = j;
            list.add(temp);
        }
        
        String delimiter = "";
        for(String x: list) {
            delimiter += x;
            delimiter += "|";
        }
        
        return delimiter.substring(0, delimiter.length()-1);
    }
    
    public static int Add(String numbers) {
        if(numbers.isEmpty())
        {
            return 0;
        }

        String delimeter = "";
        if(numbers.startsWith("//")) {
            String firstLine = numbers.split("\n")[0];
            numbers = numbers.split("\n")[1];
            if(firstLine.charAt(2) != '[') {
                delimeter = firstLine.substring(2);
            }
            else {
                delimeter = get_multiple_delimeter(firstLine);
            }
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
