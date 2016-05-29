import javax.swing.*;
import java.awt.*;


public class TempMeter extends JFrame {
	private JLabel lbl1;
	private JLabel lbl2;
	
	public TempMeter(){
		setLayout(new FlowLayout()	);
		
		lbl1 = new JLabel("Graden Celcius");
		add(lbl1);
		lbl1.setLocation(200,000);
	}
}
