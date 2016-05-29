package Opdr7_4;

public class Scoreverloop {
	private String verloop; 
	
	// Constructor
	public Scoreverloop( String verloop ) {
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
