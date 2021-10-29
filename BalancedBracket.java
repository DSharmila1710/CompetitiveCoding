package NickWhiteHackerRank;

import java.util.Stack;

public class BalancedBracket {

	private static boolean isBalanced(String input) {
		boolean status = false;
		try {
			int n = input.length()-1;
			if(input.length()%2==0 && 
					(input.charAt(0)=='[' ||input.charAt(0)=='{' || input.charAt(0)=='(') && 
					(input.charAt(n)==']' ||input.charAt(n)=='}' || input.charAt(n)==')')) {
				Stack<Character> stack = new Stack<Character>();
				for(int i=0;i<=n;i++) {				
					if(input.charAt(i) =='[' ||  input.charAt(i)=='{' || input.charAt(i)=='(') {
						stack.push(input.charAt(i));
					}else if(!stack.isEmpty()) {
						Character ch = stack.pop();
						status= ((ch=='[' && input.charAt(i) ==']')||(ch=='(' && input.charAt(i) ==')')||(ch=='{' && input.charAt(i) =='}'))?true:false;
					}
				}
			}		
		}catch (Exception e) {
			e.getMessage();
		}
		return status;
	}

	public static void main(String[] args) {
		System.out.println(isBalanced("[]"));
		System.out.println(isBalanced("[({})]"));
		System.out.println(isBalanced("[})]({"));
		System.out.println(isBalanced(""));
		System.out.println(isBalanced("["));
		System.out.println(isBalanced("[]{}()"));
	}

}
