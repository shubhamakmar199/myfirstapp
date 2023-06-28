package Com.MVN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Mytestcasenewfile 
{
	@Test
	public void titleTextTest() throws InterruptedException
	{
		SoftAssert softassert = new SoftAssert();
		String expextedTitle = "Electronics , Cars, Fashion, Collectibles & More | eBay";
		String expectedText = "Search";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		softassert.assertEquals(actualTitle,expextedTitle,"Title Waala failed");
		String actualText = driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
		softassert.assertEquals(actualText , expectedText,"Text waala failed");
		driver.close();
		softassert.assertAll();
	}
	

}
