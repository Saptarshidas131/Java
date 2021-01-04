/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlearea;

/**
 *
 * @author saptarshi
 */
import java.io.*;
import java.lang.*;
public class CircleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // take input and calculate the circle's area and perimeter
        int r=0;
        try
        {
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Enter Radius of the circle:");
            r = Integer.parseInt(br.readLine());
            double area = Math.PI*r*r;
            System.out.println("The Area of the circle is " + area);
            double perimeter = Math.PI*2*r;
            System.out.println("The Perimeter of the circle is " + perimeter);
        }
        catch(Exception e)
        {
            System.out.println("Exception " + e);
        }
    }
    
}
