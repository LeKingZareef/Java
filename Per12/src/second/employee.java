package second;

import java.util.Calendar;

public class employee extends person  {
	public person name; 
	public double jaarsalaris; 
	public int indiensttreding; 
	public String verzekeringsnummer; 
	
	public void employee (person name, double jaarsalaris, int indiensttreding, String verzekeringsnummer) {
		this.name = name; 
		this.jaarsalaris = jaarsalaris; 
		this.indiensttreding = indiensttreding; 
		this.verzekeringsnummer = verzekeringsnummer; 
	}
	
	public double getJaarsalaris() {
		return jaarsalaris;
	}

	public void setJaarsalaris(double jaarsalaris) {
		this.jaarsalaris = jaarsalaris;
	}

	public int getIndiensttreding() {
		return indiensttreding;
	}

	public void setIndiensttreding(int indiensttreding) {
		this.indiensttreding = indiensttreding;
	}

	public String getVerzekeringsnummer() {
		return verzekeringsnummer;
	}

	public void setVerzekeringsnummer(String verzekeringsnummer) {
		this.verzekeringsnummer = verzekeringsnummer;
	}
	
	public void loonbelasting(){
		double loonbelasting = (jaarsalaris/100*3);
		double totaal = jaarsalaris - loonbelasting; 
		System.out.println("Loonbelasting = SRD" + loonbelasting);
		System.out.println("Eindbedrag = SRD" + totaal);
	}
	public void jubileum ( int indiensttreding){
		int year = Calendar.getInstance().get(Calendar.YEAR); 
		if(year - indiensttreding == 10){
			System.out.println("10 jarig jubileum"); 
		}
		else {
			System.out.println("Geen jubileum");
		}
	}
	
}
