package domain;

public class Tekening {
	
	private String naam;
	private int MIN_X;
	private int MIN_Y;
	private int MAX_X;
	private int MAX_Y;
	
	public Tekening(String naam){
		if(naam == null || naam.trim().isEmpty()){
			throw new DomainException("");
		}
		this.naam = naam;
	}
	public String getNaam() {
		return naam;
	}
	public void voegToe(Vorm vorm){
	}
	public Vorm getVorm(int index){
		return null;
	}
	public int getAantalVormen(){
		return 0;
	}
	public void verwijder(Vorm vorm){
	}
	public boolean bevat(Vorm vorm){
		return true;
	}
	public String toString(){
		return null;
	}
	@Override
	public boolean equals(Object object){
	return false;
	}
}
