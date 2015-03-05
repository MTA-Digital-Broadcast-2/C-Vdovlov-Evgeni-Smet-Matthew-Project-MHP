/**
* Oefening 1.11
* @author Matthew Smet
* @import importeren van nodige libraries
*/ 

import java.lang.*;

/**
* klasse Eersteprog gebaseerd op oefening 1.11 met 2 methoden
* Methode main met @param args array van strings met meegegeven parameters
* Methode drukaf met @param integer m
*/

public class Eersteprog
{
	public static void main(String args[])
	{
		//Methode drukaf word opgeroepen met parameter 100
		drukaf(100);
	}
	
	private static void(int m)
	{	
		//Locale variablen wordt aangemaakt(a)
		int a;
		//herhaalt de lus 100x (meegegeven parameter)
		for (a=0;a<m;a++)
		{
		//print het getal uit in de cmd
			System.out.println(a);
		}
	}
}