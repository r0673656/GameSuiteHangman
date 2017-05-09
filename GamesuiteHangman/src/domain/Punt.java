package domain;

public class Punt {
	private int x, y;
	
	public Punt(int x, int y) {
		setX(x);
		setY(y);
	}

	//---------------- GETTERS / SETTERS ----------------//
	
	public int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	private void setY(int y) {
		this.y = y;
	}
	
	//-------------------- METHODES --------------------//
	
	public boolean equals(Punt punt) {
	
		if(punt == null) {
			return false;
		} else if(punt.getX() == this.x && punt.getY() == this.y) { 
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
}
