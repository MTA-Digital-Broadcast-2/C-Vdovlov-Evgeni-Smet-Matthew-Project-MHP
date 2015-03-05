/**
* Oefening 1.17.2
* @author Matthew Smet
*/
import java.lang.*;

public class Oef2
{		
	public static void main(String args[])
	{	
	    String dag[] = {"maandag","dinsdag","woensdag","donderdag","vrijdag","zaterdag","zondag"};
		int nummerdag = 6;
		
		for(int i = 1;i < 28; i++)
		{
			if (nummerdag > 6)
			{
				nummerdag = 0;
			}
		System.out.println(dag[nummerdag] + " " + i + " februari");
		nummerdag++;
		}
	}
}