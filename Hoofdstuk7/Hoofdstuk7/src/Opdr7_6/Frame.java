package Opdr7_6;

import javax.swing.*;

public class Frame extends JFrame{

	public static void main( String[] args )
	{
		//JFrame:
		JFrame JFrameWindow = new Frame();
		JFrameWindow.setSize(300, 520);
		JFrameWindow.setResizable( false );
		JFrameWindow.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		JFrameWindow.setTitle( "App" );
		JFrameWindow.setLocationRelativeTo(null);
		//JPanel:
		JPanel JPanelWindow = new Paneel();
		JPanelWindow.setLayout(null);
		JFrameWindow.setContentPane( JPanelWindow );
		//JPanel
		JFrameWindow.setVisible( true );
		//JFrame
	}
	
}
