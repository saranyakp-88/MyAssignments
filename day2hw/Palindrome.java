package week1.day2hw;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 151;
		int rem = 0;
		String temp = "" ;
		for (int i = input; i > 0; i/=10)
		{
			rem =  i%10 ;
			temp = temp + rem;
		}
		int reversedNumber = Integer.valueOf(temp); 
		if (reversedNumber == input) { 
			System.out.println("Number is palindrome: "+reversedNumber);
	} else {
		System.out.println("number is not palindrome: "+reversedNumber);
	}

} }
