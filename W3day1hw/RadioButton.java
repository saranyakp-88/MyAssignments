package week3.day1hw;

public class RadioButton extends Button{
	public void selectRadioButton() {
		System.out.println("Radio Button is selected");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton objAc = new RadioButton();
		objAc.selectRadioButton();
		objAc.submit();
		objAc.setText("From Radio Button Class");

	}

}
