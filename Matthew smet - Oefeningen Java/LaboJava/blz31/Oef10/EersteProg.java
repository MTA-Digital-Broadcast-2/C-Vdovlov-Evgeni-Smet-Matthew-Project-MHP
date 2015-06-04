/**
* @author Matthew Smet
*/
import java.lang.*;

public class EersteProg
{
public static void main(String [] args)
	{
	Werknemer werker=new Werknemer("Werker", "Werkmans", 3, 2000.0f);
	werker.betaal();
	
	PartTimeWerknemer interim1=new PartTimeWerknemer("Interim", "1", 3, 12.0f,20);
	interim1.betaal();
	
	StudentWerknemer bertblokker=new StudentWerknemer("Bert", "Blokker", 7, 9.0f,20);
	bertblokker.betaal();
	
	Faktuur faktuur1 = new Faktuur(1, 50.0f);
	faktuur1.betaal();
	}
}