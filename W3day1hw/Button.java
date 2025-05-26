package week3.day1hw;

public class Button extends WebElement{
	
	public void submit() {
		System.out.println("Input is submitted");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button objA = new Button();
		objA.submit();
		objA.click();

	}

}
