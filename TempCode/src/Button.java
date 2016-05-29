import javax.swing.*;
import java.awt.*;

public class TempCodeClass extends JFrame //Class
{ //Begin van een Class
public static void main( String [ ] args ) //Method
	{
	JFrame frame = new TempCodeClass ( ) ;
	frame.setSize ( 400, 200 ) ;
	frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
	frame.setTitle ( "Eerste applicatie" ) ;
	frame.setVisible ( true );
	}
} //End of a Class

public class Button extends JFrame
{
	
	private JButton knop;
	private JTextField tekstvak; 
	
	public Button(){
		super("Title");
		setLayout(new FlowLayout());
		
		knop = new JButton("knop1");
		add(knop);
	}

}
