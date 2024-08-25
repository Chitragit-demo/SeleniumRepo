package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobtn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//h5[contains(text(),'favorite browser')]/parent::div//div[contains(@class,'ui-radiobutton-box ')])[2]")).click();
		
		WebElement unSelectbtn = driver.findElement(By.xpath("(//h5[contains(text(),'UnSelectable')]/parent::div//div[contains(@class,'ui-radiobutton-box ')])[2]"));
		unSelectbtn.click();
		Thread.sleep(1000);
		unSelectbtn.click();
		
		//which property to be chosen to make sure it is unselected
		
		//Identify the radio button that is initially selected by default.
		
		WebElement agegroup = driver.findElement(By.xpath("(//h5[contains(text(),'age')]/parent::div//div[contains(@class,'ui-radiobutton-box ')]/parent::div/following-sibling::label)[2]"));
		System.out.println(agegroup.getText());
		WebElement agegroupnot = driver.findElement(By.xpath("//h5[contains(text(),'age')]/parent::div//div[contains(@class,'ui-radiobutton-box ')]/parent::div/following-sibling::label"));
		// How do we ensure if not already selected
		
		if((agegroup.getText()) != "21-40 Years") //it is not comparing, why?
		{
			agegroupnot.click();			
		}
		// driver.close();
	}
	
}
