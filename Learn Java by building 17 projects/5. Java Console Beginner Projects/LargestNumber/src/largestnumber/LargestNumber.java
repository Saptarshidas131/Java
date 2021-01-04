/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestnumber;

import java.io.*;

/**
 *
 * @author saptarshi
 */
public class LargestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // logic to find largest number
        int num1,num2,num3;
        try
        {
            System.out.println("Enter three numbers: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            num1 = Integer.parseInt(br.readLine());
            num2 = Integer.parseInt(br.readLine());
            num3 = Integer.parseInt(br.readLine());
            
            if(num1>num2 && num1>num3){
                    System.out.println(num1 +" is largest.");
                }
            else if(num2>num1 && num2>num3){
                    System.out.println(num2 +" is largest.");
                }
            else
                System.out.println(num3 + " is largest.");
        }
        catch(Exception e)
        {
            System.out.println("Exception "+ e);
        }
    }
    
}
