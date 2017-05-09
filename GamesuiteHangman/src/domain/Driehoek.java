package domain;

public class Driehoek {
	private Punt hoekPunt1;
	private Punt hoekPunt2;
	private Punt hoekPunt3;
	
	public Driehoek(Punt hoekPunt1, Punt hoekPunt2, Punt hoekPunt3){
		setHoekPunt1(hoekPunt1);
		setHoekPunt2(hoekPunt2);
		setHoekPunt3(hoekPunt3);
	}

	//Getters/setters
	public Punt getHoekPunt1() {
		return hoekPunt1;
	}

	private void setHoekPunt1(Punt hoekPunt1) {
		if(hoekPunt1 == null){
			throw new DomainException("hoekpunt1 is null");
		}
		this.hoekPunt1 = hoekPunt1;
	}

	public Punt getHoekPunt2() {
		return hoekPunt2;
	}

	private void setHoekPunt2(Punt hoekPunt2) {
		if(hoekPunt2 == null){
			throw new DomainException("hoekpunt2 is null");
		}
		this.hoekPunt2 = hoekPunt2;
	}

	public Punt getHoekPunt3() {
		return hoekPunt3;
	}

	private void setHoekPunt3(Punt hoekPunt3) {
		if(hoekPunt3 == null){
			throw new DomainException("hoekpunt3 is null");
		}
		this.hoekPunt3 = hoekPunt3;
	}
	
	//Methodes
	
	public boolean equals(Driehoek driehoek){
		if(driehoek == null){
			return false;
		}else if(driehoek.getHoekPunt1().equals(this.hoekPunt1) && driehoek.getHoekPunt2().equals(this.hoekPunt2) && driehoek.getHoekPunt3().equals(this.hoekPunt3)){
			return true;
		}else{
			return false;
		}
	}
	
	//TODO: checken of de drie punten op een lijn liggen, formule op p18 
		
}

