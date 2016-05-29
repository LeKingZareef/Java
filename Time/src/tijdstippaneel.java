import javax.swing.JFrame;
import javax.swing.JPanel;

public class tijdstippaneel extends JFrame {

	public static void main( String[] args )
	{

		JFrame frame = new tijdstippaneel();
		frame.setSize(450, 230);;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("App");
		frame.setContentPane(new App());
		frame.setVisible(false);
			
	}
}

class App extends JPanel{
	private tijdstip time;
	private tijdstip time1;
	
	public App(){
		time = new tijdstip (1,2,3);
		time1 = new tijdstip (5,6,7);
		
		System.out.println("Uren : " + time.getUren());
		System.out.println("Seconden : " + time.getSec());
		System.out.println("Minuten : " + time.getMin());
		
		System.out.println("Uren : " + time1.getUren());
		System.out.println("Seconden : " + time1.getSec());
		System.out.println("Minuten : " + time1.getMin());

	}
}
