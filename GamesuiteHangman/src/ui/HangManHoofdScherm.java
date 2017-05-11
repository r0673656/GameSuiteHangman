package ui;

import java.awt.BorderLayout;

import domain.HangMan;

public class HangManHoofdScherm extends GameHoofdScherm {

	private static final long serialVersionUID = 1L;
	
	public HangManHoofdScherm(HangManUI spel, HangmanPaneel spelpaneel){
		super("Hangman - "+spel.getSpeler().getNaam(), spel.getTekening());	
		
		spelpaneel.setTekenVenster(getTekenVenster());
		this.add(spelpaneel, BorderLayout.SOUTH);
	}
	
	public void start() {
		this.pack();
		this.setVisible(true);		
	}
}