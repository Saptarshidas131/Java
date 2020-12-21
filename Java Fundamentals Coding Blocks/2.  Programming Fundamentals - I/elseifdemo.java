// else-if demo

import java.util.Scanner;

class elseifdemo {

		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age<11) {
			System.out.println("child");
		}
		else if(age>=12 && age<=17) {
			System.out.println("teenager");
		}
		else if(age>=18 && age<=60) {
			System.out.println("adult");
		}
		else {
			System.out.println("old");
		}
	}
}
