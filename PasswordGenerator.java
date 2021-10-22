package Automation.test;

import java.util.Stack;

public class PasswordGenerator {

	private static String password(String str) {
		
		str=str.toLowerCase();
		for(int i=0;i<str.length()-1;i++) {
			
			if(Integer.valueOf(str.charAt(i))==Integer.valueOf(str.charAt(i+1))){
				str = str.substring(0, i)+str.substring(i+2);
				str = password(str);
			}
			
		}return str;
	}

	
	private static String adjacentChar(String str) {
		
		
		Stack<Character> stack = new Stack<Character>();
		stack.push((Character)str.charAt(0));
		
		for(int i=1;i<str.length();i++) {
			Character ch = stack.peek();
			if(!(Integer.valueOf(ch)==Integer.valueOf(str.charAt(i)))) {
				stack.push((Character)str.charAt(i));				
			}else {
				stack.pop();	
			}
		}
		return stack.toString();
	}

	public static void main(String[] args) {
		
		// abccb => a (remove if adjacent characters are same using stack ) -> 2 formats
		
		System.out.println(adjacentChar("abccb"));
		System.out.println(password("abccb"));
		
	}

}
