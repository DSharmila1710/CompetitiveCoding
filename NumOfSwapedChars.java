package Automation.test;

public class NumOfSwapedChars {

	private static String sortedString(String s, int left) {

		char[] ch = s.toCharArray();
		for(int i =left;i<s.length()-1;i++) {
			System.out.println("current :"+s+" ; i = "+i+ "; ch[i] "+ch[i]+"; ch[i+1] "+ch[i+1]);
			if(!(Integer.valueOf(ch[i])<Integer.valueOf(ch[i+1]))) {
				s= swap(s,i,i+1);
				s= sortedString(s,0);
			}	
		}
		return s;

	}
	
	private static String swap(String s, int i, int j) {
		char[] ch = s.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j]= temp;
		return String.valueOf(ch);

	}
	
	private static int swappedChars(String input){
		String sortedString = sortedString(input,0);
		System.out.println("Input "+input+" output "+ sortedString);
		int count = 0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)!=sortedString.charAt(i)) {
				count++;
			}
		}return count;
	}
	
	public static void main(String[] args) {
		System.out.println(swappedChars("cadb"));
	}
}
