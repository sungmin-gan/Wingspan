package model;

import java.util.ArrayList;

public class Player {
	String name;
	int invertebrateTokens, seedTokens, fishTokens, fruitTokens, rodentTokens;
	ArrayList<BirdCard> birdCards = new ArrayList<BirdCard>();
	ArrayList<BonusCard> bonusCards = new ArrayList<BonusCard>();
	
	Player(String _name){
		name = _name;
	}
	
	public void addFoodToken(FoodType _foodType) {
		switch(_foodType) {
		case invertebrate:
			invertebrateTokens += 1;
			break;
		case seed:
			seedTokens += 1;
			break;
		case fish:
			fishTokens += 1;
			break;
		case fruit:
			fruitTokens += 1;
			break;
		case rodent:
			rodentTokens += 1;
			break;
		}
	}
	
	public void spendFoodToken(FoodType _foodType) {
		switch(_foodType) {
		case invertebrate:
			invertebrateTokens -= 1;
			break;
		case seed:
			seedTokens -= 1;
			break;
		case fish:
			fishTokens -= 1;
			break;
		case fruit:
			fruitTokens -= 1;
			break;
		case rodent:
			rodentTokens -= 1;
			break;
		}
	}
	
	public void addBonusCard(BonusCard _bonusCard) { bonusCards.add(_bonusCard); }
	public void removeBonusCard(int index) { bonusCards.remove(index); }
	public BonusCard getBonusCard(int index) { return bonusCards.get(index); }
}
