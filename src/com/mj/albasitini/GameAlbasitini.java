package com.mj.albasitini;

import com.mj.prime.Card;
import com.mj.prime.Game;

public class GameAlbasitini extends Game {
	
	private Card alalaye;

	public Card setAlalaye() {
		alalaye = mainDeck.pop();
		return alalaye;
	}
	
	public Card getAlalaye() {
		return alalaye;
	}

}
