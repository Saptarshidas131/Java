import java.util.Scanner;

class pattern32 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n = sc.nextInt();
        // work
        int row=1,nst=1,nsp=0,nr=2*n-1,val=1;
        
        while(row <= nr)
        {

            // print stars
            int count_st = 1;
            while(count_st <= nst)
            {
                if (count_st%2 == 1)
                    System.out.print(val+" ");
                else
                    System.out.print("* ");
             count_st++;
            }



            // prep
            System.out.print("\n");
            nsp = nsp - 2;
            if (row <= nr/2)
                {
                    nst += 2;
                    val++;
                }
            else
            {
                nst -= 2;
                val--;
            }
            row++;
            
        }
    }
}
