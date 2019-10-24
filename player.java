package wingspan;

import java.util.ArrayList;

public class player {
	private String Name;
	private ArrayList<birdClass> birds;
	
	public player() {}; 
	
	public player(String name) {
		Name = name;
	}
	
	public String getName() {
		return Name;
	}
	
	public void addBirdCard(birdClass _bird) {
		birds.add(_bird);
	}
	
	public String getBirdNameByIndex(int _index) {
		return birds.get(_index).birdName;
	}
	
	public int numOfBirdCards() {
		return birds.size();
	}
	
	
	
}