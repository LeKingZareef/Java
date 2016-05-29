package opdracht6_6;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.*;
import javax.swing.border.MatteBorder;

public class show extends JFrame {
	public static void main (String args[]) {
		JFrame frame = new show();
		frame.setSize(450, 230);;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Waarden");
		frame.setContentPane(new showpanel());
		frame.setVisible(true);
	}
}
class showpanel extends JPanel {
	private Tellers teller; 
	private JButton btnoptellen, btnaftrekken;
	private JTextField txtoutput;
	
	public showpanel() {
		teller = new Tellers(); 
		teller.setWaarde(0);
		
		setLayout(null);
		setBackground(new Color(198, 81, 81));
		
		
		txtoutput = new JTextField(10);
		txtoutput.setBounds(100, 50, 130, 20);
		txtoutput.setEditable(true);
		
		btnoptellen = new JButton("Optellen");
		btnoptellen.addActionListener(new hndlroptellen());
		
		btnaftrekken = new JButton("Aftrekken");
		btnaftrekken.addActionListener(new hndlraftrekken());
		
		
		btnoptellen.setBounds(100, 120, 130, 20);
		btnoptellen.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnoptellen.setBackground(new Color(250, 250, 250));
		

		btnaftrekken.setBounds(230, 120, 130, 20);
		btnaftrekken.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnaftrekken.setBackground(new Color(250, 250, 250));
		
		
		add(txtoutput);
		add(btnaftrekken);
		add(btnoptellen);
	}
	class hndlroptellen implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			teller.verhoog();
			txtoutput.setText("" + teller.getWaarde());
		 }
	}
	class hndlraftrekken implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			teller.verlaag();
			txtoutput.setText("" + teller.getWaarde());
		 }
	}
}
