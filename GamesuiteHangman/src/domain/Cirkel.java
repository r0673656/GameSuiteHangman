package domain;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;

public class Cirkel extends Vorm implements Drawable{
	private Punt middelpunt;
	private int straal;
	
	public Cirkel(){
		
	}
	public Cirkel(Punt middelpunt, int straal){
		
		
		setMiddelpunt(middelpunt);
		setStraal(straal);
	}
	public Punt getMiddelpunt() {
		return middelpunt;
	}

	protected void setMiddelpunt(Punt middelpunt) {
		this.middelpunt = middelpunt;
		if (middelpunt == null){
			throw new IllegalArgumentException("Middelpunt mag niet leeg zijn");
		}
	}

	public int getStraal() {
		return straal;
	}
	protected void setStraal(int straal) {
		this.straal = straal;
		if (straal <0 || straal == 0){
			throw new IllegalArgumentException("Straal is strikt positief!");
		}
	}
	
	
	public boolean equals(Object object){
		if(object instanceof Cirkel){
			Cirkel o = (Cirkel) object;
			if(this.getMiddelpunt() == o.getMiddelpunt() && this.getStraal() == o.getStraal()){
				return true;
			}
		}
		return false;
		
	}
	public String toString(){
		return "Cirkel: middelPunt: " + this.getMiddelpunt() + " - straal: " + this.getStraal() + "\n" + getOmhullende().toString();
	}
	
	@Override
	public Omhullende getOmhullende() {
		int minX,maxY;
		
		minX = this.middelpunt.getX() - straal;
		maxY = this.middelpunt.getY() + straal;
		
		Punt p = new Punt(minX,maxY);
		
		Omhullende o = new Omhullende(p, this.straal*2, this.straal*2);
		return o;
	}
	@Override
	public void teken(Graphics graphics) {
		// TODO Auto-generated method stub
		Graphics2D graphics2D = (Graphics2D) graphics;
		graphics2D.setStroke(new BasicStroke(5));

		Cirkel cirkel = new Cirkel(new Punt(70, 70), 60);
		cirkel.drawOval(cirkel.getOmhullende().getMinX(), cirkel
				.getOmhullende().getMinY(), cirkel.getOmhullende()
				.getBreedte(), cirkel.getOmhullende().getHoogte());
	}
	
}
