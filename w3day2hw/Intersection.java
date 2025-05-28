package week3.day2hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1={3, 2, 11, 4, 6, 7};
		int[] num2={1, 2, 8, 4, 9, 7};
		
		List<Integer> value1 = new ArrayList<Integer>();
		List<Integer> value2 = new ArrayList<Integer>();
		
		for (int i:num1) {
			value1.add(i);
		}
		for(int j:num2) {
			value2.add(j);
		}
		Collections.sort(value1);
		Collections.sort(value2);
		System.out.println("Sorted Collection Value 1 is: "+value1);
		System.out.println("Sorted Collection Value 2 is: "+value2);
		for (int i = 0; i <= value1.size()-1; i++) {
			for (int j = 0; j<= value2.size()-1; j++) {
				if(value1.get(i)==value2.get(j))
				{System.out.println(value1.get(i));
								}
			
		}
	}

}}
