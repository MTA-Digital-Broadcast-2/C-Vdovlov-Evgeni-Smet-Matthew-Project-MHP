/**
* Oefening 1.17.6
* @author Matthew Smet
*/
import java.lang.*;

public class Oef6
{		
	public static void main(String args[])
	{
		int a[] = {12,34,56,78,123,234,99,88};
		int b = a[0];
		
		for ( int i = 0; i < a.length; i++)
		{
			if(b < a[i])
			{
				b = a[i];
			}
		}
		System.out.println("Grootste getal is: " + b);
	}
}