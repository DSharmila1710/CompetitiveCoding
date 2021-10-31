package NickWhiteHackerRank;

import java.io.*;
import java.util.*;

public class CompareTheTriplets {
	
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> sum = new ArrayList<Integer>();
        if(a.size()==b.size()){
            int sum_a = 0, sum_b =0;
            
            for(int i =0;i<a.size();i++){
                if(a.get(i)>b.get(i)){
                    sum_a++;
                }else if(a.get(i)<b.get(i)){
                    sum_b++;
                }
            }
            sum.add(0,sum_a);
            sum.add(1,sum_b);
            
        }
        return sum;
    }

	
    public static void main(String[] args) throws IOException {
       
    	List<Integer> a = new ArrayList<Integer>();
    	List<Integer> b = new ArrayList<Integer>();
    	a.add(1);
    	a.add(2);
    	a.add(3);
    	b.add(3);
    	b.add(2);
    	b.add(1);
        List<Integer> result = compareTriplets(a, b);
        System.out.println(result);
        
    }
}
