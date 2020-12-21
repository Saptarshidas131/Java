import java.util.Scanner;

class pattern17 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n = sc.nextInt();
        // work
        int row=1,nst=n/2,nsp=1;
        
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
            while(count_st <= nst)
            {
             System.out.print("*");
             count_st++;
            }

            // prep
            System.out.print("\n");
            if(row <= n/2)
            {
                nsp = nsp+2;
                nst--;
            }
            else
            {
                nsp = nsp-2;
                nst++;
            }
            row++;
        }
    }
}
