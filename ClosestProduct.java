package Automation.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestProduct {

	private static List<Integer> productList(int[] arr){
		List<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				list.add(arr[i]*arr[j]);
			}
		}
		Collections.sort(list);
		return list;
	}
	
	private static int closestOption(List<Integer> list, int expected) {
		int[] arr =  new int[2];
		for(int i=0;i<list.size();i++) {
			if(!(list.get(i)<=expected)) {
				arr[0]=list.get(i);				
				arr[1]=(i!=0)?list.get(i-1):list.get(i);
				break;
			}
		}		
		return (Math.abs(expected-arr[0])<Math.abs(expected-arr[1]))?arr[0]:arr[1];
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 6, 8,24,36};
		int expected = 31;
		List<Integer> list = productList(arr);
		int result = closestOption(list,expected);
		System.out.println(result);

	}

}
