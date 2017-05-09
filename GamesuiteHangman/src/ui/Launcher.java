package ui;

import javax.swing.JOptionPane;

import domain.Cirkel;
import domain.Punt;
import domain.Rechthoek;
import domain.Speler;

public class Launcher {

	public static void main(String[] args) {
		String naam = JOptionPane.showInputDialog("Welkom! \nHoe heet je?");
		
		Speler speler = new Speler(naam);

		JOptionPane.showMessageDialog(null, "... zal binnekort spelen", speler.getNaam(), JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "... heeft als score: " + speler.getScore());
		
		//aanpassingen van Rechthoek, vraagt aan speler of die rechthoek of cirkel wil aanmaken
		Object [] shapes = {"Cirkel", "Rechthoek"};
				Object keuze = JOptionPane.showInputDialog(null, "Wat wilt u tekenen?", "input"
						, JOptionPane.INFORMATION_MESSAGE, null, shapes, null);
		//maakt linkerbovenhoek en rechthoek aan
		int xco = Integer.parseInt(JOptionPane.showInputDialog("x-coördinaat van de linkerbovenhoek:"));
		int yco = Integer.parseInt(JOptionPane.showInputDialog("y-coördinaat van de linkerbovenhoek:"));
		Punt linkerbovenhoek = new Punt(xco,yco);		
		int breedte = Integer.parseInt(JOptionPane.showInputDialog("Breedte van de rechthoek: "));
		int hoogte = Integer.parseInt(JOptionPane.showInputDialog("Hoogte van de rechthoek: "));
		Rechthoek rechthoek = new Rechthoek(linkerbovenhoek, breedte, hoogte);
		JOptionPane.showMessageDialog(null, "U heeft een correcte rechthoek aangemaakt: " + rechthoek);
		
		//aanpassingen punt en cirkel
		int x = Integer.parseInt(JOptionPane.showInputDialog("x-coördinaat van het punt:"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("y-coördinaat van het punt:"));
		Punt punt = new Punt(x,y);
		JOptionPane.showMessageDialog(null, "U heeft een correct punt aangemaakt: " + punt);
		
		int straal = Integer.parseInt(JOptionPane.showInputDialog("Radius van de cirkel: "));
		Cirkel cirkel = new Cirkel(punt, straal);
		JOptionPane.showMessageDialog(null, "U heeft een correcte cirkel aangemaakt: "+ cirkel);
		
		System.out.println(keuze);
	}

}
