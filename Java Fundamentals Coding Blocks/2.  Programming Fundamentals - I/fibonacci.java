import java.util.Scanner;

class fibonacci {
    public static void main(String[] args)
    {
        // initialising variables a as first term b as second term and sum set to 0,counter as 1, range n
            int a = 0,b = 1, sum, counter = 1, n;
            
        // taking input
        System.out.println("Enter the range to print upto: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
            // looping as long as counter is less than or equal to n+1
            while(counter <= n+1)
            {
                System.out.printf("%d ",a);
                
                sum = a + b;
                a = b;
                b = sum;
                
                counter++;
            }
            
    }
}
