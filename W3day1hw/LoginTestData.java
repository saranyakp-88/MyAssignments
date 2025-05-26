package week3.day1hw;

public class LoginTestData extends TestData{
	public void enterUsername(String username) {
		System.out.println("User Name Entered : "+username);
	}
	
	public void enterPassword(String password) {
		System.out.println("Password entered : "+password);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData ltd = new LoginTestData();
		ltd.enterUsername("TestAcc");
		ltd.enterPassword("*****");
		ltd.enterCredentials();
		ltd.navigateToHomePage();
	}

}
