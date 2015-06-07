/**
* @author Matthew Smet
*/
import java.lang.*;

public class EersteProg
{
public static void main(String [] args)
	{
	Werknemer herman=new Werknemer("Herman", "Hermans", 1, 1000.0f);
	PartTimeWerknemer interim1=new PartTimeWerknemer("Interim", "1", 3, 12.0f,20);
	
	herman.setRSZ(6.0f);
	interim1.setRSZ(2.0f);
	System.out.println(herman.voornaam + " betaalt " + herman.getRSZ() +"% RSZ");
	System.out.println(interim1.voornaam + " betaalt " + interim1.getRSZ() +"% RSZ");
	}
}