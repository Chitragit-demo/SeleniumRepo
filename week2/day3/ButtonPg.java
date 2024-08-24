package week2.day3;

import org.openqa.selenium.By;
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
		
		String confirmIfThe = driver.findElement(By.xpath("//div[@class='card']/following-sibling::div")).getText();
		System.out.println(confirmIfThe);
		if(confirmIfThe.equalsIgnoreCase("disabled"))
		{
			System.out.println("Button disabled is displayed correctly");
		}
		
		//Find and print the position of the button with the text ‘Submit.’ - How do?
		
		// How to take the color
		
		// height and width of the button?
		
		driver.close();
	}

}
