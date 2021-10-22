package Automation.test;

public class PairEqualsSum {

	private static void findPairs(int[] numbers, int sum) {
		for(int i =0;i<numbers.length-1;i++) {
			if(!(numbers[i]>sum)){
				int pair = sum-numbers[i];
				for(int j=i+1;j<numbers.length-1;j++) {
					if(pair==numbers[j]) {
						System.out.println(numbers[i]+", "+numbers[j]);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
		findPairs(arr,9);
	}

}
