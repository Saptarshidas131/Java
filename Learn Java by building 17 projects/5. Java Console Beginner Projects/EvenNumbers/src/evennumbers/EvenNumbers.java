/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evennumbers;

/**
 *
 * @author saptarshi
 */
import java.io.*;
public class EvenNumbers {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // logic to find even number
        int range,i;
        
        System.out.println("Enter a range: ");
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            range = Integer.parseInt(br.readLine());
            for(i=1; i<=range; i++)
            {
                if(i%2 == 0)
                    System.out.print(i + ",");        
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception " + e);
        }
    
}
}
