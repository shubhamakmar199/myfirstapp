package Com.TestBluestone;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		String expextedText2 = "DIAMOND RINGS RS 40000 TO 50000";
		POM_Framework_class jq = new POM_Framework_class(driver);
		jq.RingHover();
		jq.diamondClick();
		String ActualText = driver.getTitle();
		System.out.println(ActualText);
		softassert.assertEquals(ActualText, expextedText);
		jq.Hoverprice();
		jq.Price_filter();
		String Actualtext2 = driver.findElement(By.xpath("//span[text()=\"DIAMOND RINGS RS 40000 TO 50000\"]")).getText();
		System.out.println(Actualtext2);
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
	public void testG() throws InterruptedException, IOException {
		Date cdate = new Date();
		String myfilename = cdate.toString().replace(" ", "_").replace(":", "-");
		POM_Framework_class jq = new POM_Framework_class(driver);
		SoftAssert softassert = new SoftAssert();
		String ExpectedResult = "SEARCH RESULTS FOR \"NOSE+RING\"";
		jq.searchBox();
		jq.search_Icon();
		jq.tryAthome();
		jq.pincodetextBox();
		jq.SubmitB();
		jq.DesignInstors();
		String ActualText = driver.findElement(By.xpath("//h1[@class=\"page-title title-14\"]")).getText();
		softassert.assertEquals(ActualText, ExpectedResult);
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("screenshotsCaptured/" + myfilename + ".png"));
		softassert.assertAll();

	}

	@Test(priority = 6)
	public void testH() throws InterruptedException, IOException {
		Date cdate = new Date();
		System.out.println(cdate);
		String myfileName = cdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(myfileName);
		POM_Framework_class jq = new POM_Framework_class(driver);
		SoftAssert softassert = new SoftAssert();
		String ExpectedText = "GIFT FOR BIRTHDAY UNISEX RS 0 TO 10000 JEWELLERY";
		jq.hover_Gift();
		jq.clickBirthday();
		jq.Hover_price();
		Thread.sleep(1000);
		jq.FourtykTO50k();
		jq.Hover_Gender();
		jq.WoMen_click();
		String ActualText = driver
				.findElement(By.xpath("//span[text()=\"GIFT FOR BIRTHDAY UNISEX RS 0 TO 10000 JEWELLERY\"]")).getText();
		System.out.println(ActualText);
		softassert.assertEquals(ExpectedText, ActualText);
		File ssfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ssfile, new File("screenshotsCaptured/" + myfileName + ".png"));
		softassert.assertAll();

	}

	@Test(priority = 7)
	public void TestI() throws IOException, InterruptedException {

		POM_Framework_class jq = new POM_Framework_class(driver);
		SoftAssert softassert = new SoftAssert();
		
		String expectedText = "TULIP DIAMOND RINGS";
		jq.RingHover();
		jq.diamondClick();
		jq.MoreFilterButton();
		jq.closeMorefilter();
		jq.MoreFilterButton();
		jq.tulipButton();
		String actuaText=driver.findElement(By.xpath("//span[text()=\"TULIP DIAMOND RINGS\"]")).getText();
		System.out.println(actuaText);
		softassert.assertEquals(expectedText,actuaText);
		softassert.assertAll();
	}

	@Test(priority = 0)
	public void TestJ() throws IOException {
		Date cdate = new Date();
		System.out.println(cdate);
		String myfileName = cdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(myfileName);
		POM_Framework_class jq = new POM_Framework_class(driver);
		SoftAssert softassert = new SoftAssert();
		String expectedText = "OFFERS JEWELLERY";
		jq.offersButton();
		jq.offerAll();
		String actualText = driver.findElement(By.xpath("//*[@id=\"breadcrumb\"]/ul/li[3]/a/span")).getText();
		System.out.println(actualText);
		softassert.assertEquals(expectedText, actualText);
		jq.offersButton();
		File ssfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println(myfileName);
		FileUtils.copyFile(ssfile, new File(".//screenshotsCapture/" + myfileName + ".png"));
		jq.offersOne();
		jq.offersButton();
		jq.percentTwentyfive();
		softassert.assertAll();

	}

	@AfterMethod
	public void TestAfter() {
		driver.close();
		
	}

}
