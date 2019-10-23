package optionsClass;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class birdClass {
	 
	 ArrayList<birdClass> cardList = new ArrayList<birdClass>();
	 Integer birdPoints;
	 String birdName;
	 String birdHabitat;
	 String birdFood;
	 String birdNestType;
	 Integer birdEggLimit;
	 String cardColor;
	 String birdType;
	 String birdPower;
	 Integer birdCardCount = 0;
	 File textFile;
	 Scanner input;
	 String cards;
	 
	 public birdClass(String file) throws FileNotFoundException {
		 textFile = new File(file);
		 initializeBirdList(textFile);
		 
	 }
	 public birdClass() {
		 
	 }
	

	void setBirdPower(String bt, String c, String act) {
	if(bt == "Skull") {
		birdType = "Predator";
	}else{
		birdType = "Bird Tucking:";
	}
		 
		 
	if(c == "Brown") {
		cardColor = "When Activated";
	}else if(c == "Pink") {
		cardColor = "Once Beetween Turns";
	}else {
		cardColor = "When Played:";
	}
		
	birdPower = cardColor + " " + " " + birdType + " " + act;
	 }  

	 void setBirdPoints(Integer p) {
		 birdPoints = p;
	 }
	 void setBirdName(String n) {
		 birdName = n;
	 }
	 void setBirdHabitat(String h) {
		 birdHabitat = h;
	 }
	 void setBirdFood(String f) {
		 birdFood = f;
	 }
	 void setBirdNest(String bn) {
		 birdNestType = bn;
	 }
	 void setBirdEgg(Integer eg) {
		 birdEggLimit = eg;
	 }
	 
	 Integer getBirdPoints() {
		 return birdPoints;
	 }
	 String getBirdName() {
		 return birdName;
	 }
	 String getBirdHabitat() {
		 return birdHabitat;
	 }
	 String getBirdFood() {
		 return birdFood;
	 }
	 String getBirdNest() {
		 return birdNestType;
	 }
	 Integer getBirdEggLimit() {
		 return birdEggLimit;
	 }
	 String getBirdPower() {
		 return birdPower;
	 }
	void initializeBirdList(File textfile) throws FileNotFoundException {
		try {
			input = new Scanner(textFile);
			String temp;
			String color;
			String activity;
			
			while(input.hasNext()) {
				birdClass newCard = new birdClass();
				temp = input.nextLine();
				newCard.setBirdName(temp);
				temp = input.nextLine();
				newCard.setBirdHabitat(temp);
				temp = input.nextLine();
				newCard.setBirdFood(temp);
				temp = input.nextLine();
				newCard.setBirdPoints(Integer.parseInt(temp));
				temp = input.nextLine();
				newCard.setBirdNest(temp);
				temp = input.nextLine();
				newCard.setBirdEgg(Integer.parseInt(temp));
				temp = input.nextLine();
				color = input.nextLine();
				activity = input.nextLine();
				newCard.setBirdPower(temp, color, activity);
				cardList.add(newCard);
				birdCardCount ++;
				if(input.nextLine() == " ") {
					continue;
				}
				
			}
			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void drawCards() {
		
		birdClass getCard = new birdClass();
		
		for(int a=0; a < cardList.size(); a++) {
			getCard = cardList.get(a);
			System.out.println("Card Name: " + getCard.getBirdName());
			System.out.println("Habitat: " + getCard.getBirdHabitat());
			System.out.println("Food: " + getCard.getBirdFood());
			System.out.println("Points: " + getCard.getBirdPoints());
			System.out.println("Nest: "+ getCard.getBirdNest());
			System.out.println("Egg Limit: " + getCard.getBirdEggLimit());
			System.out.println("Ability: "+ getCard.getBirdPower());
			System.out.println();
		}
		System.out.println("Cards in ArrayList: " + birdCardCount);
	}
	
}
