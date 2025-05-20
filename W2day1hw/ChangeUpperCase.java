package week2.day1hw;

public class ChangeUpperCase {
	public static void main(String[] args) {
		String input = "changeme";
		char[] value = input.toCharArray();
	//	int charArrayLength = value.length;
		//System.out.println(charArrayLength);
		for (int i = 0; i < value.length; i++) {
			if(i%2!=0) {
				value[i]=Character.toUpperCase(value[i]);
				 
			}
			System.out.print(value[i]);
		} 
		
	}
}
