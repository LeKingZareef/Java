package opdracht6_7;
import java.awt.*; 
import java.awt.event.*;

import javax.swing.*;

 public class show extends JFrame {
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
	
	private Cirkel geefCirkelAan;
	private JButton btnTeken;
	private JTextField txtInput;
	private JTextField txtInput2;
	private JTextField txtInput3;
	private JLabel inputLabel;
	private JLabel inputLabel2;
	private JLabel inputLabel3;

	public Paneel()
	{	
		inputLabel = new JLabel ( "Straal: getal" ); 
		inputLabel.setBounds(25, 5, 260, 40);
		inputLabel2 = new JLabel ( "Middelpunt: x" ); 
		inputLabel2.setBounds(25, 65, 260, 40);
		inputLabel3 = new JLabel ( "Middelpunt: y" ); 
		inputLabel3.setBounds(25, 125, 260, 40);
		btnTeken = new JButton( "Teken" );
		btnTeken.setBounds(200, 420, 80, 25);
		txtInput = new JTextField( 10 );
		txtInput.setBounds( 20, 30, 260, 40 );
		txtInput2 = new JTextField( 10 );
		txtInput2.setBounds( 20, 90, 260, 40 );
		txtInput3 = new JTextField( 10 );
		txtInput3.setBounds( 20, 150, 260, 40 );
		
		geefCirkelAan = new Cirkel();
		//geefCirkelAan.setMiddelpunt(0, 0);
		//geefCirkelAan.setStraal(0);
		
		classCalculateEventHandler CalculateHandler = new classCalculateEventHandler();	
		btnTeken.addActionListener( CalculateHandler );
		
		add( btnTeken );
		add( inputLabel );
		add( inputLabel2 );
		add( inputLabel3 );
		add( txtInput );
		add( txtInput2 );
		add( txtInput3 );
		
	}
	
	public void paintComponent( Graphics g ) {
		super.paintComponent( g );
		geefCirkelAan.teken( g );
	}
	
	//CALCULATE EVENT
	class classCalculateEventHandler implements ActionListener 
	{
		public void actionPerformed( ActionEvent e ) 
		{
			String myString = txtInput.getText();
			int i = Integer.parseInt(myString);
			geefCirkelAan.setStraal(i);
			String myString2 = txtInput2.getText();
			int X = Integer.parseInt(myString2);
			String myString3 = txtInput3.getText();
			int Y = Integer.parseInt(myString3);
			geefCirkelAan.setMiddelPunt(X, Y);	
			repaint();		
		}		
	}
}
