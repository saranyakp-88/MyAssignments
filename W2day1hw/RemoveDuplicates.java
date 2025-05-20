package week2.day1hw;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String input = "Text Java String Text";
		String input = "We learn Java basics as part of java sessions in java week1";
		int count = 0;
		System.out.println("String before removing duplicate words: "+input);
		String[] splitText = input.split(" ");
		//System.out.println(splitText);
		for (int i= 0; i < splitText.length; i++) {
		
			for (int j=i+1 ; j <= splitText.length-1;j++)
			{
				if (splitText[i].equalsIgnoreCase(splitText[j])) {
					count++;
					if (count>0){
						splitText[j] ="";
					}
			
				}
			}
			
		}
		String result = String.join(" ",splitText); 
		System.out.println("String after removal of duplicate words: "+result);
	//	for (int i = 0; i < splitText.length; i++) {
		//	System.out.print(" "+splitText[i]);
	//	}			
	}

}
