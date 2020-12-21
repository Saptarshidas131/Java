import java.util.Scanner;

public class pattern0 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n = sc.nextInt();
        
        for(int row=1; row<=n; row++)
        {
            System.out.println("*");
        }
     }   
}
