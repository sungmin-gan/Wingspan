package optionsClass;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
	public static void main(String args[]) throws FileNotFoundException{
		Scanner in = new Scanner(System.in);
		Integer a;
		birdClass o = new birdClass("birdListCards.txt");
		
		o.drawCards();
		
		System.out.print("Enter a card Number to Play: ");
		a = in.nextInt();
		System.out.println();
		o.SelectCardToPlay(a);
		
		
	}
}
