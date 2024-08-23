package week2.day4;

public class Safari extends Browser {
	String browserName = "Safari";
	double browserVersion = 130.5;
	public void readerMode()
	{
		System.out.println("Browser of " +browserName +"opened successfully in reader mode!");
	}
	
	public void fullScreenMode()
	{
		System.out.println("Open the browser with fullscreen mode in version: " +browserVersion);
	}
	
	public static void main(String[] args)
	{
		Safari saf = new Safari();
		saf.CloseBrowser();
		saf.fullScreenMode();
		saf.readerMode();
		saf.navigateBack();
		saf.openURL();
		Chrome chr = new Chrome();
		chr.openCognito();
		chr.clearCache();
		Edge ed = new Edge();
		ed.takeSnap();
		ed.clearCookies();
		
	}
}
