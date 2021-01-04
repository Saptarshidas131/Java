/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparetwonumbers;

import java.util.Scanner;

/**
 *
 * @author saptarshi
 */
public class CompareTwoNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // comparing two numbers logic
        int num1, num2;
        
        System.out.println("Enter two numbers");
        
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        if(num1 == num2)
               System.out.println("Both are equal.");
        else if(num1 > num2)
            System.out.println(num1 + " is greater than " + num2);
        else
            System.out.println(num2 + " is greater than " + num1);
    }
    
}
