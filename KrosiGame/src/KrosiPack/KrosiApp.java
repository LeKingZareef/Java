package KrosiPack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class KrosiApp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KrosiApp window = new KrosiApp();
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
	public KrosiApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setLocationRelativeTo(null);
		frame.setBounds(100, 100, 648, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		
		final JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 204, 204));
		panel.setForeground(Color.BLACK);
		frame.getContentPane().add(panel, "name_31936213632420");
		panel.setLayout(null);
		
		JLabel lblWelcome = new JLabel("");
		lblWelcome.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/HeaderHome.png")));
		lblWelcome.setForeground(new Color(0, 0, 0));
		lblWelcome.setFont(new Font("URW Bookman L", Font.BOLD, 30));
		lblWelcome.setBounds(121, 32, 355, 55);
		panel.add(lblWelcome);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBackground(new Color(0, 204, 204));
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/logo.png")));
		btnNewButton.setBounds(92, 86, 407, 264);
		panel.add(btnNewButton);
		
		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 204, 255));
		frame.getContentPane().add(panel_1, "name_39530493789492");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/HeaderHoofd.png")));
		lblNewLabel.setFont(new Font("Purisa", Font.BOLD, 23));
		lblNewLabel.setBounds(115, 12, 367, 36);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(0, 204, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				URL a=KrosiApp.class.getResource("/KrosiPack/geluid/hoed.wav");
				AudioClip b = Applet.newAudioClip(a);
				b.play();
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/hoed1.png")));
		btnNewButton_2.setBounds(236, 126, 170, 241);
		btnNewButton_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				URL a=KrosiApp.class.getResource("/KrosiPack/geluid/muts.wav");
				AudioClip b = Applet.newAudioClip(a);
				b.play();
			}
		});
		btnNewButton_3.setBackground(new Color(0, 204, 255));
		btnNewButton_3.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/muts1.png")));
		btnNewButton_3.setBounds(435, 126, 170, 241);
		btnNewButton_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				URL a=KrosiApp.class.getResource("/KrosiPack/geluid/pet.wav");
				AudioClip b = Applet.newAudioClip(a);
				b.play();
			}
		});
		btnNewButton_1.setBackground(new Color(0, 204, 255));
		btnNewButton_1.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/pet.png")));
		btnNewButton_1.setBounds(31, 126, 170, 241);
		btnNewButton_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.add(btnNewButton_1);
		
		
		JLabel lblClickEenVan = new JLabel("");
		lblClickEenVan.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/Clickheader.png")));
		lblClickEenVan.setFont(new Font("Purisa", Font.BOLD, 15));
		lblClickEenVan.setBounds(86, 60, 405, 24);
		panel_1.add(lblClickEenVan);
		
		JButton btnStart = new JButton("");
		btnStart.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/video-play-button.png")));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				panel.setVisible(false);
				panel_1.setVisible(true);
				
				URL a=KrosiApp.class.getResource("/KrosiPack/geluid/click.wav");
				AudioClip b = Applet.newAudioClip(a);
				b.play();
			}
		});
		btnStart.setBackground(new Color(0, 204, 204));
		btnStart.setFont(new Font("Avdira", Font.PLAIN, 18));
		btnStart.setBounds(292, 372, 85, 55);
		btnStart.setBorder(null);
		panel.add(btnStart);
		
		JLabel lblDruk = new JLabel("PLAY");
		lblDruk.setFont(new Font("Droid Serif", Font.BOLD, 14));
		lblDruk.setBounds(313, 355, 41, 15);
		panel.add(lblDruk);
		
		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 204, 153));
		frame.getContentPane().add(panel_2, "name_42616217240769");
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/HeaderRomp.png")));
		lblNewLabel_1.setFont(new Font("Analecta", Font.BOLD, 25));
		lblNewLabel_1.setBounds(121, 12, 349, 43);
		panel_2.add(lblNewLabel_1);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(new Color(0, 204, 153));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				URL a=KrosiApp.class.getResource("/KrosiPack/geluid/jurk.wav");
				AudioClip b = Applet.newAudioClip(a);
				b.play();
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/jurk1.png")));
		btnNewButton_4.setBounds(22, 126, 170, 241);
		btnNewButton_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				URL a=KrosiApp.class.getResource("/KrosiPack/geluid/trui.wav");
				AudioClip b = Applet.newAudioClip(a);
				b.play();
			}
		});
		btnNewButton_5.setBackground(new Color(0, 204, 153));
		btnNewButton_5.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/trui1.png")));
		btnNewButton_5.setBounds(226, 126, 170, 241);
		btnNewButton_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				URL a=KrosiApp.class.getResource("/KrosiPack/geluid/jacket.wav");
				AudioClip b = Applet.newAudioClip(a);
				b.play();
			}
		});
		btnNewButton_6.setBackground(new Color(0, 204, 153));
		btnNewButton_6.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/jacket1.png")));
		btnNewButton_6.setBounds(435, 126, 170, 241);
		btnNewButton_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.add(btnNewButton_6);
		
		JButton btnVolgende = new JButton("VOLGENDE");
		btnVolgende.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1.setVisible(false);
				panel_2.setVisible(true);
				
				URL a=KrosiApp.class.getResource("/KrosiPack/geluid/click.wav");
				AudioClip b = Applet.newAudioClip(a);
				b.play();
			}
		});
		btnVolgende.setBackground(new Color(0, 204, 255));
		btnVolgende.setBounds(488, 415, 117, 25);
		panel_1.add(btnVolgende);
		
		
		JLabel lblClickVoorItems = new JLabel("");
		lblClickVoorItems.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/Clickheader.png")));
		lblClickVoorItems.setFont(new Font("Purisa", Font.BOLD, 15));
		lblClickVoorItems.setBounds(61, 57, 409, 38);
		panel_2.add(lblClickVoorItems);
		
		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(204, 153, 0));
		frame.getContentPane().add(panel_3, "name_44869495717953");
		panel_3.setLayout(null);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				URL a=KrosiApp.class.getResource("/KrosiPack/geluid/jeans.wav");
				AudioClip b = Applet.newAudioClip(a);
				b.play();
			}
		});
		btnNewButton_7.setBackground(new Color(204, 153, 0));
		btnNewButton_7.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/jeans1.png")));
		btnNewButton_7.setBounds(32, 126, 170, 241);
		btnNewButton_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				URL a=KrosiApp.class.getResource("/KrosiPack/geluid/kortebroek.wav");
				AudioClip b = Applet.newAudioClip(a);
				b.play();
			}
		});
		btnNewButton_8.setBackground(new Color(204, 153, 0));
		btnNewButton_8.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/broek1-1.png")));
		btnNewButton_8.setBounds(229, 126, 170, 241);
		btnNewButton_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				URL a=KrosiApp.class.getResource("/KrosiPack/geluid/rok.wav");
				AudioClip b = Applet.newAudioClip(a);
				b.play();
			}
		});
		btnNewButton_9.setBackground(new Color(204, 153, 0));
		btnNewButton_9.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/skirt_T1.png")));
		btnNewButton_9.setBounds(432, 126, 170, 241);
		btnNewButton_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.add(btnNewButton_9);
		
		JButton btnVolgende_1 = new JButton("VOLGENDE");
		btnVolgende_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel_3.setVisible(true);
				
				URL a=KrosiApp.class.getResource("/KrosiPack/geluid/click.wav");
				AudioClip b = Applet.newAudioClip(a);
				b.play();
			}
		});
		btnVolgende_1.setBackground(new Color(0, 204, 153));
		btnVolgende_1.setBounds(499, 415, 117, 25);
		panel_2.add(btnVolgende_1);
		
		JLabel lblKledingVoor = new JLabel("");
		lblKledingVoor.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/HeaderBenen.png")));
		lblKledingVoor.setFont(new Font("Anatolian", Font.BOLD, 30));
		lblKledingVoor.setBounds(81, 12, 470, 33);
		panel_3.add(lblKledingVoor);
		
		JLabel lblClickVoorItem = new JLabel("");
		lblClickVoorItem.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/Clickheader.png")));
		lblClickVoorItem.setFont(new Font("Purisa", Font.BOLD, 15));
		lblClickVoorItem.setBounds(63, 57, 378, 33);
		panel_3.add(lblClickVoorItem);
		
		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 153, 0));
		frame.getContentPane().add(panel_4, "name_9606105602431");
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/headerVoeten.png")));
		lblNewLabel_2.setFont(new Font("Gardiner", Font.BOLD, 30));
		lblNewLabel_2.setBounds(129, 12, 352, 33);
		panel_4.add(lblNewLabel_2);
		
		JLabel lblClickVoorItem_1 = new JLabel("");
		lblClickVoorItem_1.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/Clickheader.png")));
		lblClickVoorItem_1.setFont(new Font("Purisa", Font.BOLD, 15));
		lblClickVoorItem_1.setBounds(71, 57, 371, 33);
		panel_4.add(lblClickVoorItem_1);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				URL a=KrosiApp.class.getResource("/KrosiPack/geluid/schoenen.wav");
				AudioClip b = Applet.newAudioClip(a);
				b.play();
			}
		});
		btnNewButton_10.setBackground(new Color(255, 153, 0));
		btnNewButton_10.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/schoenen1_1.png")));
		btnNewButton_10.setBounds(32, 126, 170, 241);
		btnNewButton_10.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_4.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				URL a=KrosiApp.class.getResource("/KrosiPack/geluid/sokken.wav");
				AudioClip b = Applet.newAudioClip(a);
				b.play();
			}
		});
		btnNewButton_11.setBackground(new Color(255, 153, 0));
		btnNewButton_11.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/sokken1.png")));
		btnNewButton_11.setBounds(229, 126, 170, 241);
		btnNewButton_11.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_4.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				URL a=KrosiApp.class.getResource("/KrosiPack/geluid/hogehakken.wav");
				AudioClip b = Applet.newAudioClip(a);
				b.play();
			}
		});
		btnNewButton_12.setBackground(new Color(255, 153, 0));
		btnNewButton_12.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/high-heels1.png")));
		btnNewButton_12.setBounds(431, 126, 170, 241);
		btnNewButton_12.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_4.add(btnNewButton_12);
		
		
		JButton btnVolgende_2 = new JButton("VOLGENDE");
		btnVolgende_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(false);
				panel_4.setVisible(true);
				
				URL a=KrosiApp.class.getResource("/KrosiPack/geluid/click.wav");
				AudioClip b = Applet.newAudioClip(a);
				b.play();
				
			}
		});
		btnVolgende_2.setBackground(new Color(204, 153, 0));
		btnVolgende_2.setBounds(499, 415, 117, 25);
		panel_3.add(btnVolgende_2);
		
		
		final JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 204, 0));
		frame.getContentPane().add(panel_5, "name_11266993202663");
		panel_5.setLayout(null);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(KrosiApp.class.getResource("/KrosiPack/foto/Eind1.png")));
		label_3.setBounds(116, 30, 454, 274);
		panel_5.add(label_3);
		
		JButton btnVolgende_3 = new JButton("VOLGENDE");
		btnVolgende_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_4.setVisible(false);
				panel_5.setVisible(true);
				
				URL a=KrosiApp.class.getResource("/KrosiPack/geluid/applause3.wav");
				AudioClip b = Applet.newAudioClip(a);
				b.play();
			}
		});
		btnVolgende_3.setBackground(new Color(255, 153, 0));
		btnVolgende_3.setBounds(499, 415, 117, 25);
		panel_4.add(btnVolgende_3);
		
		JButton btnOpnieuw = new JButton("OPNIEUW");
		btnOpnieuw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_5.setVisible(false);
				panel.setVisible(true);
				
				URL a=KrosiApp.class.getResource("/KrosiPack/geluid/click.wav");
				AudioClip b = Applet.newAudioClip(a);
				b.play();
			}
		});
		btnOpnieuw.setBackground(new Color(51, 204, 0));
		btnOpnieuw.setBounds(352, 316, 126, 41);
		panel_5.add(btnOpnieuw);
		
		JButton btnSluiten = new JButton("SLUITEN");
		btnSluiten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSluiten.setBackground(new Color(255, 51, 0));
		btnSluiten.setBounds(187, 317, 125, 39);
		panel_5.add(btnSluiten);
	}
}
