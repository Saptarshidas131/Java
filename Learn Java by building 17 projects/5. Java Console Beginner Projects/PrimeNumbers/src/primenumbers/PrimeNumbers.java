/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbers;

/**
 *
 * @author saptarshi
 */
import java.io.*;
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // logic to print primes
        int i,j,num,n;
        
        try
        {
            System.out.println("Enter a range: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            
            for(i=1;i<num;i++){
                for(j=2;j<i;j++){
                    n = i%j;
                    
                    if(n == 0)
                        break;
                }
                if(i == j)
                    System.out.print(" "+i);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception "+ e);
        }
    }
    
}
