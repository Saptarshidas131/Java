// check if a number is prime or not
import java.util.Scanner;

class prime {

	public static void main(String[] args) {
	
			int n, divisor = 2;
			boolean flag = true;
			
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			
			while(divisor <= n-1) {
				if (n%divisor == 0) {
					flag = false;
				}
					
				divisor = divisor + 1;
			}
			
			if(flag == true) {
				System.out.println("prime");
			}
			else {
				System.out.println("Not prime");
			}
	}
}
