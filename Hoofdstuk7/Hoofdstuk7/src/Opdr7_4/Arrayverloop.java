package Opdr7_4;

import java.util.ArrayList;

public class Arrayverloop {
	private ArrayList<Scoreverloop> lijst;
	
	// Constructor
	public Arrayverloop() {
		lijst = new ArrayList<Scoreverloop>();
	}
	
	public void voegtoe( Scoreverloop work ) { 
		lijst.add( work );
	}
	
	public void print() {
		for( Scoreverloop work : lijst ) {
			System.out.println( work );
		}
	}
}
