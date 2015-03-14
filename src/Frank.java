import java.util.Random;


public class Frank extends Player{
	private final float SPY_EFFECT = 1f;
	private final float DARK_MAGIC = 1f;
	
	public Frank(String players_name) {
		super(players_name);
	}
	
	public void spyOpponent() {
	}
	
	public void spyDeck() {
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
		return this.playerDeck.removeAt(new Random().nextInt(this.playerDeck.size()));
	}


}
