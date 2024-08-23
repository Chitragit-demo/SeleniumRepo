package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChkboxAss {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		Thread.sleep(1000);
		String checked = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		System.out.println(checked);
		if (checked.equalsIgnoreCase("Checked"))
			System.out.println("Checked is displayed");
		else 
		System.out.println("Checked is not displayed");
		driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]")).click();
	//	WebElement icon_check = driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]/span(contains(text(),'ui-chkbox-icon')"));
	// how to verify
		String informationChecked = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		System.out.println("Information of Checkbox is checked in toggle: " +informationChecked);
		if (informationChecked.equalsIgnoreCase("Checked"))
			System.out.println("Checked is displayed for Toggle switch");
		String disabled = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).getText();
		System.out.println(disabled);
	
	// 	if (Attrsaved == ) how?
	
		//select multiple options - how?
		driver.close();
		
		}

}
