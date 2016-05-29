package Opdr7_6;

public class winkel {
	private String verloop; 
	
	// Constructor
	public winkel( String verloop ) {
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
