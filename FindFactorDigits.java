package NickWhiteHackerRank;
import java.util.*;

public class FindFactorDigits {

	public static List<Integer> findFactorDigit(int n, List<Integer> numbers){
		List<Integer> list = new ArrayList<Integer>();
		
		
		for(int i =0;i<n;i++) {
			int original_num = numbers.get(i);

			int num = original_num;
			int totalFactors = 0;
			while(num>0) {
				int digit = num%10;
				num = (num/10);
				totalFactors = ( digit!=0 && original_num%digit==0 )?totalFactors+1:totalFactors;

			}
			list.add(totalFactors);
		}
		return list;
	}
	
	public static void main(String[] args) {
		System.out.println(findFactorDigit(2, Arrays.asList(12,1012)));

	}

}
