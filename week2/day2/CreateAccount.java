package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Assignment-Create Account_2");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industryelem = driver.findElement(By.name("industryEnumId"));
		Select s = new Select(industryelem);
		s.selectByIndex(2);
		WebElement ownershipEnumId = driver.findElement(By.name("ownershipEnumId")); 
		new Select(ownershipEnumId).selectByVisibleText("S-Corporation"); 
		
		WebElement dataSourceId = driver.findElement(By.id("dataSourceId")); 
		Select selectvalue = new Select(dataSourceId);
		selectvalue.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingCampaignId = driver.findElement(By.id("marketingCampaignId")); 
		new Select(marketingCampaignId).selectByIndex(5); 
		
		WebElement generalSta = driver.findElement(By.id("generalStateProvinceGeoId")); 
		new Select(generalSta).selectByValue("TX"); 
		
		driver.findElement(By.className("smallSubmit")).click();
		String Accpagetitle = driver.getTitle();
		System.out.println(Accpagetitle);
		String assignmentCreateAccount = driver.findElement(By.xpath("//div[@class=\"frameSectionBody\"]//span[contains(text(), \"Assignment\")]")).getText();
		System.out.println(assignmentCreateAccount);
		
		if(assignmentCreateAccount.contains("Assignment-Create Account"))
		{
			System.out.println("Account Name is displayed correctly");
		}
		driver.close();
	}

}
