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
	
	 void setBirdPower(String bt, String c, String act) {
			
		 if(bt == "skull") {
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
		
		birdPower = cardColor + " " + " " + birdType + act;
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
	void initializeBirdList() throws FileNotFoundException {
		//birdClass newCard = new birdClass();
		String temp;
		String color;
		String act;
		File birdFile = new File("birdListCards.txt");
		Scanner readFile = new Scanner(birdFile);
		
		while(readFile.hasNext()) {
			birdClass newCard = new birdClass();
			
			temp = readFile.nextLine();
			newCard.setBirdName(temp);
			temp = readFile.nextLine();
			newCard.setBirdHabitat(temp);
			temp = readFile.nextLine();
			newCard.setBirdFood(temp);
			temp = readFile.nextLine();
			newCard.setBirdPoints(Integer.parseInt(temp));
			temp = readFile.nextLine();
			newCard.setBirdNest(temp);
			temp = readFile.nextLine();
			newCard.setBirdEgg(Integer.parseInt(temp));
			temp = readFile.nextLine();
			color = readFile.nextLine();
			act = readFile.nextLine();
			newCard.setBirdPower(temp, color, act);
			cardList.add(newCard);
			if(readFile.nextLine() == " ") {
				continue;
			}
			
		}
		//readFile.close();
		birdClass getCard = new birdClass();
		getCard = cardList.get(1);
		System.out.print(getCard.getBirdPower());
		
	}
}
