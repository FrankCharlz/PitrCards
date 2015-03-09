import java.util.Random;


public class Player {

	public Deck playerDeck;
	public final String NAME;
	private Random rn = new Random();

	public Player(String players_name) {
		this.NAME = players_name;
		playerDeck = new Deck();
	}

	public void chukuaKibunda(Deck kibunda) {
		this.playerDeck.addKibunda(kibunda);
	}

	public Card play(Card mchezo) {
		
		if (mchezo == null) {
			return chezaKarataYoyote();
		} else {
			return chezaKarataKama(mchezo);
		}

	}

	private Card chezaKarataKama(Card mchezo) {
		int ua = this.playerDeck.containsUa(mchezo);
		int namba = this.playerDeck.containsNamba(mchezo);//should be removed for speed put into failure of ua

		if ( ua != -1) {
			return this.playerDeck.removeAt(ua);
		} else if (namba != -1) {
			return this.playerDeck.removeAt(namba);
		} else {
			return ramba(1);
		}
	}

	private Card ramba(int x) {
		 Game.mainDeck.pop(x);
		 return null;//karamba so he plays nothing....returns null
	}

	private Card chezaKarataYoyote() {
		return this.playerDeck.removeAt(rn.nextInt(this.playerDeck.size()));
	}



}
