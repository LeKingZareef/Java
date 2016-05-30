package Test;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class show extends JFrame {

	public static void main( String[] args )
	{

		//Oef1:	
		//JFrame:
		JFrame JFrameWindow = new show();
		JFrameWindow.setSize(300, 520);
		JFrameWindow.setResizable( false );
		JFrameWindow.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		JFrameWindow.setTitle( "App" );
		JFrameWindow.setLocationRelativeTo(null);
		//JPanel:
		JPanel JPanelWindow = new TijdstipPaneel();
		JPanelWindow.setLayout(null);
		JFrameWindow.setContentPane( JPanelWindow );
		//JPanel
		JFrameWindow.setVisible( false );
		//JFrame
		//Oef1
			
	}
}
class TijdstipPaneel extends JPanel{

	//INSTANTIE VAN CLASS TIJDSTIP
	private Tijdstip geefTijdAan;
//	
//	private JTextField txtInput;
//	private JTextField txtInput2;
//	private JTextField txtInput3;
//	private JTextField txtOutput;
//	private JTextField txtOutput2;
//	private JTextField txtOutput3;
//	private JButton btnCalculate;
	
	public TijdstipPaneel()
	{
		//INSTANTIE / DECLARATIES
		geefTijdAan = new Tijdstip();
//		
//		txtInput = new JTextField( 10 );
//		txtInput2 = new JTextField( 10 );
//		txtInput3 = new JTextField( 10 );
//		txtOutput = new JTextField( 10 );
//		txtOutput2 = new JTextField( 10 );
//		txtOutput3 = new JTextField( 10 );
//		btnCalculate = new JButton( "Calculate" );
//		
//		//STYLE
//		txtOutput.setEditable(false);
//		txtOutput2.setEditable(false);
//		txtOutput3.setEditable(false);
//		txtInput.setBounds( 15, 15, 265, 40 );
//		txtInput2.setBounds( 15, 50, 265, 40 );
//		txtInput3.setBounds( 15, 85, 265, 40 );
//		txtOutput.setBounds( 15, 350, 265, 40 );
//		txtOutput2.setBounds( 15, 385, 265, 40 );
//		txtOutput3.setBounds( 15, 420, 265, 40 );
//		btnCalculate.setBounds(100, 230, 110, 25);
//		btnCalculate.setBorderPainted(false);
//		btnCalculate.setContentAreaFilled(false);
//		btnCalculate.setOpaque(true);
//		btnCalculate.setBackground( new Color(76, 217, 99));
//		btnCalculate.setForeground( new Color(255, 255, 255));
//		classCalculateEventHandler CalculateHandler = new classCalculateEventHandler();
		
		//SETTERS
		geefTijdAan.setUren(30);
		geefTijdAan.setMinuten(10);
		geefTijdAan.setSeconden(122);
		
		//GETTERS / OUTPUT
		System.out.print(geefTijdAan.getUren() + ":");
		System.out.print(geefTijdAan.getMinuten() + ":");
		System.out.print(geefTijdAan.getSeconden());
	}
	
}



