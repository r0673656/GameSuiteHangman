package domain;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class LijnStuk extends Vorm implements Drawable{
	private Punt startpunt, eindpunt;
	
	
	public LijnStuk(){
		
	}
	public LijnStuk(Punt startpunt, Punt eindpunt) {
		
		
		
		setEindpunt(eindpunt);
		setStartpunt(startpunt);
	}
	
	//------------------- GETTERS / SETTERS ----------------------//
	
	public Punt getStartPunt() {
		return startpunt;
	}
	
	private void setStartpunt(Punt startpunt) {
		if (startpunt == null) {
			throw new DomainException("stratpunt not null");
		}else {
			this.startpunt = startpunt;
		}
	}
	
	public Punt getEindPunt() {
		return eindpunt;
	}
	
	private void setEindpunt(Punt eindpunt) {
		if (eindpunt == null || eindpunt == startpunt) {
			throw new DomainException("eindpunt not null");
		}else {
			this.eindpunt = eindpunt;
		}
	}
	
	//---------------------- METHODES ----------------------------//
	

	public boolean equals(Object object){
		if(object instanceof LijnStuk){
			LijnStuk o = (LijnStuk) object;
			if(o.getStartPunt().equals(this.startpunt) && o.getEindPunt().equals(this.eindpunt)){
				return true;
			}
		}
		return false;
		
	}
	
	
	public String toString() {
		return "Lijn: startpunt: " + startpunt.toString() + " - eindpunt: " + eindpunt.toString() + "\n" + this.getOmhullende().toString();
	}

	@Override
	public Omhullende getOmhullende(){
		int minX,maxY,breedte,hoogte;
		
		if(this.startpunt.getX() < this.eindpunt.getX()){
			minX = startpunt.getX();
		}else{
			minX = eindpunt.getX();
		}
		
		if(this.startpunt.getY() > this.eindpunt.getY()){
			maxY = startpunt.getY();
		}else{
			maxY = eindpunt.getY();
		}
		
		Punt linkerbovenpunt = new Punt(minX,maxY);
		breedte = Math.abs(startpunt.getX()-eindpunt.getX());
		hoogte = Math.abs(startpunt.getY()-eindpunt.getY());
		
		Omhullende o = new Omhullende(linkerbovenpunt, breedte, hoogte);
		
		return o;
		

	}
	@Override
	public void teken(Graphics graphics) {
		// TODO Auto-generated method stub
		Graphics2D graphics2D = (Graphics2D) graphics;
		graphics2D.setStroke(new BasicStroke(5));
		
		LijnStuk l = new LijnStuk(new Punt(70, 130), new Punt(70, 380));
		graphics.drawLine(l.getStartPunt().getX(), l
				.getStartPunt().getY(), l.getEindPunt().getX(), l
				.getEindPunt().getY());
	}
}
