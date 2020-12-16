/*Compute the time to lightning strike whose sound takes 7.2 seconds to reach.*/

class Sound
{
	public static void main(String args[])
	{
		double dist;
		
		dist = 7.2 * 1100;	// sound travels 1100 feet per second
		
		System.out.println("The lightning is " + dist + " feet away.");
	}
} 