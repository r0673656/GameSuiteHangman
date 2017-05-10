package domain;

public class LijnStuk{
	private Punt startpunt, eindpunt;
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
		return "Lijn: startpunt: " + startpunt.toString() + " - eindpunt: " + eindpunt.toString();
	}
	
}
