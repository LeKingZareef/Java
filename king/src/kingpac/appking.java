package kingpac;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class appking {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					appking window = new appking();
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
	public appking() {
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
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_2921790785384");
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("welkom");
		lblNewLabel.setBounds(147, 71, 70, 50);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("enter");
		btnNewButton.setBounds(147, 146, 117, 25);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "name_2943116642383");
		panel_1.setLayout(null);
		
		JButton btnKlik = new JButton("klik");
		btnKlik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnKlik.setBounds(145, 96, 117, 25);
		panel_1.add(btnKlik);
		
		JButton btnClose = new JButton("close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnClose.setBounds(149, 153, 117, 25);
		panel_1.add(btnClose);
	}
}
