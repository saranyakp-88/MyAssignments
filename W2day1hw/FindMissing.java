package week2.day1hw;

import java.util.Arrays;

public class FindMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] =  {1,4,3,2,8,6,7};
		Arrays.sort(input);// 1 2 3 4 6 7 8
		for (int i = 0 ; i < input.length; i++) 
		{
				if ((input[i+1]-input[i])!=1) {
				System.out.println(input[i]+1);
				break;
			}
			
		}
	}

}
