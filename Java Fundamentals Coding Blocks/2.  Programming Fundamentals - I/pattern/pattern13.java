import java.util.Scanner;

class pattern6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n = sc.nextInt();
        // work
        int row=1,nst=1,nr=2*n-1;
        
        while(row <= nr)
        {
            int count_st = 1;
            // print stars
                while(count_st <= nst)
                {
                 System.out.print("* ");
                 count_st++;
                }
            if (row < n)
            {
                nst++;
            }
            else
            {
                nst--;
            }

            // prep
            System.out.print("\n");
            row++;
        }
    }
}
