
public class CardBytes {

	public static boolean isSpecial(int rank) {
		if (rank=='2' || rank=='7' || rank==Rank.RANK_JOKA || rank=='k')
			return true;
		else
			return false;
	}

	public static int setValue(int rank) {
		switch (rank) {
		case 'A':
			return 1;
		case 'Q':
			return 2;
		case 'K':
			return 4;
		case 'J':
			return 25;
		case Rank.RANK_JOKA:
			return 50;
		case '2' :
			return 20;
		case 'T' :
			return 10;
		default:
			return Integer.parseInt(rank+"");//THIS PART NEEDS....
		}
	}

}
