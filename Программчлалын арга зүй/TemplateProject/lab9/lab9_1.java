package lab9;
	/*
	/* 4өнгө дотроос санамсаргүй сонгоно. 

	 * ----------------
	 * 
	 * (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Quenn, King) сонгоно (Clubs,
	 * Diamonds, Hearts, Spades).
	 * тэгэж байгаад п printlene shvvdee
	 */

	import acm.program.*;
	import acm.util.*;

	public class lab9_1 extends ConsoleProgram {
	    public void run() {
	        println("This program displays a random card from the deck.");
	        println("You lucky card is " + getRandomRank() + " of "
	                + getRandomSuit() + ".");       
	    }
	    private String getRandomRank() {
	        int rank = rgen.nextInt(1, 13);
	        switch (rank) {
	            case 1: return "Ace";
	            case 2: return "2";
	            case 3: return "3";
	            case 4: return "4";
	            case 5: return "5";
	            case 6: return "6";
	            case 7: return "7";
	            case 8: return "8";
	            case 9: return "9";
	            case 10: return "10";
	            case 11: return "Jack";
	            case 12: return "Queen";
	            case 13: return "King";
	            default: return null;
	        }
	    }

	    private String getRandomSuit() {
	        int suit = rgen.nextInt(0, 3);
	        switch (suit) {
	            case 0: return "Clubs";
	            case 1: return "Diamonds";
	            case 2: return "Hearts";
	            case 3: return "Spades";
	            default: return null;
	        }
	    }
	    private RandomGenerator rgen = new RandomGenerator();
	}
