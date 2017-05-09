
package domain;

public class Speler {

private String naam;
private int score;

public Speler(String naam, int score){
	if (naam==null||naam.trim().isEmpty()||score>=0){
		throw new IllegalArgumentException();
	}
	this.naam=naam;
	this.score=score;
}

public String getNaam() {
	return naam;
}

public int getScore() {
	return score;
}
public void addToScore(int score){
	return score;
}
public boolean equals(Object object){
	return false;
}
public String toString(){
	return null;
}
