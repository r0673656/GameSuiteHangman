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
	public boolean equals(Object object){
		boolean result = false;
		if(object instanceof Tekening){
			Tekening t = (Tekening) object;
			
			if(this.getAantalVormen() == (t.getAantalVormen()) && (this.getNaam().equals(t.getNaam()))){
				result = true;
			}
			
		}
		
	return result;	
		
	}
	
}
