package Automation.test;

import java.util.Arrays;

public class UniqueDigitsInPhoneNum {
	

	public static void main(String[] args) {
		String expected = "0123456789";
		String phNum = "9860735421";
		char[] phNumArray = phNum.toCharArray();
		Arrays.sort(phNumArray);
		System.out.println(expected.equals(String.valueOf(phNumArray))?true:false);
	}


}
