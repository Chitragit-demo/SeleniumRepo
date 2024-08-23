package week2.day4;

public class Browser {

		String browserName = "BrowserIE";
		double browserVersion = 127.5;
		public void openURL()
		{
			System.out.println("URL of " +browserName +" browser opened successfully!");
		}
		
		public void CloseBrowser()
		{
			System.out.println("Close the browser" +browserName);
		}
		
		public void navigateBack()
		{
			System.out.println("Navigate Back to "+browserName +"and change the version to:" +browserVersion);
		}
}
