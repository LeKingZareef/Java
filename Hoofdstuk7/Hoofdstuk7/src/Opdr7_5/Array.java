package Opdr7_5;

import java.util.ArrayList;

public class Array {
	private ArrayList<Rapport> lijst;
	
	// Constructor
	public Array() {
		lijst = new ArrayList<Rapport>();
	}
	
	public void voegtoe( Rapport les ) { 
		lijst.add( les );
	}
	
	public void print() {
		for( Rapport les : lijst ) {
			System.out.println( les );
		}
	}
}
