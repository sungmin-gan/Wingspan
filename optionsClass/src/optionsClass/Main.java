package optionsClass;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
	public static void main(String args[]) throws FileNotFoundException{
		Scanner in = new Scanner(System.in);
		Integer cardChoice, option;
		birdClass o = new birdClass("birdListCards.txt");
		
		ArrayList<String> food = new ArrayList<String>();
		food.add("Invertabrate");
		food.add("Seed");
		food.add("Fish");
		food.add("Fruit");
		food.add("Rodent");
		
		int actionBlockCount = 8;
		String actionBlockColor = "Red";
		System.out.println("Your action block color is: " + actionBlockColor);
		System.out.println("Your action block count is: " + actionBlockCount);
		System.out.println("Your food is: " + food);
		System.out.println("You have 2 cards to play");
		
		ArrayList<birdClass> cards = o.drawCards();
		
		System.out.print("Enter a card Number to Play: ");
		cardChoice = in.nextInt();
		System.out.println();
		o.SelectCardToPlay(cardChoice);
		
		System.out.println("Which option would you play?");
		System.out.println("1 - Play a bird from your hand");
		System.out.println("2 - Gain food and Activate Forest Bird Powers");
		
		option = in.nextInt();
		if(option == 1) {
			actionBlockCount--;
			//Deplete food tokens
			String[] words = cards.get(cardChoice).getBirdFood().split("\\s+");
			for(int i = 0; i<words.length; i++) {
				if(food.contains(words[i])) {
					food.remove(words[i]);
				}
			}
			//Remove from birdList for the player
			cards.remove(cardChoice);
		}
		else if(option == 2) {
			actionBlockCount--;
			//Roll Dice and allot the dice face food to the player's food
			Random random = new Random();
			int randomInt = random.nextInt(food.size());
			food.add(food.get(randomInt));
			//TODO: Card to food bonus conversion
		}

		System.out.println("Your action block count is: " + actionBlockCount);
		System.out.println("Your food is: " + food);
		System.out.println("You have " + cards.size() + " cards to play");
		
		
		in.close();
		
	}
}
