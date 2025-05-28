package week3.day2hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {3, 2, 11, 4, 6, 7};
		int large=0;
		int secondLarge=0;
		List<Integer> newCollection = new ArrayList<Integer>();
		for(int i: num) {
			newCollection.add(i);
		
		}
		Collections.sort(newCollection);
		System.out.println("Sorted Collection is: "+newCollection);
		for (int i = 0; i < newCollection.size()-1; i++) {
			if(newCollection.get(i+1)>newCollection.get(i))
			{
				large=newCollection.get(i+1);
				secondLarge=newCollection.get(i);
			}
		}
		System.out.println("The largest Number is: "+large+"\n"+"second largest number is: "+secondLarge);
			}

}
