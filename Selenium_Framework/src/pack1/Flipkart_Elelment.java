package pack1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkart_Elelment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(
				"https://www.flipkart.com/mens-tshirts/pr?sid=clo,ash,ank,edy&fm=neo%2Fmerchandising&iid=M_defeaae4-0c8a-43bf-aa74-b52164b1e23c_1_372UD5BXDFYS_MC.IF56C41VGEYS&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion~Men%27s%2BTop%2BWear~Men%27s%2BT-Shirts_IF56C41VGEYS&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L2_view-all&cid=IF56C41VGEYS");
		List<WebElement> style = driver.findElements(By.xpath("//a[@class='WKTcLC']"));
		System.out.println("Name of the style:" + style.size());
		for (WebElement el : style)
			System.out.println(el.getText());
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='Nx9bqj']"));
		System.out.println("No of Tshirt:" + price.size());
		for (WebElement el : price)
			System.out.println(el.getText());
		driver.close();
	}
}