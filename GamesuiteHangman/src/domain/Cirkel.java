package domain;

public class Cirkel {
	private Punt middelpunt;
	private int straal;
	
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
	public boolean equals(Cirkel cirkel){
		if(cirkel == null){
			return false;
		}
		else if (this.getMiddelpunt() == cirkel.getMiddelpunt() && this.getStraal() == cirkel.getStraal()){
			return true;
		}
		else{
			return false;
		}
	}
	public String toString(){
		return "Cirkel: middelPunt: " + this.getMiddelpunt() + " - straal: " + this.getStraal();
	}
}
