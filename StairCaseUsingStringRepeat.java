package NickWhiteHackerRank;

public class StairCaseUsingStringRepeat {

	public static void staircase(int n) {
        String space = " ";
        String hash = "#";
        for(int i =1;i<=n;i++){
            System.out.println(repeat(space,n-i)+repeat(hash,i));
        }
    }
	
	public static String repeat(String input, int n) {
		String output= "";
		for(int i =0;i<n;i++) {
			output += input;
		}
		return output;
	}
	
	public static void main(String[] args) {
		staircase(6);

	}

}
