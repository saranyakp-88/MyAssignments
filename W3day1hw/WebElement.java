package week3.day1hw;

public class WebElement {
	public void click() {
		System.out.println("Element is clicked");
	}
	public void setText(String text) {
		System.out.println("Input Text is: "+text);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElement obj = new WebElement();
		obj.click();
		obj.setText("InputText");
	}

}
