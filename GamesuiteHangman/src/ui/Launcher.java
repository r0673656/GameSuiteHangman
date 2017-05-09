package ui;

import javax.swing.JOptionPane;

import domain.Punt;
import domain.Speler;

public class Launcher {

	public static void main(String[] args) {
		String naam = JOptionPane.showInputDialog("Welkom! \nHoe heet je?");
		Speler speler = new Speler(naam);
		JOptionPane.showMessageDialog(null, "... zal binnekort spelen", speler.getNaam(), JOptionPane.INFORMATION_MESSAGE);
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("x-coördinaat van het punt:"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("y-coördinaat van het punt:"));
		Punt punt = new Punt(x,y);
		JOptionPane.showMessageDialog(null, "Het nieuwe punt is " + punt);
		
		
		
	}

}
