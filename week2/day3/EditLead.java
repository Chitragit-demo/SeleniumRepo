package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(), \"CRM/SFA\")]")).click();	
		driver.findElement(By.xpath("//a[contains(text(), \"Leads\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(), \"Create Lead\")]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("ACC");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Chitra");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Sivasubramanian");
		driver.findElement(By.xpath("//span[text()='First Name (Local)']/following::input")).sendKeys("Chitra");
		driver.findElement(By.xpath("//span[text()='Last Name (Local)']/following::input")).sendKeys("Sivasubramanian");
		driver.findElement(By.xpath("//span[text()='Department']/following::input")).sendKeys("IT");
		driver.findElement(By.xpath("//span[text()='Description']/following::textarea")).sendKeys("Type Description test");
		driver.findElement(By.xpath("//span[text()='E-Mail Address']/following::input")).sendKeys("chitra91btech@gmail.com");
		
		WebElement stateProv = driver.findElement(By.xpath("//span[text()='State/Province']/following::select"));
		new Select(stateProv).selectByVisibleText("New York"); 
				
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Description']/following::textarea")).clear();
		driver.findElement(By.xpath("//span[text()='Important Note']/following::textarea")).sendKeys("Typing important note now");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String Accpagetitle = driver.getTitle();
		System.out.println(Accpagetitle);
		driver.close();
	}

}
