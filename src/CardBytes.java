
public class CardBytes {

	public static boolean isSpecial(int rank) {
		if (rank==Rank.RANK_2 || rank==Rank.RANK_7 || rank==Rank.RANK_JOKA || rank=='k')
			return true;
		else
			return false;
	}

	public static int setValue(int rank) {
		switch (rank) {
		case Rank.RANK_A:return 1;
		case Rank.RANK_K:return 4;
		case Rank.RANK_Q:return 2;
		case Rank.RANK_J:return 25;
		case Rank.RANK_JOKA:return 50;
		case Rank.RANK_2:return 20;

		case Rank.RANK_3:return 3;
		case Rank.RANK_4:return 4;
		case Rank.RANK_5:return 5;
		case Rank.RANK_6:return 6;
		case Rank.RANK_7:return 7;
		case Rank.RANK_8:return 8;
		case Rank.RANK_9:return 9;
		case Rank.RANK_10:return 10;

		default:
			return -99;
		}
	}

	public static String getSuitAsString(int suit) {
		switch (suit) {
		case Suit.JEMBE: return "JEMBE";
		case Suit.KOPA: return "KOPA";
		case Suit.KISU: return "KISU";
		case Suit.KARANGA: return "KARANGA";

		case Suit.JOKA_BLACK: return "BLACK_JOKA";
		case Suit.JOKA_RED: return "RED_JOKA";

		default: return "COULD NOT GET SUIT";
		}
	}

	public static String getRankAsString(int rank) {
		switch (rank) {
		case Rank.RANK_A:return "A";
		case Rank.RANK_K:return "K";
		case Rank.RANK_Q:return "Q";
		case Rank.RANK_J:return "J";
		case Rank.RANK_JOKA:return "JOKA";
		case Rank.RANK_2:return "2";

		case Rank.RANK_3:return 3+"";
		case Rank.RANK_4:return 4+"";
		case Rank.RANK_5:return 5+"";
		case Rank.RANK_6:return 6+"";
		case Rank.RANK_7:return 7+"";
		case Rank.RANK_8:return 8+"";
		case Rank.RANK_9:return 9+"";
		case Rank.RANK_10:return 10+"";

		default: return "COULD NOT GET RANK";
		}
	}

}
