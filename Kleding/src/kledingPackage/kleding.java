package kledingPackage;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class kleding {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kleding window = new kleding();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public kleding() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelHome = new JPanel();
		panelHome.setBackground(UIManager.getColor("OptionPane.warningDialog.border.background"));
		panelHome.setForeground(UIManager.getColor("OptionPane.warningDialog.titlePane.foreground"));
		frame.getContentPane().add(panelHome, "name_15101930352173");
		panelHome.setLayout(null);
		
		JLabel lblWelocme = new JLabel("Welcome");
		lblWelocme.setForeground(Color.BLACK);
		lblWelocme.setFont(new Font("URW Gothic L", Font.BOLD | Font.ITALIC, 28));
		lblWelocme.setBounds(148, 12, 151, 72);
		panelHome.add(lblWelocme);
		
		JButton btnPlay = new JButton("PLAY");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				URL a=kleding.class.getResource("/kledingPackage/geluid/Zwart.wav");
				AudioClip b = Applet.newAudioClip(a);
				b.play();
			}
		});
		btnPlay.setFont(new Font("Serif", Font.BOLD, 23));
		btnPlay.setForeground(UIManager.getColor("TabbedPane.focus"));
		btnPlay.setBackground(new Color(255, 228, 181));
		btnPlay.setBounds(125, 147, 151, 64);
		panelHome.add(btnPlay);
		
		JPanel panelPlay1 = new JPanel();
		frame.getContentPane().add(panelPlay1, "name_15107476672693");
		panelPlay1.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(12, 54, 117, 113);
		panelPlay1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(148, 53, 117, 115);
		panelPlay1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(283, 53, 117, 115);
		panelPlay1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(12, 196, 85, 25);
		panelPlay1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(344, 196, 74, 25);
		panelPlay1.add(btnNewButton_4);
		
		JLabel lblKledingVoorJe = new JLabel("Kleding voor je Hoofd");
		lblKledingVoorJe.setFont(new Font("Purisa", Font.PLAIN, 21));
		lblKledingVoorJe.setBounds(81, 0, 280, 41);
		panelPlay1.add(lblKledingVoorJe);
	}
}
