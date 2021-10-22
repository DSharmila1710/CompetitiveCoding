package Automation.test;

import java.util.Scanner;

public class NearestPrime {

	public static int nearestPrime(int input) {
		if(!isPrime(input)) {
			int increment=1;
			int sign = 1;
			while(!isPrime(input)) {
				increment *= sign;
				input += increment;
				increment++;
				sign *= -1;
			}
		}return input;
	}
	
	public static boolean isPrime(int number) {
		boolean isPrimeNum = true;
		if(number>1) {
			for(int i=2;i<=Math.sqrt(number);i++) {
				if(number%i==0) {
					isPrimeNum= false;
					break;
				}
			}
		}
		return isPrimeNum;
	}
	
	
	public static void main(String args[]) {
		System.out.print("number : ");
		Scanner scn = new Scanner(System.in);
		int input=  scn.nextInt();
		System.out.println("nearest prime : "+nearestPrime(input));
		scn.close();
	}
}
