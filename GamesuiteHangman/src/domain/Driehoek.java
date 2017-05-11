package domain;

public class Driehoek extends Vorm{
	private Punt hoekPunt1;
	private Punt hoekPunt2;
	private Punt hoekPunt3;
	
	public Driehoek(){
		
	}
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
		}else if(((this.hoekPunt2.getX()-this.hoekPunt1.getX())*(hoekPunt3.getY()-this.hoekPunt1.getY()))==((hoekPunt3.getX()-this.hoekPunt1.getX())*(this.hoekPunt2.getY()-this.hoekPunt1.getY()))){
			throw new DomainException("hoekpunten op zelfde lijn!");
		}
		this.hoekPunt3 = hoekPunt3;
	}
	
	//Methodes
	
	
	
	public boolean equals(Object object){
		if(object instanceof Driehoek){
			Driehoek o = (Driehoek) object;
			if(o.getHoekPunt1().equals(this.hoekPunt1) && o.getHoekPunt2().equals(this.hoekPunt2) && o.getHoekPunt3().equals(this.hoekPunt3)){
				return true;
			}
		}
		return false;
		
	}

	@Override
	public Omhullende getOmhullende() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
}



























