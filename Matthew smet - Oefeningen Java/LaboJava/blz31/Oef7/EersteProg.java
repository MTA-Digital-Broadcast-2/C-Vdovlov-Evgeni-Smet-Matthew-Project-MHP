/**
* @author Matthew Smet
*/
import java.lang.*;

public class EersteProg
{
public static void main(String [] args)
	{
	StudentWerknemer bertblokker=new StudentWerknemer("Bert", "Blokker", 7, 9.0f,20);
	System.out.println(bertblokker.voornaam + " betaalt " + bertblokker.getRSZ() +"% RSZ");
	}
}