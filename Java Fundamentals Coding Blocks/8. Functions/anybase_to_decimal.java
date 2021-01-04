import java.util.Scanner;

class anybase_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to convert to decimal: ");
        int snum = sc.nextInt();
        System.out.println("Enter the base of the number: ");
        int sb = sc.nextInt();
        int res = anybaseToDecimal(snum,sb);
        System.out.println("The number "+snum +"in decimal is "+res);
    }

    public static int anybaseToDecimal(int snum, int sb) {
        int ans = 0;
        int multiplier = 1;

        while(snum != 0){
            int rem = snum % 10;
            ans = ans + (rem * multiplier);
            multiplier = multiplier * sb;
            snum = snum / 10;
        }

        return ans;
    }
}
