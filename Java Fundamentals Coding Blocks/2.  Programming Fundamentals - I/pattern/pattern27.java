import java.util.Scanner;

class pattern27 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n = sc.nextInt();
        // work
        int row=1,nst=1,nsp=n-1;
        int val;
        while(row <= n)
        {
            val = 1;

            // print spaces
            int count_sp = 1;
            while(count_sp <= nsp)
            {
             System.out.print("\t");
             count_sp++;
            }
            
            // print numbers
            int count_st = 1;
            while(count_st <= nst)
            {
             System.out.print(val+"\t");
             count_st++;
             if (count_st <= nst/2)
                val++;
             else
                val--;
            }

            // prep
            System.out.print("\n");
            nsp--;
            nst = nst+2;
            row++;
        }
    }
}
