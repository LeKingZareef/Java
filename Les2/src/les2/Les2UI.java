package les2;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.*;

import java.awt.Dimension;

public class Les2UI {
	private JFrame scherm1= new JFrame("Mijn eerste window");
	
	private void toonScherm1(){
		scherm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		scherm1.setPreferredSize(new Dimension (900,900));
		scherm1.pack();
		scherm1.setVisible(true);

		JMenuBar menu = new JMenuBar();
		
		JMenu File = new JMenu ("File");
		menu.add(File);
		JMenu edit = new JMenu ("edit");
		menu.add(edit);
		
		scherm1.setJMenuBar (menu);
	}
	
	
	public static void main (String[] args){
		Les2UI testwindow= new Les2UI();
		testwindow.toonScherm1();
		
		
		
	}
}
