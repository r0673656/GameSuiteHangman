package ui;

import javax.swing.JOptionPane;

import domain.Cirkel;
import domain.Punt;
import domain.Rechthoek;
import domain.Speler;

public class Launcher {

	public static void main(String[] args) {
		Speler s = new Speler(maakSpeler());
		PictionaryUI ui = new PictionaryUI(s);
		ui.toonMenu();
	}
		public static String maakSpeler(){
			String naam;
			while(true){
				naam = JOptionPane.showInputDialog("Welkom! \nHoe heet je?");
			if(naam.trim().isEmpty() || naam == null){
				JOptionPane.showMessageDialog(null, "Naam mag niet leeg zijn");
				continue;
			}
			break;
			}
			return naam;
		}
	}
