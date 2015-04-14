
import java.util.Scanner;

import com.mj.albasitini.AlbastiniAI;
import com.mj.albasitini.GameAlbasitini;
import com.mj.prime.Card;
import com.mj.prime.Game;
import com.mj.prime.Player;



public class Start {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		long st = System.currentTimeMillis();
		GameAlbasitini g = new GameAlbasitini();
		g.setType(Game.type.ALBASITINI);
		g.init();

		Player m = new Player("KIKWETE");
		AlbastiniAI f = new AlbastiniAI("FRANK AI");


		g.setPlayers(m,f);
		g.dealCards(4);

		Card alalaye = g.setAlalaye();
		g.getAlalaye().showOff();

		while (g.mainDeck.size() > 0) {
			f.showOff();
			m.showOff();
			
			f.play();
			Scanner scn = new Scanner(System.in);
			int choice = scn.nextInt();
			M.print(choice+"");
		}







		M.print("Time : "+(System.currentTimeMillis()-st)); 


	}

	

}







