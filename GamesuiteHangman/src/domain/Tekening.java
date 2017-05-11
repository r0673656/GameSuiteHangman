package domain;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Tekening implements Drawable{
	
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
//		if(vorm == null) {
//			throw new DomainException("Ongeldige vorm");
//		}
//		else if (vorm.getOmhullende().getMinX() >= Tekening.MIN_X && vorm.getOmhullende().getMaxX() <= Tekening.MAX_X && vorm.getOmhullende().getMinY() >= Tekening.MIN_Y && vorm.getOmhullende().getMaxY() <= Tekening.MAX_Y){
//			vormen.add(vorm);
//		}
//		else{
//			throw new IllegalArgumentException("Ongeldige grenzen");
//		}
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
		String info = "Tekening met naam " + naam + " bestaat uit " + vormen.size() + " vormen: \n";
		for(Vorm vorm : vormen) {
			info += vorm + "\n";
		}
		return info;
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
	@Override
	public void teken(Graphics graphics) {
		// TODO Auto-generated method stub
		
		
	}

}
