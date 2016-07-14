package second;

public class Customer {
	public String name;
	public int contactnummer; 
	public String adres; 
	public double product;
	public double openrekening;
	
	public void Customer( String name, int contactnummer, String adres, double product){
		this.name = name;
		this.contactnummer = contactnummer; 
		this.adres = adres;
		this.product = product;
		this.openrekening = openrekening;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContactnummer() {
		return contactnummer;
	}

	public void setContactnummer(int contactnummer) {
		this.contactnummer = contactnummer;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	public void besteling (){ 
		System.out.println("Totaal bedrag bestelling: SRD" + product);
	}
	public void openrekening (){
		if (product == 0){
		
			System.out.println("U heeft geen open rekeningen");
		
		} else {
			
		System.out.println("De rekening van uw auto staat nog open");
		
		}
	}
	
}
