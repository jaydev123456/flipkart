package pack1;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Window_Handles {
public static void main (String[]args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.findElement(By.linkText("HOTELS")).click();
	Set<String> window = driver.getWindowHandles();
	Iterator<String> it = window.iterator();
	String parentid = it.next();
	String childid = it.next();
	driver.switchTo().window(childid);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@class='ContactBtnTop']")).click();
	driver.quit();
	
}
}
