package week2.day1hw;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstInput = "listen";
		String secondInput = "silent";
		System.out.println("First word is:"+firstInput);
		System.out.println("Secon word is:"+secondInput);
		int length1 = firstInput.length();
		int length2 = secondInput.length();
		if (length1!=length2) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		char[] firstWord = firstInput.toCharArray();
		char[] secondWord = secondInput.toCharArray();
		Arrays.sort(firstWord);
		//System.out.println(firstWord);
		Arrays.sort(secondWord);
		//System.out.println(secondWord);
		
				//if(Arrays.toString(firstWord).equals(Arrays.toString(secondWord))) {
		if (Arrays.equals(firstWord, secondWord)) {
			System.out.println("the given string is anagram");
		}
		else
			{
			System.out.println("The given string is not anagram");
			}
	}

}
