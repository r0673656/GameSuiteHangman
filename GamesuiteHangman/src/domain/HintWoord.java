package domain;

import java.util.ArrayList;

public class HintWoord {
	private String woord;
	private ArrayList<HintLetter> hint = new ArrayList<HintLetter>();
	public HintWoord(String woord) {
		setWoord(woord);
		setHint(woord);
	}

	public String getWoord() {
		return woord;
	}

	private void setWoord(String woord) {
		if(woord == null || woord.trim().isEmpty()){
			throw new DomainException("woord is null!");
		}
		this.woord = woord;
	}
	
	private void setHint(String woord){
		for (int i = 0; i < woord.length(); i ++){
			hint.add(new HintLetter(woord.charAt(i)));
		}
	}
	
	public String toString(){
		String result ="";
		for(int i = 0; i < woord.length(); i++){
			result += this.hint.get(i).toChar();
			if(i < woord.length()-1){
				result += " ";
			}
		}
		return result;
	}
	
	public boolean isGeraden(){
		boolean result = true;
		for(int i = 0; i < woord.length(); i++){
			if(this.hint.get(i).isGeraden() == false){
				result = false;
			}
		}
		return result;
	}
	
	public boolean raad(char letter){
		boolean result = false;
		for(int i = 0; i < woord.length(); i ++){
			if(Character.toLowerCase(this.hint.get(i).getLetter()) == letter || Character.toUpperCase(this.hint.get(i).getLetter()) == letter){
				if(this.hint.get(i).isGeraden()) return false;
				result = true;
				this.hint.get(i).setIsGeraden(true);
			}
		}
		return result;
	}
}
