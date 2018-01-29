/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rjjohnson
 */
public class binaryToDecimal {
    public static String binaryToDecimal(int input){
        String val = "";
        int decimal = 0;
        int p = 0;
        
        while(true){
            if(input == 0){
                break;
            } else {
                int temp = input%10;
                decimal += temp*Math.pow(2, p);
                input = input/10;
                p++;
            }
        }
        
        val = Integer.toString(decimal);
        
        //Method 2 - Using parseInt()
        //val = Integer.parseInt(input, 2);
        return val;
    }
    
}
