package domain;

public class HintLetter {
	private char letter;
	private boolean isGeraden;
	
	public HintLetter(char letter) {
		setLetter(letter);
	}

	public char getLetter() {
		return letter;
	}

	private void setLetter(char letter) {
		this.letter = letter;
	}
	
	protected void setIsGeraden(boolean isGeraden){
		this.isGeraden = isGeraden;
	}
	
	public boolean isGeraden(){
		return this.isGeraden;
	}
	
	public boolean raad(char letter){
		if((Character.toUpperCase(this.letter) == letter)||(Character.toLowerCase(this.letter) == letter)){
			if(isGeraden) return false;
			this.isGeraden = true;
			return true;
		}
		return false;
	}
	
	public char toChar(){
		String string = "_";
		char ch = string.charAt(0);
		if(isGeraden){
			return this.letter;
		}else{
			return ch;
		}
	}
}
