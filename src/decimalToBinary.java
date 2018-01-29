/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rjjohnson
 */
public class decimalToBinary {
    
    public static String decimalToBinary(int input){
        //Method 1 - Not using predefined method
        StringBuilder stringBuild = new StringBuilder();
        
        int binary[] = new int[40];
        int index = 0;
        String val = "";
        
        //build the binary number
        while(input > 0){
            binary[index++] = input%2;
            input = input/2;
        }
        
        //convert the binary array into a string
        for(int i = index-1; i >= 0; i--){
            String num = Integer.toString(binary[i]);
            stringBuild.append(num);
            val = stringBuild.toString();
        }
        
        //Method 2 - Using built in toBinaryString() method
        //val = Integer.toBinaryString(input);
        
        
        return val;
    }
}
