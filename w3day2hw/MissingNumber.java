package week3.day2hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num =  {1, 2, 3, 4, 10, 6, 8};
		List<Integer> number= new ArrayList<Integer>();
		for(int i:num) {
			number.add(i);
		}
		Collections.sort(number);
		System.out.println("Sorted collection is: "+number);
		for (int i = 0; i < number.size()-1; i++) {
			if(number.get(i+1)-number.get(i)!=1) {
				System.out.println("Missing Number is:"+(number.get(i)+1));
				break;
			}
			

	}

}
}