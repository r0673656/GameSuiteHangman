package domain;

public class Rechthoek {
	private int breedte, hoogte;
	private Punt linkerbovenhoek;
	public Rechthoek(Punt linkerbovenhoek, int breedte, int hoogte) {
		setLinkerbovenhoek(linkerbovenhoek);
		setBreedte(breedte);
		setHoogte(hoogte);
	}
	
	//--------------------- GETTERS / SETTERS ---------------------//
	
	public int getBreedte() {
		return breedte;
	}
	
	private void setBreedte(int breedte) {
		if(breedte <= 0) {
			throw new DomainException("foute breedte");
		}else {
			this.breedte = breedte;
		}
	}
	
	public int getHoogte() {
		return hoogte;
	}
	
	private void setHoogte(int hoogte) {
		if(hoogte <= 0) {
			throw new DomainException("foute hoogte");
		}else {
			this.hoogte = hoogte;
		}
	}
	
	public Punt getLinkerBovenhoek() {
		return linkerbovenhoek;
	}
	
	private void setLinkerbovenhoek(Punt linkerbovenhoek) {
		if(linkerbovenhoek == null) {
			throw new DomainException("geen geldige linker bovenhoek");
		}else {
			this.linkerbovenhoek = linkerbovenhoek;
		}
	}
	
	//------------------------ METHODES --------------------------//
	
	public boolean equals(Rechthoek rechthoek) {
		if(rechthoek == null) {
			return false;
		}else if(rechthoek.getBreedte() == this.breedte && rechthoek.getHoogte() == this.hoogte && rechthoek.getLinkerBovenhoek().equals(this.linkerbovenhoek)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return "Rechthoek: positie: " + this.linkerbovenhoek.toString() + " - breedte: " + this.breedte + " - hoogte: " + this.hoogte;
	}
	
}