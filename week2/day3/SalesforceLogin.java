package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceLogin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		/* Url: https://login.salesforce.com/
				username: dilip@testleaf.com
				password : testleaf@2024 */
			driver.get("https://login.salesforce.com/");
			driver.findElement(By.xpath("//div[@id=\"usernamegroup\"]//input[@id=\"username\"]")).sendKeys("dilip@testleaf.com");
			driver.findElement(By.xpath("//form[@id=\"login_form\"]/input[@id='password']")).sendKeys("testleaf@2024");
			driver.findElement(By.xpath("//form[@id=\"login_form\"]/input[@id='Login']")).click();
	}
}
