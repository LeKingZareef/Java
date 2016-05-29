package converter;

import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

import javax.swing.*;


public class converter {

	private JFrame f;
	private JPanel p;
	private JButton b1, b2;
	private JLabel l1, l2, l3;
	private JFormattedTextField t1;
	private JRadioButton rb1, rb2;
	private ButtonGroup bg1;
	private int a;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					converter window = new converter();
					window.f.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public converter() {
		gui();
		a = 32 ;

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void gui() {
		f = new JFrame();
		f.setSize( 280,335);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel ();
		f.getContentPane().add( p );
		
		rb1 = new JRadioButton (" Celcius naar Fahrenheit");
		rb1.setBounds(48, 20, 208, 23);
		rb2 = new JRadioButton (" Fahrenheit naar Celcius");
		rb2.setBounds(48, 46, 208, 23);
		p.setLayout(null);
		p.add(rb1);
		p.add(rb2);
		
		t1 = new JFormattedTextField (NumberFormat.getInstance());;
		t1.setBounds(55, 107, 158, 23);
		p.add(t1);
		
		l1 = new JLabel ("");
		l1.setBounds(48, 248, 165, 23);
		p.add(l1);
		
		l2 = new JLabel ("Voer de temperatuur in");
		l2.setBounds(58, 76, 158, 28);
		p.add (l2);
		
		l3 = new JLabel ("Resultaat:");
		l3.setHorizontalAlignment(SwingConstants.RIGHT);
		l3.setBounds(21, 223, 83, 23);
		p.add(l3);
		
		bg1 = new ButtonGroup ();
		bg1.add(rb1);
		bg1.add(rb2);
		
		b1 = new JButton ( "bereken");
		b1.setForeground(Color.WHITE);
		b1.setBackground(new Color(30, 144, 255));
		b1.setBounds(130, 151, 83, 23);
		p.add(b1);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String inputstring = t1.getText();
				
				int input = Integer.parseInt( inputstring );
				double output1 = (input * 9/5 ) + a ;
				double output2 = (input - a) * 5/9  ;
				
				if (rb1.isSelected()){
				l1.setText (input + "\u2103 \u003d \u0020" + output1 + "\u2109");
				}
				
				else if (rb2.isSelected()){
				l1.setText( input + "\u2109 \u003d \u0020" + output2 + "\u2103" );
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Selecteer een omzetting." , inputstring, JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		
		b2 = new JButton ( "reset");
		b2.setForeground(Color.WHITE);
		b2.setBackground(new Color(255, 0, 0));
		b2.setBounds(130, 185, 83, 23);
		p.add(b2);
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				t1.setText ("");
				l1.setText ("");
			}
		});
		
		
	}
}