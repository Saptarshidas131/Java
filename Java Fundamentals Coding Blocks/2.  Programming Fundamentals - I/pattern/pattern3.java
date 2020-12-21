import java.util.Scanner;

class pattern3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n = sc.nextInt();
        // work
        int row=1,nst=n;
        while(row <= n)
        {
            int count = 1;
            while(count <= nst)
            {
             System.out.print("*");
             count++;
            }
            // prep
            System.out.print("\n");
            row++;
            nst--;
        }
    }
}
