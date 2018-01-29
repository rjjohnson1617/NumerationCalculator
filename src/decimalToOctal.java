/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rjjohnson
 */
public class decimalToOctal {
    
    public static String decimalToOctal(int input){
        //Method 1 - Not using predefined method
        //Store remainder
        int rem;
        String val = "";
        
        //Digits in Octal number system
        char digits[] = {'0','1','2','3','4','5','6','7'};
        
        while(input>0){
            rem = input%8;
            val = digits[rem]+ val;
            input = input/8;
        }
        
        //Method 2 - Using predefined method toOctalString()
        //val = Integer.toOctalString(input);
        
        return val;
    }
    
}
