import javax.swing.*;
import javax.swing.border.MatteBorder;

import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

public class TempMeterClass extends JFrame {
	public static void main (String args[]){
		JFrame frame = new TempMeterClass();
		frame.setSize(450, 230);;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Temperatuur Meter");
		frame.setContentPane(new TempMeterPanel());
		frame.setVisible(true);
	}
}

class TempMeterPanel extends JPanel {
	private JTextField txtuitvoer; 
	private JFormattedTextField txtinvoer;
	private JLabel lblinvoer, lbluitvoer, lblmelding; 
	private JButton bttnresult, bttnreset; 
	private JRadioButton radiograden; 
	private JRadioButton radiofarenheit; 
	private ButtonGroup group;
	private Font font; 
	
	public TempMeterPanel(){
		setLayout(null);
		setBackground(new Color(198, 81, 81));
		
		font= new Font("Arial", Font.BOLD, 16); 
		
		txtinvoer = new JFormattedTextField(NumberFormat.getInstance());
		//txtinvoer = new JTextField(10);
		txtinvoer.setHorizontalAlignment(JTextField.RIGHT);
		txtinvoer.setBorder((new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0))));
		
		txtuitvoer = new JTextField(10);
		txtuitvoer.setHorizontalAlignment(JTextField.RIGHT);
		txtuitvoer.setBackground(Color.green);
		txtuitvoer.setBorder((new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0))));
		txtuitvoer.setEditable(false);
		
		bttnresult = new JButton("Bereken");
		bttnresult.addActionListener(new hndlrinvoer());
		
		bttnreset = new JButton("Reset");
		
		lblinvoer = new JLabel("Type Getal In");
		lblinvoer.setFont(font);
		lbluitvoer = new JLabel("Resultaat");
		lbluitvoer.setFont(font);
		lblmelding = new JLabel("U moet zich aan de Voorwaarden houden");
		
		lblmelding.setVisible(false);
		lblmelding.setFont(font);
		
		radiograden = new JRadioButton("Celcius", false);
		radiograden.setFont(font);
		radiofarenheit = new JRadioButton("Farenheit", false);
		radiofarenheit.setFont(font);
		
		lblinvoer.setBounds(60,50,120,20);
		txtinvoer.setBounds(180,50,90,20);
		
		lbluitvoer.setBounds(60,80,120,20);
		txtuitvoer.setBounds(180,80,90,20);
		lblmelding.setBounds(70, 150, 320, 30);
		
		radiograden.setBounds(300,50,120,20);
		radiofarenheit.setBounds(300,80,120,20);
		radiograden.setBackground(new Color(198, 81, 81));
		radiofarenheit.setBackground(new Color(198, 81, 81));
		
		bttnresult.setBounds(230, 120, 130, 20);
		bttnresult.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		bttnresult.setBackground(new Color(250, 250, 250));
		
		bttnreset.setBounds(80, 120, 130, 20);
		bttnreset.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		bttnreset.setBackground(new Color(255, 0, 0));
		
		add(lblinvoer);
		add(txtinvoer);
		add(lbluitvoer);
		add(txtuitvoer);
		add(bttnresult);
		add(radiograden);
		add(radiofarenheit);
		add(lblmelding);
		add(bttnreset);
		
		group = new ButtonGroup();
		group.add(radiograden);
		group.add(radiofarenheit);
	}


class hndlrinvoer implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		
		
		
		String text =txtinvoer.getText();
		if (radiofarenheit.isSelected()){
			String Graden = txtinvoer.getText();
			int GradenCel = Integer.parseInt( Graden);
			double ResultaatFarenheit = GradenCel*1.8+32;
			txtuitvoer.setText(String.format("%.2f\u00b0F",ResultaatFarenheit));
		} 
		else if (radiograden.isSelected())
		{
			String Graden = txtinvoer.getText();
			int GradenCel = Integer.parseInt( Graden);
			double ResultaatGraden = (GradenCel-32)/1.8;
			txtuitvoer.setText(String.format("%.2f\u00b0C",ResultaatGraden));
			
		}
		
		else if (text.isEmpty()){
			lblmelding.setVisible(true);
		}
		else {
			lblmelding.setVisible(true);
		};
		

bttnreset.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
		txtinvoer.setText ("");
		txtuitvoer.setText ("");
		lblmelding.setVisible(false);
		group.clearSelection();
		}
	});
	
		}
	}
}

