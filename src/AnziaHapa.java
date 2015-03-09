import java.util.ArrayList;
import java.util.Scanner;


public class AnziaHapa {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		long st = System.currentTimeMillis();
		Game g = new Game();

		Player m = new Player("FRANK");
		Player n = new Player("NDESI");

		g.setPlayers(m,n);
		g.prepareDeck(Deck.SUPER_DECK);
		g.dealCards(20);

		//Card mchezo = g.setMchezo();
		//System.out.print("mchezo ni : "); mchezo.showOff();
		//g.getDeck().showOff();
		//ArrayList<Integer> a = g.getDeck().doMeHaveUa(Suit.JEMBE);
		
	
		//System.out.println(a+"\n"+b);

		/*
		while(true) {
			Card temp = mchezo;
			mchezo = m.play(mchezo);
			if (mchezo != null) {
				mchezo.showOff();
				mePlay(mchezo,m,n);
			} else {
				System.out.println("kalamba"); 
				mchezo = temp;
				mchezo = mePlay(mchezo, m, n);
			}
		}*/


		System.out.println("Time : "+(System.currentTimeMillis()-st)); 


	}

	private static void testShuffle() {
		int sum = 0;
		int iterations = 1000;
		int idadi = 54;
		char suit = '2';
		for (int h=0; h<iterations; h++) {
			Game game = new Game();
			game.prepareDeck(Deck.SUPER_DECK);
			game.getDeck().removeKibundaAt(0, game.getDeck().size()-idadi);
			//game.getDeck().showOff();
			ArrayList<Integer> b = game.getDeck().doMeHaveRank(suit);
			sum +=b.size();
		}
		System.out.println("Probability is : "+(sum/(float)iterations)/(float)(idadi));
		
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






