import java.util.Scanner;



public class AnziaHapa {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		long st = System.currentTimeMillis();
		Game g = new Game();
		g.setType(Game.type.ALBASITINI);
		g.setDeckType(Deck.type.SUPER_DECK);
		g.init();

		Player m = new Player("KIKWETE");
		FrankAI f = new FrankAI();
		

		g.setPlayers(m,f);
		g.dealCards(4);
		
		Card alalaye = g.mainDeck.pop();
		alalaye.showOff();
		
		
		
		
		


		System.out.println("Time : "+(System.currentTimeMillis()-st)); 


	}

	private static Card mePlay(Card mchezo, Player m, Player n) {

		System.out.println("*-------------------ZAKE---------------------*");
		m.playerDeck.showOff();

		System.out.println("*-------------------ZANGU---------------------*");
		n.playerDeck.showOff();

		int p = scn.nextInt();

		if (p!=99)
			return n.playerDeck.removeAt(p);
		else 
			return null;


	}






}







