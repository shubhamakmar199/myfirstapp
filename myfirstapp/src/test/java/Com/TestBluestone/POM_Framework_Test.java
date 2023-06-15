package Com.TestBluestone;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.MVN.POM_Framework_class;
import io.github.bonigarcia.wdm.WebDriverManager;

public class POM_Framework_Test {
	WebDriver driver;

	@BeforeMethod
	public void BeforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/jewellery/diamond-rings.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Test(priority = 3)
	public void TestC() throws InterruptedException {

		POM_Framework_class jq = new POM_Framework_class(driver);
		jq.RingHover();
//		Thread.sleep(3000);
		jq.diamondClick();
		jq.Hover_Metal();
		jq.GoldClick();
		jq.PlayVideo();
		Thread.sleep(3000);

	}

	@Test(priority = 4)
	public void TestD() throws InterruptedException {
		SoftAssert softassert = new SoftAssert();
		String expextedText = "Buy 1700+ Diamond Rings Online | BlueStone.com - India's #1 Online Jewellery Brand";
		String expextedText2 = "DIAMOND RINGS RS 30000 TO 40000";
		POM_Framework_class jq = new POM_Framework_class(driver);
		jq.RingHover();
		jq.diamondClick();
		String ActualText = driver.getTitle();
		System.out.println(ActualText);
		softassert.assertEquals(ActualText, expextedText);
		jq.Hoverprice();
		jq.Price_filter();
		String Actualtext2 = driver.findElement(By.xpath("//span[text()='DIAMOND RINGS RS 30000 TO 40000']")).getText();
		softassert.assertEquals(Actualtext2, expextedText2);
		softassert.assertAll();

	}

	@Test(priority = 5)
	public void testE() throws InterruptedException {

		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='top-filter-blocks']"));
		Actions a = new Actions(driver);
		for (WebElement webElement : elements) {
			a.moveToElement(webElement).build().perform();
			Thread.sleep(2000);
		}
	}

	@Test(priority = 1)
	public void testF() throws InterruptedException {
		SoftAssert softassert = new SoftAssert();
		String expextedText = "POPULAR";
		POM_Framework_class jq = new POM_Framework_class(driver);
		jq.RingHover();
		jq.diamondClick();
		jq.Sorting();
		jq.LowToHigh();
		Thread.sleep(2000);
		jq.Sorting();
		jq.HighToLow();
		Thread.sleep(2000);
		jq.Sorting();
		jq.sort_Popular();
		String Actualtext = driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']"))
				.getText();
		System.out.println(Actualtext);
		softassert.assertEquals(Actualtext, expextedText);
		Thread.sleep(2000);
		jq.Sorting();
		jq.sort_Discount();
		softassert.assertAll();

	}

	@Test(priority = 2)
	public void testG() throws InterruptedException {
		POM_Framework_class jq = new POM_Framework_class(driver);
		SoftAssert softassert = new SoftAssert();
		String expectedText = "EXPLORE DESIGNS BY CATEGORY";
		String expectedText2 = "RINGS";
		jq.searchBox();
		jq.search_Icon();
		String ActualText = driver.findElement(By.xpath("//span[text()='Explore Designs by Category']")).getText();
		System.out.println(ActualText);
		softassert.assertEquals(expectedText, ActualText);
		jq.ringClick();
		String ActualText2 = driver.findElement(By.xpath("//span[text()='RINGS']")).getText();
		softassert.assertEquals(expectedText2, ActualText2,"Test case passed");
		softassert.assertAll();
	}

	@Test(priority = 6)
	public void testH() throws InterruptedException {
		POM_Framework_class jq = new POM_Framework_class(driver);
		SoftAssert softassert = new SoftAssert();
		String ExpectedText = "PARTY WEAR GIFT WOMEN RS 40000 TO 50000 JEWELLERY";
		jq.hover_Gift();
		jq.clickBirthday();
		jq.Hover_price();
		jq.FourtykTO50k();
		jq.Hover_Gender();
		jq.WoMen_click();
		jq.by_occasion();
		jq.partyWear_Click();
		String ActualText = driver
				.findElement(By.xpath("//a[@title=\"Party Wear Gift Women Rs 40000 To 50000 Jewellery\"]")).getText();
		System.out.println(ActualText);
		softassert.assertEquals(ExpectedText, ActualText);
		softassert.assertAll();
	}

	@Test(priority = 7)
	public void TestI() {
		POM_Framework_class jq = new POM_Framework_class(driver);
		SoftAssert softassert = new SoftAssert();
		String expectedText = "1 GRAM 24 KT GOLD COIN";
		jq.Hover_Coin();
		jq.Coins_purity();
		jq.Hover_Weight();
		jq.FiveGms();
		jq.Hover_purity();
		jq.twentyfour_KTS();
		jq.Detail_view();
		driver.switchTo().alert();
		String ActualText = driver.findElement(By.xpath("//span[text()='1 GRAM 24 KT GOLD COIN']")).getText();
		System.out.println(ActualText);
		softassert.assertEquals(expectedText, ActualText);
		softassert.assertAll();
	}

	@AfterMethod
	public void TestAfter() {
		driver.close();
	}

}
