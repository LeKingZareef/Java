import javax.swing.*;
public class TempFrame {
	public static void main(String[] args) {
		TempMeter label = new TempMeter();
		label.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setSize(400,200);
		JPanel Panel_1 = new Panel_1();
		label.setContentPane(Panel_1);
		label.setVisible(true);
	}
}
