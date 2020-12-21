// sum of n numbers

import java.util.Scanner;

class sumn {
	
		public static void main(String[] args) {
			int sum = 0, counter = 1;
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			
			while(counter<=n) {
				sum = sum + counter;
				counter = counter + 1;
			}
			
			System.out.println("Sum is " + sum);
		}
}
