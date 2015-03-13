import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Deck {

	private ArrayList<Card> deck;
	private Random rn = new Random();
	private boolean itHasJockeys = false;
	public final static int NORMAL_DECK = 0;
	public final static int SUPER_DECK = 1;

	public Deck() {
		this.deck = new ArrayList<Card>();
	}

	public void add(Card card) {
		this.deck.add(card);
	}

	public void addKibunda(Deck kibunda) {
		for (Card x : kibunda.getCards()) {
			this.deck.add(x);
		}
	}

	public Deck pop(int n) {
		Deck rDeck = new Deck();
		for (int i = 0; i < n; i++) {
			rDeck.add(this.pop());
		}
		return rDeck;
	}

	public Card  pop() {
		int last_index = this.deck.size() - 1;
		return this.deck.remove(last_index);	
	}

	public Card  removeAt(int x) {
		return this.deck.remove(x);	
	}

	public Deck  removeKibundaAt(int startPos, int idadi) {
		Deck rDeck = new Deck();
		for (int i = 0; i < idadi; i++) {
			rDeck.add(this.removeAt(startPos));
		}
		return rDeck;
	}

	public void shuffle() {
		Collections.shuffle(this.deck);
	}

	public ArrayList<Card> getCards() {
		return this.deck;
	}

	public void showOff() {
		for (Card card : this.deck) {
			card.showOff();
		}
		System.out.println("There are "+this.deck.size()+" cards.");
		System.out.println("-----------------------------------------------");
	}

	public boolean hasJockeys() {
		return itHasJockeys;
	}

	public void useJockeys() {
		if (!this.itHasJockeys) {
			this.deck.add(new Card(Suit.JOKA_BLACK, Rank.RANK_JOKA));
			this.deck.add(new Card(Suit.JOKA_RED, Rank.RANK_JOKA));
			this.itHasJockeys = !this.itHasJockeys;
		}
	}

	public int size() {
		return this.deck.size();
	}


	public void sort() {
		Collections.sort(this.deck);
	}
	
	public int containsUa(Card x){
		int index = 0;
		for (Card c : this.deck) {
			if (c.getSuit() == x.getSuit()) {return index;}
			index++;
		}
		return -1;
	}

	public int containsNamba(Card x){
		int index = 0;
		for (Card c : this.deck) {
			if (c.getRank() == x.getRank()) {return index;}
			index++;
		}
		return -1;
	}

	public ArrayList<Integer> doMeHaveUa(int suit){
		ArrayList<Integer> results = new ArrayList<Integer>();
		int index = -1;

		for (Card c : this.deck) {
			index++;
			if (c.getSuit() == suit) {
				results.add(index);
			}
		}
		return results;
	}

	public ArrayList<Integer> doMeHaveRank(int suit){
		ArrayList<Integer> results = new ArrayList<Integer>();
		int index = -1;

		for (Card c : this.deck) {
			index++;
			if (c.getRank() == suit) {
				results.add(index);
			}
		}
		return results;
	}




}
/*************************
 * 
 * Deck is a collection of Cards....
 * pop returns the removed Card
 * pop(x) returns a Deck of x Cards
 * 
 * 
 * 
 */
