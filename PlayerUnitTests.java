package wingspan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerUnitTests {

	player testPlayer = new player("test");
	
	@Test
	void NameIsSet() {
		assertEquals("test",testPlayer.getName());
	}
	
	void BirdCardsSet() {
		birdClass owl = new birdClass();
		owl.birdName = "owl";
		birdClass hummingbird = new birdClass();
		owl.birdName = "hummingbird";
		birdClass falcon = new birdClass();
		owl.birdName = "falcon";
		
		testPlayer.addBirdCard(owl);
		testPlayer.addBirdCard(hummingbird);
		testPlayer.addBirdCard(falcon);
		
		assertEquals("owl",testPlayer.getBirdNameByIndex(0));
		assertEquals("hummingbird",testPlayer.getBirdNameByIndex(1));
		assertEquals("falcon",testPlayer.getBirdNameByIndex(2));
	}

}
