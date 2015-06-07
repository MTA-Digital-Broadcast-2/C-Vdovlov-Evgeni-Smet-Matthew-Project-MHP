/**
* @author Matthew Smet
*/
import java.lang.*;

public class Faktuur implements Betaalbaar
{
	public int faktuurNr;
	public float faktuurBedrag;
	
	public Faktuur(int Fnr,float fB)
	{
		this.faktuurNr = Fnr;
		this.faktuurBedrag = fB;
	}
	
	public void betaal()
	{
		System.out.println("Betaal het faktuur " + faktuurNr + " voor een bedrag van " + faktuurBedrag);
	}
	
}