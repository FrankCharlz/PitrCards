package com.mj.prime;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class CardBytes {
	
	public static int[] values;

	public static boolean isSpecial(int rank) {
		if (rank==Rank.RANK_2 || rank==Rank.RANK_7 || rank==Rank.RANK_JOKA || rank=='k')
			return true;
		else
			return false;
	}

	public static void  getProperCardValues(String gameType) {
		values = new int[14];
		int x = 0;
		try {
			FileReader fr = new FileReader(new File("data/values.json"));
			JSONObject obj = (JSONObject) new JSONParser().parse(fr);
			JSONArray values_array = (JSONArray) obj.get(""+gameType);
			while (x < values_array.size()) {
				values[x] = Integer.valueOf(values_array.get(x).toString());
				x++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}



	public static int setValue(int rank) {
		switch (rank) {
		case Rank.RANK_A:return values[0];
		case Rank.RANK_2:return values[1];
		case Rank.RANK_3:return values[2];
		case Rank.RANK_4:return values[3];
		case Rank.RANK_5:return values[4];
		case Rank.RANK_6:return values[5];
		case Rank.RANK_7:return values[6];
		case Rank.RANK_8:return values[7];
		case Rank.RANK_9:return values[8];
		case Rank.RANK_10:return values[9];
		case Rank.RANK_K:return values[10];
		case Rank.RANK_J:return values[11];
		case Rank.RANK_Q:return values[12];
		case Rank.RANK_JOKA:return values[13];
		

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
