package week2.day4;

public class Edge extends Browser{
	String browserName = "Edge";
	double browserVersion = 129.5;
	public void takeSnap()
	{
		System.out.println("Take Snap of " +browserName +"browser opened successfully in Edge mode!");
	}
	
	public void clearCookies()
	{
		System.out.println("Clear the cookies of: " +browserVersion);
	}
}
