package domain;

public class Cirkel extends Vorm{
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
		return "Cirkel: middelPunt: " + this.getMiddelpunt() + " - straal: " + this.getStraal();
	}
	@Override
	public Omhullende getOmhullende() {
		// TODO Auto-generated method stub
		return null;
	}
}
