package Com.MVN;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		List<WebElement> ele = driver.findElements(By.xpath("//li[@class=\'hl-cat-nav__js-tab\']"));

		Actions A = new Actions(driver);

		for (WebElement webElement : ele) {
			A.moveToElement(webElement).build().perform();
			Thread.sleep(2000);
		}

	}

}
