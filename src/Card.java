
public class Card {

	private final int value;
	private final int suit;
	private final char rank;
	private final boolean isSpecial;

	public Card(int jembe, char rank) {
		super();
		this.suit = jembe;
		this.rank = rank;
		this.value = setValue(rank);
		this.isSpecial = setSpecial(rank);
	}

	public int getValue() {
		return value;
	}

	public int getSuit() {
		return suit;
	}

	public char getRank() {
		return rank;
	}

	private final int setValue(char rank) {

		switch (rank) {
		case 'A':
			return 1;
		case 'Q':
			return 2;
		case 'K':
			return 4;
		case 'J':
			return 25;
		case Rank.JOKA:
			return 50;
		case '2' :
			return 20;
		case 'T' :
			return 10;
		default:
			return Integer.parseInt(rank+"");//THIS PART NEEDS....
		}
	}

	private boolean setSpecial(char rank) {
		if (rank=='2' || rank=='7' || rank==Rank.JOKA || rank=='k')
			return true;
		else
			return false;
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