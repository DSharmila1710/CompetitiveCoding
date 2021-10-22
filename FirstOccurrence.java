package Automation.test;

public class FirstOccurrence {

	public static void main(String[] args) {
		int[] arr =  {8, 7, 6, 7, 6, 5, 4, 3, 2, 3, 4, 3}  ;
		int number = 2;
		int index = 0;
		while(index<arr.length) {
			if(arr[index] == number) 
				break;
			else
				index+=Math.abs(arr[index]-number);
		}
		System.out.println(index);
	}

}
