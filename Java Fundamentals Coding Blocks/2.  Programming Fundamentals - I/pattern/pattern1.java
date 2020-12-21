import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n = sc.nextInt();
        int row=1;
        while(row<=n)
        {
            System.out.print("*");
            int col = 1;
            while(col<=n)
            {
                System.out.print("*");
                col++;
            }
            System.out.println("*");
            row++;
        }
    }
}
