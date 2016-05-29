package Shapes;

import java.awt.Color;
import java.awt.Graphics;

public class gettersandSetters {
	private int position ;

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	void teken(Graphics pen){
		pen.fillRect(10, 10, 20, 20);
	}
}
