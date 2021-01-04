/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

/**
 *
 * @author saptarshi
 */
import java.io.*;
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // logic to check leap year
        int year;
        
        try
        {
            System.out.println("Enter a year: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            year = Integer.parseInt(br.readLine());
            
            if(year%4 == 0)
                System.out.println("The year "+year+" is a leap year.");
            else
                System.out.println("The year "+year+" is not a leap year.");
        }
        catch(Exception e)
        {
            System.out.println("Exception "+ e);
        }
    }
    
}
