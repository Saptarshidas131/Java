/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumber;

/**
 *
 * @author saptarshi
 */
import java.util.*;
public class RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // logic for generating random numbers
        int counter;
        Random rnum = new Random();
        for(counter=1; counter<7; counter++){
            System.out.println(rnum.nextInt(270));
        }
    }
    
}
