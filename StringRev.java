package Automation.test;

import java.util.Scanner;

public class StringRev {

	
	private static void reverse(String str) {
		try {
			for(int i=str.length()-1 ;i>=0;i--) {
				System.out.print(str.charAt(i));
			}
		}catch(Exception e) {
			e.getMessage();
		}

	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		reverse(scn.nextLine());
		scn.close();
	}
}
