import java.util.Random;


public class Game {

	public static Deck mainDeck;
	public static Deck auxDeck;
	private Player players[];
	private String gameType;
	private int deckType;

	public Game() {
		mainDeck = new Deck();
		auxDeck = new Deck();
	}


	public void init() {
		CardBytes.getProperCardValues(gameType);
		prepareDeck(deckType);
	}

	public void prepareDeck(int deckType) {
		for (int rank : Rank.STANDARD_RANKS){
			if (ALBASTINI_UNUSED_CARDS_CONDITION(rank))
				continue;//skipping unused cards
				for (int suit : Suit.STANDARD_SUITS) {
					mainDeck.add(new Card(suit, rank) );
				}
		}

		if (deckType == Deck.type.SUPER_DECK && gameType == Game.type.LAST_CARD) { 
			mainDeck.add(new Card(Suit.JOKA_BLACK, Rank.RANK_JOKA));
			mainDeck.add(new Card(Suit.JOKA_RED, Rank.RANK_JOKA));
		}


		mainDeck.shuffle();

	}

	private boolean ALBASTINI_UNUSED_CARDS_CONDITION(int r) {
		return (gameType == Game.type.ALBASITINI) && 
				(r==Rank.RANK_2 || r == Rank.RANK_8 || r == Rank.RANK_9 || r == Rank.RANK_10);
	}

	public void dealCards(int x) {
		//remember to check if kad zinatosha....
		if (x*this.players.length > Game.mainDeck.size()) {
			x = Game.mainDeck.size()/this.players.length;
			System.out.println("Karata ni chache siez kugawa nyinginyingi hivyo.");
			System.out.println("Kwa ushenzi wako nagawa "+x+" "+x);

		}
		for (Player p : this.players) {
			p.chukuaKibunda(Game.mainDeck.pop(x));
		}

	}

	public Deck getDeck() {
		return Game.mainDeck;
	}

	public void setPlayers(Player... playersx) {
		this.players = playersx;
	}

	public Card setMchezo() {
		return Game.mainDeck.removeAt(new Random().nextInt(Game.mainDeck.size()));
	}


	public static final class type {
		public final static String ALBASITINI = "albasitini";
		public final static String LAST_CARD = "last_card";
	}


	public void setType(String gt) {
		this.gameType = gt;	
	}

	public void setDeckType(int dt) {
		this.deckType = dt;
	}



}
