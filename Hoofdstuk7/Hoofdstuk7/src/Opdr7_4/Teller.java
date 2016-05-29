package Opdr7_4;

public class Teller {
	private int waarde;
	
	public int getWaarde() {
		return waarde;
	}

	public void setWaarde(int waarde) {
		this.waarde = waarde;
	}
	
	public void verhoog(){
		++waarde;
	}
	
	public void verlaag(){
		--waarde;
	}
}
