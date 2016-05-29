package Opdr7_6;

import java.util.ArrayList;

public class Array {
	private ArrayList<winkel> lijst;
	
	// Constructor
	public Array() {
		lijst = new ArrayList<winkel>();
	}
	
	public void voegtoe( winkel les ) { 
		lijst.add( les );
	}
	
	public void print() {
		for( winkel les : lijst ) {
			System.out.println( les );
		}
	}
}

