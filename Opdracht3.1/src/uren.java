import javax.swing.*;
import javax.swing.border.MatteBorder;

import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

public class uren extends JFrame {
	public static void main (String args[]){
		JFrame frame = new uren();
		frame.setSize(450, 230);;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Salaris");
		frame.setContentPane(new TempMeterPanel());
		frame.setVisible(true);
	}
}

class TempMeterPanel extends JPanel {
	private JTextField txtuitvoer, txtinvoer; 
	private JLabel lblinvoer, lbluitvoer; 
	private JButton bttnresult; 
	private Font font; 
	
	public TempMeterPanel(){
		setLayout(null);
		setBackground(new Color(198, 81, 81));
		
		font= new Font("Arial", Font.BOLD, 16); 
		
		txtinvoer = new JTextField(10);
		txtinvoer.setHorizontalAlignment(JTextField.RIGHT);
		txtinvoer.setBorder((new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0))));
		
		txtuitvoer = new JTextField(10);
		txtuitvoer.setHorizontalAlignment(JTextField.RIGHT);
		txtuitvoer.setBackground(Color.green);
		txtuitvoer.setBorder((new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0))));
		txtuitvoer.setEditable(false);
		
		bttnresult = new JButton("Bereken");
		bttnresult.addActionListener(new hndlrinvoer());
		
		
		lblinvoer = new JLabel("Maand Salaris");
		lblinvoer.setFont(font);
		lbluitvoer = new JLabel("Jaar Salaris");
		lbluitvoer.setFont(font);
		
		
		lblinvoer.setBounds(60,50,120,20);
		txtinvoer.setBounds(180,50,90,20);
		
		lbluitvoer.setBounds(60,80,120,20);
		txtuitvoer.setBounds(180,80,90,20);
		
		
		bttnresult.setBounds(230, 120, 130, 20);
		bttnresult.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		bttnresult.setBackground(new Color(250, 250, 250));
		
		add(lblinvoer);
		add(txtinvoer);
		add(lbluitvoer);
		add(txtuitvoer);
		add(bttnresult);
		
	}


class hndlrinvoer implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		
		
		
			String Maand = txtinvoer.getText();
			float Jaar = Float.parseFloat( Maand);
			float ResultaatJaar = Jaar*12;
			txtuitvoer.setText(String.format("" + ResultaatJaar));
	 }
	}
}