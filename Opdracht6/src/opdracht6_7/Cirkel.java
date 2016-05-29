package opdracht6_7;

import java.awt.Graphics;

public class Cirkel {
	private int x, y, straal;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getStraal() {
		return straal;
	}

	public void setStraal(int straal) {
		this.straal = straal;
	} 
	
	void setMiddelPunt(int x, int y){
		setX(x);
		setY(y);
	}
	public void teken ( Graphics pen){
		pen.fillOval(x, y, straal, straal);
	}
}
