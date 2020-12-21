import java.util.Scanner;

class pattern21 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n = sc.nextInt();
        // work
        int row=1,nst=1,nsp=2*n-3;
        
        while(row <= n)
        {

            // print stars
            int count_st = 1;
            while(count_st <= nst)
            {
             System.out.print("*");
             count_st++;
            }

            // print spaces
            int count_sp = 1;
            while(count_sp <= nsp)
            {
             System.out.print(" ");
             count_sp++;
            }
            
            // print stars
            count_st = 1;
            if (row == n)
                count_st = 2;
            while(count_st <= nst)
            {
             System.out.print("*");
             count_st++;
            }

            // prep
            System.out.print("\n");
            nsp = nsp - 2;
            nst++;
            row++;
        }
    }
}
