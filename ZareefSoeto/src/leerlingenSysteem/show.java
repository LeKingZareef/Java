package leerlingenSysteem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

public class show extends JFrame{
	 public static void main( String args[] ) {
		    JFrame frame = new show();
		    frame.setSize( 400, 500 );
		    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		    frame.setTitle( "Blackmamba" );
		    frame.setContentPane( new Paneel() );
		    frame.setVisible( true );
		  }
}

class Paneel extends JPanel{
	
	private Student Leerlingen, Cijfers;
	private JButton btnoptellen, btnaftrekken, btnGem, btnMax;
	private JTextField txtoutput;

public Paneel() {

	setLayout(null);
	setBackground(new Color(198, 81, 81));
	
	Leerlingen = new Student();
	
	Cijfers = new Student();
	Cijfers.setAverage(4);
	Cijfers.setHighScore(10);
	
	txtoutput = new JTextField(10);
	txtoutput.setBounds(100, 50, 130, 20);
	txtoutput.setEditable(true);
	
	btnoptellen = new JButton("Naam");
	btnoptellen.addActionListener(new hndlroptellen());

	btnGem = new JButton("Gemmidelde");
	btnGem.addActionListener(new hndlrGem());
	
	btnMax = new JButton("Max");
	btnMax.addActionListener(new hndlrMax());
	
	btnaftrekken = new JButton("Achternaam");
	btnaftrekken.addActionListener(new hndlraftrekken());
	
	
	btnoptellen.setBounds(100, 120, 130, 20);
	btnoptellen.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	btnoptellen.setBackground(new Color(250, 250, 250));
	

	btnMax.setBounds(200, 200, 130, 20);
	btnMax.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	btnMax.setBackground(new Color(250, 250, 250));
	
	btnGem.setBounds(80, 200, 130, 20);
	btnGem.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	btnGem.setBackground(new Color(250, 250, 250));
	

	btnaftrekken.setBounds(230, 120, 130, 20);
	btnaftrekken.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	btnaftrekken.setBackground(new Color(250, 250, 250));
	
	
	add(txtoutput);
	add(btnaftrekken);
	add(btnoptellen);
	add(btnMax);
	add(btnGem);
	}
class hndlroptellen implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		Leerlingen.getNaam();
		txtoutput.setText("" + Leerlingen.getNaam());
	 }
}
class hndlraftrekken implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		Leerlingen.getVoornaam();
		txtoutput.setText("" + Leerlingen.getVoornaam());
	 }
	}
class hndlrGem implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		Cijfers.getAverage();
		txtoutput.setText("" + 	Cijfers.getAverage());
	 }
}
class hndlrMax implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		txtoutput.setText("" + 	Cijfers.getHighScore());
	 }
	}
}

