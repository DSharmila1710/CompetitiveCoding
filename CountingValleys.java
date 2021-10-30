package NickWhiteHackerRank;

public class CountingValleys {

	private static int countOfValley(String input) {
		char[] ch = input.toCharArray();
		int steps =0;
		int count=0;
		for(char c:ch) {
			steps = (c=='D')?steps-1:steps+1;
			if(steps==0  && c=='U') {
				count++;
			}
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		System.out.println(countOfValley("UDDDUDUU"));

	}

}
