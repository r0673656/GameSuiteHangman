package domain;

import java.util.ArrayList;

public class Tekening extends Vorm{
	
	private String naam;
	private static final int MIN_X = 0;
	private static final int MIN_Y = 0;
	private static final int MAX_X = 399;
	private static final int MAX_Y = 399;
	public ArrayList<Vorm> vormen;
	
	public Tekening(String naam){
		
		super();
		
		if(naam == null || naam.trim().isEmpty()){
			throw new IllegalArgumentException("");
		}
		this.naam = naam;
		
	}
	public String getNaam() {
		return naam;
	}
	public void voegToe(Vorm vorm){
	}
	public Vorm getVorm(int index){
		
//		return this.vormen.get(index);
		
		return null;
		
	}
	public int getAantalVormen(){
		
//		return this.vormen.size();
		
		int som  = 0;
		
		for (int i = 0; i < vormen.size();i++){
			som++;
		}
		
		return som;
		
		}
	
	public void verwijder(Vorm vorm){
		
		this.vormen.remove(vorm);
		
	}
	public boolean bevat(Vorm vorm){
		return true;
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
