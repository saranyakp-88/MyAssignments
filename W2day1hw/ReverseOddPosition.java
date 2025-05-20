package week2.day1hw;


public class ReverseOddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "I am a software tester";
		System.out.println("Input String :"+input);
		String[] splitText = input.split(" ");
		for (int i = 0; i < splitText.length; i++) {
			if(i%2!=0)
			{
				char[] ch = splitText[i].toCharArray();
				for (int j = ch.length-1; j >=0 ; j--) {
					System.out.print(ch[j]);
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(splitText[i]+" ");
			}
			
		}
	}

}
