package domain;

public class Punt {
	private int x, y;
	
	public Punt(int x, int y) {
		setX(x);
		setY(y);
	}
	public Punt(){
		
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
	
	public boolean equals(Object object){
		if(object instanceof Punt){
			Punt o = (Punt) object;
			if(this.getX() == o.getX() && this.getY() == o.getY()){
				return true;
			}
		}
		return false;
		
	}
	
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
}
