package Com.MVN;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazone {
	WebDriver driver;

	@BeforeMethod
	public void testFirst() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test
	private void Test01() {
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Recommend clothing brands and styles based on my size, preferred colors, and fashion influencers I follow.");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

	}

}
