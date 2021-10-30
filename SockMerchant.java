package NickWhiteHackerRank;

import java.util.Collection;
import java.util.HashMap;

public class SockMerchant {
	
	private static int noOfSockPairs(int[] ar) {
		int pairs =0;
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int i : ar) {
			int count=0;
			if(map.containsKey(i)) {
				count = map.get(i);
			}
			map.put(i, count+1);
		}
		Collection<Integer> grouped =map.values();
		for(int i:grouped) {
			pairs += (i/2);
		}
		return pairs;
	}

	public static void main(String[] args) {
		System.out.println(noOfSockPairs(new int[] {1,2,1,2,1,3,2}));
	}

}
