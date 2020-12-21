import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n = sc.nextInt();
        
        int row = 1, nst=1;
        while(row <= n)
        {
            int cst = 1;
            while(cst <= nst)
            {
                System.out.print("*");
                cst++;
            }
            System.out.print("\n");
            nst++;
            row++;
        }
    }
}
