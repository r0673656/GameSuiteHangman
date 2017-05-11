package domain;

import java.util.ArrayList;
import java.util.List;

public class Tekening{
	
	private String naam;
	private static final int MIN_X = 0;
	private static final int MIN_Y = 0;
	private static final int MAX_X = 399;
	private static final int MAX_Y = 399;
	public ArrayList<Vorm> vormen = new ArrayList<>();
	
	public Tekening(String naam){
		if(naam == null || naam.trim().isEmpty()){
			throw new IllegalArgumentException("");
		}
		this.naam = naam;
	}
	public String getNaam() {
		return naam;
	}
	public void voegToe(Vorm vorm){
		vormen.add(vorm);
	}
	public Vorm getVorm(int index){
		return vormen.get(index);
	}
	public int getAantalVormen(){
		return vormen.size();
	}
	public ArrayList<Vorm> getAlleVormen(){
		return vormen;
	}
	public void verwijder(Vorm vorm){
		vormen.remove(vorm);
	}
	public boolean bevat(Vorm vorm){
		return vormen.contains(vorm);
	}
	public String toString(){
		return null;
	}
	@Override
	public boolean equals(Object object) {
		if(object instanceof Tekening) {
			Tekening tekening = (Tekening) object;
			if(tekening.getAantalVormen() == this.getAantalVormen()) {
				int count = 0;
				for(int i = 0; i < vormen.size(); i++) {
					for(int j = 0; j < vormen.size(); j++) {
						if(this.getVorm(i).getClass().equals(tekening.getVorm(j).getClass()) && this.getVorm(i).equals(tekening.getVorm(j))) {
							count++;
						}
					}
				}
				if(count != this.getAantalVormen()) return false;
				return true;
			}
		}
		return false;
	}

	
}
