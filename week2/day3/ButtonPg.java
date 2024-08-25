package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonPg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String Accpagetitle = driver.getTitle();
		System.out.println(Accpagetitle);
		
		if(Accpagetitle.equalsIgnoreCase("dashboard"))
		{
			System.out.println("Submit page is displayed correctly");
		}
		driver.navigate().back();
		Thread.sleep(2000);
		String Buttonpage = driver.getTitle();
		System.out.println(Buttonpage);
		
		String confirmIfThe = driver.findElement(By.xpath("//h5[contains(text(),'disabled')]/parent::div//button")).getText();
		System.out.println(confirmIfThe);
		if(confirmIfThe.equalsIgnoreCase("disabled"))
		{
			System.out.println("Button disabled is displayed correctly");
		}
		
		WebElement Posbutton = driver.findElement(By.xpath("//span[text()='Submit']"));
		Point location = Posbutton.getLocation();
		
		System.out.println("Position of x:" +location.x  +" ; " +" Position of Y:" +location.y);
		WebElement savebtn = driver.findElement(By.xpath("//h5[contains(text(),'Save')]/parent::div//button"));
		String cssValue = savebtn.getCssValue("background-color");
		System.out.println("Print the color of the button: " +cssValue);
		// How to take the color of text; now it prints rgb (96,125,139,1)
		
		WebElement heightwidthbtn = driver.findElement(By.xpath("(//h5[contains(text(),'height and width')]/following::span)[2]"));
		int height = heightwidthbtn.getRect().getDimension().getHeight();
		int width = heightwidthbtn.getRect().getDimension().getWidth();
		System.out.println("Height and Width of this buttons are: "+height +" , " +width);
		driver.close();
	}

}
