package ui;

import javax.swing.JOptionPane;

import domain.Cirkel;
import domain.Punt;
import domain.Rechthoek;
import domain.Speler;

public class PictionaryUI {
	private Speler s;
	
	public PictionaryUI(Speler s){
		setSpeler(s);
	}
	private void setSpeler(Speler s) {
		// TODO Auto-generated method stub
		this.s = s;
		if(s == null){
			throw new IllegalArgumentException("Speler mag niet leeg zijn");
		}
	}
	public void toonMenu(){
		boolean aan = true;
		while(aan){
			Object [] shapes = {"Cirkel", "Rechthoek", "Afsluiten"};
			String keuze = (String)JOptionPane.showInputDialog(null, "Wat wilt u tekenen?", "input"
					, JOptionPane.INFORMATION_MESSAGE, null, shapes, null);
			switch(keuze){
			case "Afsluiten":
				aan = false;
				break;
			case "Cirkel":
				Cirkel c = maakCirkel();
				JOptionPane.showMessageDialog(null, "U heeft een correcte cirkel aangemaakt: "+ cirkel);
				break;
			case "Rechthoek":
				Rechthoek r = maakRechthoek();
				JOptionPane.showMessageDialog(null, "U heeft een correcte rechthoek aangemaakt: " + rechthoek.);
				break;
			}
		
			protected Rechthoek maakRechthoek(){
				try{
					int xco = Integer.parseInt(JOptionPane.showInputDialog("x-coördinaat van de linkerbovenhoek:"));
					int yco = Integer.parseInt(JOptionPane.showInputDialog("y-coördinaat van de linkerbovenhoek:"));
					
					Punt linkerbovenhoek = new Punt(xco,yco);		
					int breedte = Integer.parseInt(JOptionPane.showInputDialog("Breedte van de rechthoek: "));
					int hoogte = Integer.parseInt(JOptionPane.showInputDialog("Hoogte van de rechthoek: "));
					Rechthoek rechthoek = new Rechthoek(linkerbovenhoek, breedte, hoogte);
					
					} catch(Exception e){
					e.getMessage();
				}
				return rechthoek;
		}
		
		private Cirkel maakCirkel() {
		try{
			int x = Integer.parseInt(JOptionPane.showInputDialog("x-coördinaat van het punt:"));
			int y = Integer.parseInt(JOptionPane.showInputDialog("y-coördinaat van het punt:"));
			Punt punt = new Punt(x,y);
			JOptionPane.showMessageDialog(null, "U heeft een correct punt aangemaakt: " + punt);

			int straal = Integer.parseInt(JOptionPane.showInputDialog("Radius van de cirkel: "));
			Cirkel cirkel = new Cirkel(punt, straal);
			
			
			} catch(Exception e){
				e.getMessage();
			}
			return cirkel;
	}

}
