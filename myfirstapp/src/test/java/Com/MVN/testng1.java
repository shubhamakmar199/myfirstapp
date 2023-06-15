package Com.MVN;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng1 {
	WebDriver driver;

	@BeforeMethod
	public void testFirst() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/jewellery/diamond-rings.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test
	public void testA() throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//a[text()='Rings ']"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class=\"two-col\"]//li[2]/a[text()='Diamond']")).click();
		Thread.sleep(1000);
		WebElement ele1 = driver.findElement(By.xpath("//div/section/span/span[text()='Metal']"));
		Actions a1 = new Actions(driver);
		a.moveToElement(ele1).perform();
		driver.findElement(By.xpath("//span[text()=' Gold ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id=\"product_list_ui\"]/li[1]/div/div/a[@data-video-url=\"https://kinvid0.bluestone.com/output/mp4/BISP0359R19-VIDEO-19124.mp4/BISP0359R19-VIDEO-19124.mp4\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title=\"Close\"]")).click();
		driver.findElement(By.xpath("//img[@alt=\"The Paanita Ring\"]")).click();
	}

	@Test
	public void testB() throws InterruptedException {
		WebElement ele2 = driver.findElement(By.xpath("//a[@title=\"Coins\"]"));
		Actions a2 = new Actions(driver);
		a2.moveToElement(ele2).build().perform();
		driver.findElement(By.xpath("//span[text()='Coins by Purity']")).click();
		WebElement ele3 = driver.findElement(By.xpath("//span[text()='weight (Gram)']"));
		ele3.click();
		Actions a3 = new Actions(driver);
		a3.moveToElement(ele3).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='10 Gram']")).click();
		WebElement ele4 = driver.findElement(By.xpath("//span[text()='Purity']"));
		Actions a5 = new Actions(driver);
		a5.moveToElement(ele4).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='24 Kt']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt=\"1 gram 24 KT Gold Coin\"]")).click();
		Thread.sleep(2000);

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
