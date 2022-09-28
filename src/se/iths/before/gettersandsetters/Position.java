package se.iths.before.gettersandsetters;

public class Position {
	private int x;
	private int y;

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		if(x >= 0) {
			this.x = x;
		} else {
			this.x = 0;
		}
	}
	
	public void setY(int y) {
		if(y >= 0) {
			this.y = y;
		} else {
			this.y = 0;
		}
	}
	
	public void setPos(int x, int y) {
		setX (x);
		setY(y);
	}
}
