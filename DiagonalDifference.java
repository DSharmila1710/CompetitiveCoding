package NickWhiteHackerRank;

import java.util.*;

public class DiagonalDifference {

	private static int diagonalDiff(List<List<Integer>> arr) {
		int row = arr.size();
		int column = arr.get(0).size();	
		
		int left = 0;
		int top = 0;
		int right = column-1;
		int bottom = row-1;
		
		
		int left_diagonal_sum = 0;
		int right_diagonal_sum = 0;
		while(left<=right && top<=bottom) {
			left_diagonal_sum += arr.get(left).get(top);
			right_diagonal_sum += arr.get(right-left).get(top);
			left++;
			top++;
		}

		
		return Math.abs(right_diagonal_sum-left_diagonal_sum);
	}
	
	public static void main(String[] args) {
		List<List<Integer>> arr = Arrays.asList(Arrays.asList(1,2,2),Arrays.asList(4,1,6),Arrays.asList(2,8,1));
		System.out.println(diagonalDiff(arr));

	}

}
