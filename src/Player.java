

public class Player {

	protected Deck playerDeck;
	public final String NAME;

	public Player(String players_name) {
		this.NAME = players_name;
		playerDeck = new Deck();
	}

	public void chukuaKibunda(Deck kibunda) {
		this.playerDeck.addKibunda(kibunda);
	}

	public Kibunda spyOnMe(){
		return null;
		
	}

}
