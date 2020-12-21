import java.util.Scanner;

class gcd {
    public static void main(String[] args)
    {
        int divident, divisor, rem;
        
        // input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        divisor = in.nextInt();
        System.out.println("Enter another number: ");
        divident = in.nextInt();

        // loop to find the gcd
        while(divident%divisor != 0)
        {
            rem = divident%divisor;
            divident = divisor;
            divisor = rem;
        }
        
        System.out.printf("\nGCD is %d",divisor);
            
    }
}
