/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rjjohnson
 */
public class octalToDecimal {
    public static String octalToDecimal(int input){
        StringBuilder stringBuild = new StringBuilder();
        
        String val = "";
        int octNum=input, decnum=0, i=0, index=0;
        
        while(octNum != 0){
            decnum = decnum + (octNum%10) * (int)Math.pow(8, i);
            i++;
            octNum = octNum/10;
        }
        
        val = Integer.toString(decnum);
        
        return val;
    }
}
