package week3.day1hw;

public class TextField extends WebElement{
	public void getText() {
		System.out.println("Text of the element is obtained");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextField objB = new TextField();
		objB.getText();
		objB.setText("Input Element");

	}

}
