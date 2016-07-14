package second;

public class Main {
	public static void main (String args[]){
		Customer klant; 
		klant = new Customer();
		klant.Customer("Zareef", 273213 , "Leysweg 199");
		
		System.out.println( "naam klant: " + klant.getName() + " klant nummer " + klant.getContactnummer() + " klant adres " + klant.getAdres());
		
		klant.besteling();
		klant.openrekening();
		
		employee worker;
		worker = new employee();
		person name = new person();
		name.setName("Fredje");
		
		System.out.println( "employee = " + name.getName());
		
		worker.setIndiensttreding(2006);
		worker.setJaarsalaris(20000.82);
		worker.setVerzekeringsnummer("3D4W111");
		System.out.println( "Employee naam" + worker.getIndiensttreding()+ " Jaarsalaris " + worker.getJaarsalaris()+ " Verzekering " + worker.getVerzekeringsnummer());
		
		worker.loonbelasting();
		worker.jubileum(worker.getIndiensttreding());
	}
}
