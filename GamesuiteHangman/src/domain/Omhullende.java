package domain;

import org.w3c.dom.stylesheets.LinkStyle;

public class Omhullende {
	private Punt positieLinksBoven;
	private int breedte, hoogte;
	
	public Omhullende(Punt positieLinksBoven, int breedte, int hoogte) {
		setPositieLinksBoven(positieLinksBoven);
		setBreedte(breedte);
		setHoogte(hoogte);
	}

	//-------------- SETTERS / GETTERS ----------------//
	
	public Punt getLinkerBovenhoek() {
		return positieLinksBoven;
	}

	private void setPositieLinksBoven(Punt positieLinksBoven) {
		if (positieLinksBoven == null ) {
			throw new DomainException("positielinksboven mag niet null zijn");
		}else {
			this.positieLinksBoven = positieLinksBoven;
		}		
	}

	public int getBreedte() {
		return breedte;
	}

	private void setBreedte(int breedte) {
		if (breedte < 0) {
			throw new DomainException("breedte mag niet kleiner als nul zijn");
		}else {
			this.breedte = breedte;
		}
	}

	public int getHoogte() {
		return hoogte;
	}

	private void setHoogte(int hoogte) {
		if (hoogte < 0) {
			throw new DomainException("hoogte moet > 0");
		}else {
			this.hoogte = hoogte;
		}
	}
	
	public int getMinX() {
		return positieLinksBoven.getX();
	}
	
	public int getMaxX() {
		return positieLinksBoven.getX() + breedte;
	}
	
	public int getMinY() {
		return positieLinksBoven.getY();
	}
	
	public int getMaxY() {
		return positieLinksBoven.getY() + hoogte;
	}
	
	//----------------METHODS------------------//
	
	public boolean equals(Object object){
		if(object instanceof Omhullende){
			Omhullende o = (Omhullende) object;
			if(o.positieLinksBoven.equals(this.positieLinksBoven) && o.breedte == this.breedte && o.hoogte == this.hoogte){
				return true;
			}
		}
		return false;
		
	}
	
	public String toString() {
		return "Omhullende: " + positieLinksBoven.toString() + " " + this.breedte + " - " + this.hoogte;
	}
	
}












