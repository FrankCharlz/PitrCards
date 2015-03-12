
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

}
