package Opdr7_6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Paneel extends JPanel{
	private JButton btnVerhogen;
	private JTextField txtInput;
	private JTextField txtInput2;
	private JTextField txtInput3;
	private JLabel inputLabel;
	private JLabel inputLabel2;
	private JLabel inputLabel3;
	private JLabel inputLabel4;

	public Paneel()
	{	
		inputLabel = new JLabel ( "Artikel" ); 
		inputLabel.setBounds(25, 25, 260, 40);
		inputLabel2 = new JLabel ( "Omschrijving" ); 
		inputLabel2.setBounds(25, 85, 260, 40);
		inputLabel3 = new JLabel ( "Winkel" ); 
		inputLabel3.setBounds(25, 0, 260, 40);
		inputLabel4 = new JLabel ( "Aantal" ); 
		inputLabel4.setBounds(25, 145, 260, 40);
		txtInput = new JTextField( 10 );
		txtInput.setBounds( 20, 50, 260, 40 );
		txtInput2 = new JTextField( 10 );
		txtInput2.setBounds( 20, 110, 260, 40 );
		txtInput3 = new JTextField( 10 );
		txtInput3.setBounds( 20, 170, 260, 40 );
		btnVerhogen = new JButton( "Toevoegen" );
		btnVerhogen.setBounds(70, 220, 150, 25);
		classCalculateEventHandler CalculateHandler = new classCalculateEventHandler();			
		add( btnVerhogen );
		add( txtInput );
		add( txtInput2 );
		add( txtInput3 );
		add( inputLabel );
		add( inputLabel2 );
		add( inputLabel3 );
		add( inputLabel4 );
		btnVerhogen.addActionListener( CalculateHandler );
		System.out.println( "Winkel" );
		System.out.println( "Artikel | Omschrijving | Aantal" );
	}
	//CALCULATE EVENT
		class classCalculateEventHandler implements ActionListener 
		{
			public void actionPerformed( ActionEvent e ) 
			{
				winkel verlooptext;
				Array arrayverloop = new Array();
				verlooptext = new winkel (txtInput.getText() + " | " + txtInput2.getText() + " | " + txtInput3.getText());
				arrayverloop.voegtoe( verlooptext );
				arrayverloop.print();
			}		
		}
	
}
