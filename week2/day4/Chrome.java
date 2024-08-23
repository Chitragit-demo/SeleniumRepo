package week2.day4;

public class Chrome extends Browser {
	String browserName = "Chrome";
	double browserVersion = 128.5;
	public void openCognito()
	{
		System.out.println("open of " +browserName +"browser opened successfully in inCognito mode!");
	}
	
	public void clearCache()
	{
		System.out.println("Clear the Cache of: " +browserVersion);
	}
}
