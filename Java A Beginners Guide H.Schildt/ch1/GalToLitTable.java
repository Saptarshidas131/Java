/*
This program converts gallons into litres in a table format.
*/

class GalToLitTable
{
	public static void main(String args[])
	{
		double gallons; // holds the number of gallons
		double litres; // holds the number of litres
		int counter;
		
		counter = 0;
		for(gallons = 1; gallons<=100; gallons++)
		{
			litres = gallons * 3.7854; // convert to litres
			
			System.out.println(gallons + " gallons is " + litres + " litres ");
		
			counter++;
		
			//print blank line on every 10th line
			if(counter==10)
			{
				System.out.println();
				counter = 0; // reset counter
			}
		
		}
	}
}