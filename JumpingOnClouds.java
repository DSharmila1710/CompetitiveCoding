package NickWhiteHackerRank;

public class JumpingOnClouds {
	
	private static int jumps(int[] arr) {
		int count=0;
		int index = 2;
		while(index<arr.length) {
			
			if (arr[index]== 0) {
				count++;
				index+=2;
			}
			else
				index--;
		}
		if(index==arr.length)
			count++;
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {0,0,1,0,1,0,0,0,1,0,1,0,0,1,0};
		System.out.println(jumps(arr));
	}
}
