package ui;

import javax.swing.JOptionPane;

import domain.Cirkel;
import domain.LijnStuk;
import domain.Punt;
import domain.Rechthoek;
import domain.Speler;
import domain.Tekening;
import domain.Driehoek;

public class PictionaryUI {
	private Speler s;
	private Tekening tekening;
	
	
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
			Object [] shapes = {"Cirkel", "Rechthoek","Punt", "Lijnstuk", "Driehoek", "Afsluiten"};
			String keuze = (String)JOptionPane.showInputDialog(null, "Wat wilt u tekenen?", "input"
					, JOptionPane.INFORMATION_MESSAGE, null, shapes, null);
			switch(keuze){
			case "Afsluiten":
				aan = false;
				break;
			case "Cirkel":
				Cirkel c = maakCirkel();
				JOptionPane.showMessageDialog(null, "U heeft een correcte cirkel aangemaakt: "+ c.toString());
				break;
			case "Rechthoek":
				Rechthoek r = maakRechthoek();
				JOptionPane.showMessageDialog(null, "U heeft een correcte rechthoek aangemaakt: " + r.toString());
				break;
			case "Punt":
				Punt p = maakPunt();
				JOptionPane.showMessageDialog(null, "U heeft een correct punt aangemaakt: " + p.toString());
				break;
			case "Lijnstuk":
				LijnStuk l = maakLijnstuk();
				JOptionPane.showMessageDialog(null, "U heeft een correct lijnstuk aangemaakt: " + l.toString());
				break;
			case "Driehoek":
				Driehoek d = maakDriehoek();
				JOptionPane.showMessageDialog(null, "U heeft een correcte driehoek aangemaakt: " + d.toString());
				break;
			}
		}
	}
			private Driehoek maakDriehoek() {
				Driehoek d = new Driehoek();
				try{
					int x = Integer.parseInt(JOptionPane.showInputDialog("x-coördinaat van het eerste hoekpunt:"));
					int y = Integer.parseInt(JOptionPane.showInputDialog("y-coördinaat van het eerste hoekpunt:"));
					Punt hoekpunt1 = new Punt(x,y);
					
					int xco = Integer.parseInt(JOptionPane.showInputDialog("x-coördinaat van het tweede hoekpunt:"));
					int yco = Integer.parseInt(JOptionPane.showInputDialog("y-coördinaat van het tweede hoekpunt:"));
					Punt hoekpunt2 = new Punt(xco,yco);
					
					int xcoo = Integer.parseInt(JOptionPane.showInputDialog("x-coördinaat van het derde hoekpunt:"));
					int ycoo = Integer.parseInt(JOptionPane.showInputDialog("y-coördinaat van het derde hoekpunt:"));
					Punt hoekpunt3 = new Punt(xcoo,ycoo);
					
					Driehoek driehoek = new Driehoek(hoekpunt1, hoekpunt2, hoekpunt3);
					d = driehoek;
				} catch(Exception e){
					e.getMessage();
				}
				return d;
	}
			private LijnStuk maakLijnstuk() {
				LijnStuk l = new LijnStuk();
				try{
					int x = Integer.parseInt(JOptionPane.showInputDialog("x-coördinaat van het startpunt:"));
					int y = Integer.parseInt(JOptionPane.showInputDialog("y-coördinaat van het startpunt:"));
					Punt startpunt = new Punt(x,y);
					
					int xco = Integer.parseInt(JOptionPane.showInputDialog("x-coördinaat van het eindpunt:"));
					int yco = Integer.parseInt(JOptionPane.showInputDialog("y-coördinaat van het eindpunt:"));
					Punt eindpunt = new Punt(xco,yco);
					LijnStuk lijnstuk = new LijnStuk(startpunt, eindpunt);
					l = lijnstuk;
				} catch(Exception e ){
					e.getMessage();
				}
				return l;
	}
			protected Punt maakPunt() {
				Punt p = new Punt();
				try{
				int x = Integer.parseInt(JOptionPane.showInputDialog("x-coördinaat van het punt:"));
				int y = Integer.parseInt(JOptionPane.showInputDialog("y-coördinaat van het punt:"));
				Punt punt = new Punt(x,y);
				p = punt;
				} catch (Exception e){
					e.getMessage();
				}
				return p;
	}
			protected Rechthoek maakRechthoek(){
				Rechthoek r = new Rechthoek();
				try{
					int xco = Integer.parseInt(JOptionPane.showInputDialog("x-coördinaat van de linkerbovenhoek:"));
					int yco = Integer.parseInt(JOptionPane.showInputDialog("y-coördinaat van de linkerbovenhoek:"));
					
					Punt linkerbovenhoek = new Punt(xco,yco);		
					int breedte = Integer.parseInt(JOptionPane.showInputDialog("Breedte van de rechthoek: "));
					int hoogte = Integer.parseInt(JOptionPane.showInputDialog("Hoogte van de rechthoek: "));
					Rechthoek rechthoek = new Rechthoek(linkerbovenhoek, breedte, hoogte);
					r = rechthoek;
					
					} catch(Exception e){
					e.getMessage();
				}
				return r;
				
		}
		
		protected Cirkel maakCirkel() {
			Cirkel c = new Cirkel();
		try{
			int x = Integer.parseInt(JOptionPane.showInputDialog("x-coördinaat van het punt:"));
			int y = Integer.parseInt(JOptionPane.showInputDialog("y-coördinaat van het punt:"));
			Punt punt = new Punt(x,y);
			

			int straal = Integer.parseInt(JOptionPane.showInputDialog("Radius van de cirkel: "));
			Cirkel cirkel = new Cirkel(punt, straal);
			c = cirkel;
			
			} catch(Exception e){
				e.getMessage();
			} 
			return c;
		
	}
		GameMainWindow view = new GameMainWindow(s.getNaam(), tekening);
		view.setVisible(true);
		view.teken();
		

}
