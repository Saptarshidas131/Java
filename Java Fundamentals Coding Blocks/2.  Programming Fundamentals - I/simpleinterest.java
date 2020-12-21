/*
 * 	Program to calculate simple interest
 */
 
 class simpleinterest {
		
		public static void main(String[] args) {
			
			int principal = 1000, rate = 5, time = 2;
			
			int si = (principal * rate * time) / 100;
			
			System.out.println("Simple interest is " + si);
			
			
		}
}
