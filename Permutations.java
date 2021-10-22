package Automation.test;

import java.util.Scanner;

public class Permutations {
	
	
	private static void permute(String str, int left, int right) {
		if(left == right) {
			System.out.println(str);
		}else {
			for(int i =left;i<=right;i++) {
				str = swap(str,left,i);
				permute(str,left+1,right);
				str = swap(str,left,i);
			}
		}
		
	}

	
	private static String swap(String str, int i, int j) {
		char[] charArray = str.toCharArray();
		char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		//Scanner scn = new Scanner(System.in);
		//String input = scn.nextLine();
		String input = "abc";
		permute("abc",0,input.length()-1);
		//scn.close();
	}
}
