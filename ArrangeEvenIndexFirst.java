package test2;

public class ArrangeEvenIndexFirst {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		int l=arr.length;
		int i=1;
		while(i<(l+1)/2) {
			int j=1;
			while(j<=i) {
				arr[j+i]=arr[j+i]+arr[i];
				arr[i]=arr[j+i]-arr[i];
				arr[j+i]=arr[j+i]-arr[i];
				j++;
			}
			i++;
		}
		for(int k:arr) {
			System.out.print(k+" ");
		}

	}

}
