package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDemonstration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Chitra");
		driver.findElement(By.name("lastname")).sendKeys("Sivasubramanian");
		driver.findElement(By.name("reg_email__")).sendKeys("chitra91btech@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("valuestosend");
		WebElement birthdayday = driver.findElement(By.id("day")); 
		new Select(birthdayday).selectByIndex(24); 
		WebElement birthdaymonth = driver.findElement(By.id("month")); 
		new Select(birthdaymonth).selectByValue("5");
		WebElement birthday_year = driver.findElement(By.id("year")); 
		new Select(birthday_year).selectByVisibleText("1991");
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		driver.findElement(By.name("websubmit")).click();
		
		String Fbpagetitle = driver.getTitle();
		System.out.println(Fbpagetitle);
		driver.close();
		}

}
