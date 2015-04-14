package com.mj.prime;

public class Card implements Comparable<Card> {

	private final int value;
	private final int suit;
	private final int rank;
	private final boolean special;
	
	private int priority = 0;

	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
		this.value = CardBytes.setValue(rank);
		this.special = CardBytes.isSpecial(rank);
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

	public int getPriority() {
		return priority;
	}
	
	public boolean isSpecial() {
		return special;
	}
	
	public void addPriority(int x) {
		this.priority+=x;
	}

	public void showOff() {
		M.print(getRankAsString() + " : "+getValue()+" : "+getSuitAsString());
	}

	private String getSuitAsString() {
		return CardBytes.getSuitAsString(this.suit);
	}

	private String getRankAsString() {
		return CardBytes.getRankAsString(this.rank);
	}

	private int compareValue(Card anotherCard){
		return (this.getRank() - anotherCard.getRank());//rank~value
	}
	
	private int compareSuit(Card anotherCard){
		return (this.getSuit() - anotherCard.getSuit());
	}
	
	
	@Override
	public int compareTo(Card anotherCard) {
		//if the values are equal.. then compare suits..
		if (compareValue(anotherCard) == 0)
			return compareSuit(anotherCard);
		else
			return compareValue(anotherCard);
		
	}
}