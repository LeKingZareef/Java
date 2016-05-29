package Opdr7_4;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Scorebord extends JPanel{
	
	private JButton btnVerhogen;
	private JButton btnVerlagen;
	private JButton btnVerhogen2;
	private JButton btnVerlagen2;
	private JTextField txtOutput;
	private JTextField txtOutput2;
	private JLabel txtStand;
	private JLabel txtVerloop;
	private Teller geefWaardeAan;
	private Teller geefWaardeAan2;
	
	public Scorebord()
	{	
		//Button Berekenen
		btnVerhogen = new JButton( "+" );
		btnVerlagen = new JButton( "-" );
		btnVerhogen2 = new JButton( "+" );
		btnVerlagen2 = new JButton( "-" );
		txtOutput = new JTextField( 10 );
		txtOutput2 = new JTextField( 10 );
		txtStand = new JLabel( "Stand: " );
		txtVerloop = new JLabel( "Verloop: " );
		
		Font font2 = new Font("SansSerif", Font.PLAIN , 50);
		
		txtOutput.setEditable(false);
		txtOutput.setBounds( 20, 30, 100, 100 );
		txtOutput.setFont(font2);
		
		txtOutput2.setEditable(false);
		txtOutput2.setBounds( 200, 30, 100, 100 );
		txtOutput2.setFont(font2);
		
		txtStand.setBounds( 30, 200, 100, 30 );
		txtVerloop.setBounds( 30, 220, 1000, 30 );
		
		btnVerhogen.setBounds(70, 140, 50, 25);
		btnVerlagen.setBounds(25, 140, 50, 25);
		btnVerhogen2.setBounds(255, 140, 50, 25);
		btnVerlagen2.setBounds(215, 140, 50, 25);
		
		classCalculateEventHandler CalculateHandler = new classCalculateEventHandler();	
		classCalculateEventHandler2 CalculateHandler2 = new classCalculateEventHandler2();
		
		classCalculateEventHandler3 CalculateHandler3 = new classCalculateEventHandler3();	
		classCalculateEventHandler4 CalculateHandler4 = new classCalculateEventHandler4();	
		
		geefWaardeAan = new Teller();
		geefWaardeAan.setWaarde(0);
		geefWaardeAan2 = new Teller();
		geefWaardeAan2.setWaarde(0);
		
		add( btnVerhogen );
		add( btnVerlagen );
		add( btnVerhogen2 );
		add( btnVerlagen2 );
		add( txtOutput );
		add( txtOutput2 );
		add( txtStand );
		add( txtVerloop );
		
		btnVerhogen.addActionListener( CalculateHandler );
		btnVerlagen.addActionListener( CalculateHandler2 );	
		btnVerhogen2.addActionListener( CalculateHandler3 );
		btnVerlagen2.addActionListener( CalculateHandler4 );	
	}
	
	//CALCULATE EVENT
	class classCalculateEventHandler implements ActionListener 
	{
		public void actionPerformed( ActionEvent e ) 
		{
			//txtOutput.setText("" + ++x);
			geefWaardeAan.verhoog();
			txtOutput.setText("" + geefWaardeAan.getWaarde());
			txtStand.setText( "Stand: " + txtOutput.getText() + " - " + txtOutput2.getText() );
			
			Scoreverloop verlooptext;
			Arrayverloop arrayverloop = new Arrayverloop();
			verlooptext = new Scoreverloop ("Ploeg 1 scoort!");
			arrayverloop.voegtoe( verlooptext );
			arrayverloop.print();
		}		
	}
	
	//CALCULATE EVENT
	class classCalculateEventHandler2 implements ActionListener 
	{
		public void actionPerformed( ActionEvent e ) 
		{
			//txtOutput.setText("" + --x);
			geefWaardeAan.verlaag();
			txtOutput.setText("" + geefWaardeAan.getWaarde());
			txtStand.setText( "Stand: " + txtOutput.getText() + " - " + txtOutput2.getText() );
			
			Scoreverloop verlooptext;
			Arrayverloop arrayverloop = new Arrayverloop();
			verlooptext = new Scoreverloop ("Dit was een vergissing, ploeg 1 moet een punt minder krijgen");
			arrayverloop.voegtoe( verlooptext );
			arrayverloop.print();
		}		
	}
	
	//CALCULATE EVENT
	class classCalculateEventHandler3 implements ActionListener 
	{
		public void actionPerformed( ActionEvent e ) 
		{
			//txtOutput.setText("" + ++x);
			geefWaardeAan2.verhoog();
			txtOutput2.setText("" + geefWaardeAan2.getWaarde());
			txtStand.setText( "Stand: " + txtOutput.getText() + " - " + txtOutput2.getText() );
			
			Scoreverloop verlooptext;
			Arrayverloop arrayverloop = new Arrayverloop();
			verlooptext = new Scoreverloop ("Ploeg 2 scoort!");
			arrayverloop.voegtoe( verlooptext );
			arrayverloop.print();
		}		
	}
	
	//CALCULATE EVENT
	class classCalculateEventHandler4 implements ActionListener 
	{
		public void actionPerformed( ActionEvent e ) 
		{
			//txtOutput.setText("" + ++x);
			geefWaardeAan2.verlaag();
			txtOutput2.setText("" + geefWaardeAan2.getWaarde());
			txtStand.setText( "Stand: " + txtOutput.getText() + " - " + txtOutput2.getText() );
			
			Scoreverloop verlooptext;
			Arrayverloop arrayverloop = new Arrayverloop();
			verlooptext = new Scoreverloop ("Dit was een vergissing, ploeg 2 moet een punt minder krijgen");
			arrayverloop.voegtoe( verlooptext );
			arrayverloop.print();
		}		
	}
	
}
