package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_url {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
	driver.get("https://www.ebay.com");
	System.out.println(driver.getTitle().equals("Electronics, Cars, Fashion, Collectibles & More | eBay"));
	driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Laptop",Keys.ENTER);

	driver.close();

	}

}
