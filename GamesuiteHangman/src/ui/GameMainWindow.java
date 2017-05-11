package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import domain.Tekening;

public class GameMainWindow extends JFrame{
	
	public GameMainWindow(){
			this.setTitle("Hangman Suite - Projectweek 2017");
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		    this.setSize(dim.width, dim.height - 40); // minus task bar
		    this.setResizable(false);  
		    
		    Tekening tekening = new Tekening("Tekening");
		    this.setLayout(new BorderLayout());
		    
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setVisible(true);
		   	     
		    
		    
		    
	}

}
