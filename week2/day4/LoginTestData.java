package week2.day4;

public class LoginTestData extends Testdata {
	String username = "Chitra";
	String password = "password";
	public void enterusername() {
		System.out.println("Enter User Name: " +username);
	}
	public void enterPassword() {
		System.out.println("Enter Password: " +password);
	}
	public static void main(String[] args)
	{
		LoginTestData LTD = new LoginTestData();
		LTD.enterCredentials();
		LTD.navigateToHomePage();
		LTD.enterusername();
		LTD.enterPassword();
	}
}
