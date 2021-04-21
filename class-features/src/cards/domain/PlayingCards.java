package cards.domain;

public class PlayingCards {
	private Suit suit;
	private int rank;
	
	public PlayingCards(Suit suit, int rank) {
		this.suit=suit;
		this.rank = rank;
		
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public int getRank() {
		return rank;
	}

}
