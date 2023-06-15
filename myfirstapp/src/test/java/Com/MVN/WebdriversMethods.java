package Com.MVN;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriversMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
//		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("login-button")).click();
//		System.out.println(driver.findElement(By.id("login-button")).getAttribute("class"));
//		System.out.println(driver.findElement(By.id("login-button")).getSize());
//		System.out.println(driver.findElement(By.id("login-button")).getLocation());
//		System.out.println(driver.findElement(By.id("login-button")).getTagName());
//		System.out.println(driver.findElement(By.id("login-button")).getText());
		List<WebElement> webElement =driver.findElements(By.xpath("//div[@class=\"inventory_item_name\"]"));
		System.out.println(webElement);
		for (WebElement webElement2 : webElement) {
			System.out.println(webElement2.getText());
		}
//		String S=driver.getCurrentUrl();
//		System.out.println("Current URL is  "+ S);
//		String title=driver.getTitle();
//		System.out.println("Current URL is  "+ title);
//		Thread.sleep(1000);
//		driver.navigate().to("https://www.youtube.com/");
//		driver.navigate().back();

	}

}
