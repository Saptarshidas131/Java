// reverse a number in java

import java.util.Scanner;

class reverseNumber {
        public static void main(String[] args)
        {
            int num,rev = 0, rem;
            
            // input
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            
            // reversing the number
            while(num != 0)
            {
                rem =  num%10;
                rev = rev*10 + rem;
                num = num/10;
            }
            
            // ouput
            System.out.println(rev);
        }
}
