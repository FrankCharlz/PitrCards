
public class Card {

	private final int value;
	private final int suit;
	private final int rank;
	private final boolean special;

	public Card(int suit, int rankJoka) {
		this.suit = rankJoka;
		this.rank = rankJoka;
		this.value = CardBytes.setValue(rankJoka);
		this.special = CardBytes.isSpecial(rankJoka);
	}

	public int getValue() {
		return value;
	}

	public int getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}


	public void showOff() {
		String suit_;
		switch (this.getSuit()) {
		case Suit.JEMBE: 
			suit_ = "JEMBE";
			break;

		case Suit.KARANGA: 
			suit_ = "KARANGA";
			break;

		case Suit.KISU: 
			suit_ = "KISU";
			break;

		case Suit.KOPA: 
			suit_ = "KOPA";
			break;
			
		case Suit.JOKA_BLACK: 
			suit_ = "BLACK_JOKA";
			break;
			
		case Suit.JOKA_RED: 
			suit_ = "RED_JOKA";
			break;
			
		default:
			suit_ = "defect somewhere";
			break;
		}
		System.out.println(this.getRank() +" : "+ suit_ + " : "+this.getValue());
	}
}