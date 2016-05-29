package Opdr7_4;
import javax.swing.*;

public class Frame extends JFrame{

	public static void main( String[] args )
	{
		//JFrame:
		JFrame JFrameWindow = new Frame();
		JFrameWindow.setSize(320, 520);
		JFrameWindow.setResizable( false );
		JFrameWindow.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		JFrameWindow.setTitle( "App" );
		JFrameWindow.setLocationRelativeTo(null);
		//JPanel:
		JPanel JPanelWindow = new Scorebord();
		JPanelWindow.setLayout(null);
		JFrameWindow.setContentPane( JPanelWindow );
		//JPanel
		JFrameWindow.setVisible( true );
		//JFrame
	}
	
}
