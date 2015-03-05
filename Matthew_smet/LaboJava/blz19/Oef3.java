/**
* Oefening 1.17.3
* @author Matthew Smet
*/
import java.lang.*;

public class Oef3
{		
	public static void main(String args[])
	{	
		BerekeningPi();
	}
	
	private static void BerekeningPi()
	{
		double Pi = 4;
		boolean plus = false;
		for (int i = 3; i < 10000; i+=2)
		{
			if (plus)
			{
				Pi += 4.0 / i;
			}
			else
			{
				Pi -= 4.0 / i;
			}
			plus = !plus;
		 }
		 
		System.out.println(Pi);
	}
}