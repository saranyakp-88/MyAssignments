package week3.day1hw;

public class CheckBoxButton extends Button{
	public void clickCheckButton() {
		System.out.println("Click button checked");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxButton objAb = new CheckBoxButton();
		objAb.submit();
		objAb.setText("From CheckBoxButton Class");
		objAb.clickCheckButton();

	}

}
