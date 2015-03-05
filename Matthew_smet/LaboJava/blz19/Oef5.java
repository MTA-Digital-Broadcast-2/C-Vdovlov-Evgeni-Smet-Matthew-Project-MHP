/**
* Oefening 1.17.5
* @author Matthew Smet
*/
import java.lang.*;

public class Oef5
{		
	public static void main(String args[])
	{
		Prime();
	}
	
	private static void Prime()
	{
		boolean Check = true;
		int index = 0;
		
		for( int i = 3; i < 100; i++)
		{
			for (int y = 2; y < i-1; y++)
			{
				if( i%y == 0)
				{
					Check = false;
				}
			}
			
			if(Check == true)
			{
				System.out.println(i + " is a Prime\n");
			}
			Check = true;
		}
	}
}
