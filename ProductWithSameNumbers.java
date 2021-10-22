package Automation.test;

public class ProductWithSameNumbers {

	private static boolean verifyNumOfDigits(long num,int n) {
		return String.valueOf(num).length()==n?true:false;
	}
	
	private static  boolean verifyDigits(long num, int expectedCount) {
		int actualCount=0;
		if(verifyNumOfDigits(num,expectedCount)) {
			char[] numCh = (""+num).toCharArray();
			char[] productCh = (""+(num*2)).toCharArray();
			for(char n:numCh) {
				for(char p:productCh) {
					if(n==p)
						actualCount+=1;
				}
			}
		}		
		return expectedCount==actualCount?true:false;
	}
	
	public static void main(String[] args) {
		long start = System.nanoTime();
		int n = 6;
		long num = 142857;
		System.out.println(verifyDigits(num,n));
		long stop = System.nanoTime();
		System.out.println("time taken in milliseconds = "+ ((stop-start)/1000));
	}

}
