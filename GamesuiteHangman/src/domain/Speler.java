
package domain;

public class Speler {

private String naam;
private int score = 0;

public Speler(String naam){
	if (naam==null||naam.trim().isEmpty()||naam==""||score<0){
		throw new DomainException("");
	}
	
	this.naam=naam;
	this.score = 0;
}
public Speler(String naam, int score){
	if (naam==null||naam.trim().isEmpty()||naam==""||score<0){
		throw new DomainException("");
	}
	
	this.naam=naam;
	this.score = 0;
}

public String getNaam() {
	return naam;
}

public int getScore() {
	return score;
}
public void addToScore(int score){
	
	if((score += this.score)<0){
		throw new DomainException("");
	}
	
	this.score = score;
}
@Override
public boolean equals(Object object){
	boolean result = false;
	if(object instanceof Speler){
		Speler Jan = (Speler) object;
		
		if(this.getNaam().equals(Jan.getNaam())&&(this.getScore()==(Jan.getScore())))result = true;
	}
	
return result;
}
public String toString(){
	return null;
}
}