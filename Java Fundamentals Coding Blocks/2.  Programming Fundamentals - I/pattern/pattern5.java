import java.util.Scanner;

class pattern5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n = sc.nextInt();
        // work
        int row=1,nst=n,nsp=0;
        
        while(row <= n)
        {
             // print spaces
            int count_sp = 1;
            while(count_sp <= nsp)
            {
             System.out.print(" ");
             count_sp++;
            }
            
            // print stars
            int count_st = 1;
            while(count_st <= nst)
            {
             System.out.print("*");
             count_st++;
            }
            

            // prep
            System.out.print("\n");
            row++;
            nsp++;
            nst--;
        }
    }
}
