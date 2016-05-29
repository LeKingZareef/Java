package Opdr7_5;


public class Rapport {
	private String verloop; 
	
	// Constructor
	public Rapport( String verloop ) {
		this.verloop = verloop; 
	}
	
	// Getters
	public String getScore() {
		return verloop; 
	}
	
	public String toString() { 
		return
		String.format( verloop ); 
	}
}
