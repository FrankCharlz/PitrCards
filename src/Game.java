import java.util.Random;


public class Game {

	public static Deck mainDeck;
	public static Deck zaChiniDeck;
	private int numberOfPlayers;
	private Player players[];

	public Game() {
		mainDeck = new Deck();
		zaChiniDeck = new Deck();
	}

	public void prepareDeck(int deckType) {
		for (int rank : Rank.STANDARD_RANKS){
			for (int suit : Suit.STANDARD_SUITS) {
				mainDeck.add(new Card(suit, rank) );
			}

		}
		if (deckType == Deck.SUPER_DECK) { mainDeck.useJockeys(); }
		//mainDeck.shuffle(); mainDeck.shuffle();//SHUFFLE TWICE..

	}

	public void dealCards(int x) {
		//remember to check if kad zinatosha....
		if (x*this.players.length > this.mainDeck.size()) {
			x = this.mainDeck.size()/this.players.length;
			System.out.println("Karata ni chache siez kugawa nyinginyingi hivyo.");
			System.out.println("Kwa ushenzi wako nagawa "+x+" "+x);

		}
		for (Player p : this.players) {
			p.chukuaKibunda(this.mainDeck.pop(x));
		}

	}

	public Deck getDeck() {
		return this.mainDeck;
	}

	public void setPlayers(Player... playersx) {
		this.numberOfPlayers = playersx.length;
		this.players = playersx;
	}

	public Card setMchezo() {
		return this.mainDeck.removeAt(new Random().nextInt(this.mainDeck.size()));
	}

}
