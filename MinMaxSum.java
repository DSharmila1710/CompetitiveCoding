package NickWhiteHackerRank;

import java.util.ArrayList;
import java.util.List;

public class MinMaxSum {

	 public static void miniMaxSum(List<Integer> arr) {
	        long min = Long.MAX_VALUE;
	        long max = Long.MIN_VALUE; 
	        long sum = 0;
	        for(long i:arr){
	            sum+=i;
	            min = i<min?i:min;
	            max = i>max?i:max;
	        }
	        System.out.print(sum-max);
	        System.out.print(" ");
	        System.out.print(sum-min);

	    }
	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(10844089);
		arr.add(80844089);
		arr.add(70844089);
		arr.add(90844089);
		miniMaxSum(arr);

	}

}
