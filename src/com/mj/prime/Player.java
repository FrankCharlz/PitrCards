package com.mj.prime;


public class Player {

	public Deck hand;
	public final String NAME;

	public Player(String players_name) {
		this.NAME = players_name;
		this.hand = new Deck();
	}

	public void chukuaKibunda(Deck kibunda) {
		hand.addKibunda(kibunda);
		hand.sort();
	}
	
	public void showOff() {
		M.print("\n"+NAME+"'S CARDS");
		M.print("-----------------------");
		hand.showOff();
	}


}
