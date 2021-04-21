package cards.tests;

import cards.domain.PlayingCards;
import cards.domain.Suit;

public class TestPlayingCards {
	public static void main(String args[]) {
		PlayingCards card1 = new PlayingCards(Suit.SPADES,2);
		System.out.println("card1 is the "+card1.getRank()+" of "+card1.getSuit().getName());
		PlayingCards card2 = new PlayingCards(Suit.CLUBS,1);
		System.out.println("card2 is the "+card2.getRank()+" of "+card2.getSuit().getName());
		
	}

}
