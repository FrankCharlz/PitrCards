import java.util.ArrayList;
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

	public void shuffle() {
		int urefu = this.deck.size();
		int ri;
		Card removedCard;
		for (int x = 0; x < urefu; x++) {
			ri = rn.nextInt(urefu);
			removedCard = this.deck.remove(ri);
			this.deck.add(removedCard);
		}
		//this loop keep removing cards at random positions and
		//add them to the end of the list...
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
			this.deck.add(new Jockey(Suit.JOKA_BLACK, Rank.JOKA));
			this.deck.add(new Jockey(Suit.JOKA_RED, Rank.JOKA));
			this.itHasJockeys = !this.itHasJockeys;
		}
	}

	public int size() {
		return this.deck.size();
	}

	public void prioritize() {

	}


	public void panga() {
		int urefu = this.size();
		Card tempRemoved;
		for (int x = 0; x < urefu-1; x++) {
			for (int y = 0; y < urefu - x -1; y++) {
				int vy = this.deck.get(y).getValue();
				int vy1 = this.deck.get(y+1).getValue();
				if ( vy > vy1) 
				{
					tempRemoved = this.deck.remove(y);
					this.deck.add(y+1, tempRemoved);
				}
				else if ( vy==vy1 && this.deck.get(y).getRank() != this.deck.get(y+1).getRank())
				{
					//value zinafanana ila ranks hazifanana eg: 4 and K...
					if ( this.deck.get(y).getRank() > this.deck.get(y+1).getRank()) 
					{
						System.out.println("Lucky swaping maua...");
						tempRemoved = this.deck.remove(y);
						this.deck.add(y+1, tempRemoved);
					}

				}
			}
		}


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
	
	public ArrayList<Integer> doMeHaveRank(char rank){
		ArrayList<Integer> results = new ArrayList<Integer>();
		int index = -1;
		
		for (Card c : this.deck) {
			index++;
			if (c.getRank() == rank) {
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
