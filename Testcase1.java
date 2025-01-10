package week4.marathon;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	//	ChromeDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tatacliq.com");
		// our disable notifications will disable every pop-up's - but use notifications without fail
		
		WebElement mohoBrands = driver.findElement(By.xpath("//div[contains(text(),\"Brands\")]"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(mohoBrands).perform();
		
		driver.findElement(By.xpath("//div[text()='Watches & Accessories']")).click();
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		
		driver.findElement(By.className("SelectBoxDesktop__hideSelect")).click();
		
		driver.findElement(By.xpath("//option[text()='New Arrivals']")).click();
		
		driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilName']")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		
		for(int i =0; i < prices.size(); i++)
		{
			System.out.println(prices.get(i).getText());
		}
		String firstresprice = prices.get(0).getText();
		System.out.println("First Result Price: " +firstresprice);
		driver.findElement(By.xpath("//div[@class='ProductModule__dummyDiv']")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		String originaltab = driver.getWindowHandle();
		for(String handle: windowhandles) {
			if (!handle.equals(originaltab)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		//String mRP = driver.findElement(By.xpath("//label[text()='Limited stock']/preceding::h3")).getText();
		String mRP = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']//h3")).getText();
		System.out.println("MRP Shown: "+mRP);
		String cleanedprice1 = firstresprice.replaceAll("[^0-9.]",  "").trim();
		System.out.println("Cleaned price 1: " +cleanedprice1);
		int value1 = Integer.parseInt(cleanedprice1);
		String cleanedprice2 = mRP.replaceAll("[^0-9.]",  "").trim();
		System.out.println("Cleaned price 2: " +cleanedprice2);
		int value2 = Integer.parseInt(cleanedprice2);
		if(value1 == value2)
		{
		System.out.println("Comparison success");
		}
		WebElement addtocart = driver.findElement(By.xpath("//span[text()='ADD TO BAG']"));
		actions.moveToElement(addtocart).perform();
		actions.click(addtocart).perform();
		String cart = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("Cart Count: "+cart);
		driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).click();
		Thread.sleep(2000);
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./SnapShot/watchimg.png");
		FileUtils.copyFile(scr, dest);
		System.out.println(dest.getAbsolutePath());
		driver.close();
		driver.quit();
	}

}
