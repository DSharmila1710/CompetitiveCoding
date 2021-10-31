package NickWhiteHackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BirthdayCandles {

	
	public static int birthdayCakeCandles(List<Integer> candles) {
        HashMap<Integer,Integer> map  = new HashMap<Integer,Integer>();
        int max = 0;
        int count = 0;
        for(int i : candles){
            max = i>max?i:max;
            if(max==i){
                if(map.containsKey(i)){
                    count = map.get(i);
                }
                map.put(i,count+1);
            }
        }
        return map.get(max);
    }
	
	public static void main(String[] args) {
		List<Integer> candles = new ArrayList<Integer>();
		candles.add(4);
		candles.add(1);
		candles.add(4);
		candles.add(3);
		candles.add(2);
		candles.add(1);
		System.out.println(birthdayCakeCandles(candles));

	}

}
