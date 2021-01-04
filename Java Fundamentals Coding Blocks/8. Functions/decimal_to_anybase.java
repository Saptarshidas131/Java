import java.util.Scanner;

class decimal_to_anybase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to convert: ");
        int dnum = sc.nextInt();
        System.out.println("Enter the destination base of the number: ");
        int db = sc.nextInt();
        int res = DecimalToAnybase(dnum,db);
        System.out.println("The number "+dnum +"in decimal is "+res);
    }

    public static int DecimalToAnybase(int dnum, int db) {
        int ans = 0;
        int multiplier = 1;

        while(dnum != 0){
            int rem = dnum % db;
            ans = ans + (rem * multiplier);
            multiplier = multiplier * 10;
            dnum = dnum / db;
        }

        return ans;
    }
}
