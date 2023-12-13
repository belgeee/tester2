package lab9;

/*
 * 
 */
import acm.program.*;
import acm.util.*;
public class lab9_test extends ConsoleProgram {
	public void run(){
		
		for(int i = 0; i < 10; i++){
			int cardRank = rgen.nextInt(1, 13);
			int cardSuit = rgen.nextInt(1, 4);
			Card someCard = new Card(cardRank, cardSuit);
			println(someCard);
		}
		
	}
	
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
