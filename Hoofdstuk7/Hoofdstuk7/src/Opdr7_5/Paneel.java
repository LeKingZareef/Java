package Opdr7_5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Paneel extends JPanel{
	private JButton btnVerhogen;
	private JTextField txtInput;
	private JTextField txtInput2;
	private JLabel inputLabel;
	private JLabel inputLabel2;
	private JLabel inputLabel3;

	public Paneel()
	{	
		inputLabel = new JLabel ( "Vak" ); 
		inputLabel.setBounds(25, 25, 260, 40);
		inputLabel2 = new JLabel ( "Cijfer" ); 
		inputLabel2.setBounds(25, 85, 260, 40);
		inputLabel3 = new JLabel ( "Rapport" ); 
		inputLabel3.setBounds(25, 0, 260, 40);
		txtInput = new JTextField( 10 );
		txtInput.setBounds( 20, 50, 260, 40 );
		txtInput2 = new JTextField( 10 );
		txtInput2.setBounds( 20, 110, 260, 40 );
		btnVerhogen = new JButton( "Toevoegen" );
		btnVerhogen.setBounds(70, 155, 150, 25);
		classCalculateEventHandler CalculateHandler = new classCalculateEventHandler();			
		add( btnVerhogen );
		add( txtInput );
		add( txtInput2 );
		add( inputLabel );
		add( inputLabel2 );
		add( inputLabel3 );
		btnVerhogen.addActionListener( CalculateHandler );
		System.out.println( "Rapport" );
		System.out.println( "Vak | Cijfer" );
	}
	//CALCULATE EVENT
		class classCalculateEventHandler implements ActionListener 
		{
			public void actionPerformed( ActionEvent e ) 
			{
				Rapport verlooptext;
				Array arrayverloop = new Array();
				verlooptext = new Rapport (txtInput.getText() + " | " + txtInput2.getText());
				arrayverloop.voegtoe( verlooptext );
				arrayverloop.print();
			}		
		}
	
}
