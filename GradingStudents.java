package NickWhiteHackerRank;

import java.util.*;

public class GradingStudents {

	public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i : grades){
            if(i>37){
                i= (i%5>=3)?(i%5==3)?i+2:i+1:i;
            }
            list.add(i);
        }
        return list;
    }
	
	public static void main(String[] args) {
		List<Integer> grades = new ArrayList<Integer>();
		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(33);		
		System.out.println(gradingStudents(grades));

	}

}
