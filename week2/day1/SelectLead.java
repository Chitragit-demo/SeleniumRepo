package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Chitra");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sivasubramanian");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("My First Sel Assignment");
		Thread.sleep(2000);
		driver.findElement(By.className("smallSubmit")).click();
		String Leadpagetitle = driver.getTitle();
		System.out.println(Leadpagetitle);
		driver.close();
		}

}
