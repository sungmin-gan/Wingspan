package optionsClass;

import java.io.FileNotFoundException;

public class Main {
	public static void main(String args[]) throws FileNotFoundException{
		
		birdClass o = new birdClass("birdListCards.txt");
		
		o.drawCards();
		
		
		
		
	}
}
