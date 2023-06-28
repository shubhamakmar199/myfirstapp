package Com.MVN;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POM_Jequery_test {
	WebDriver driver;

	@BeforeTest
	public void TestBefore() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test(priority = 2)
	public void TestFirst() {
		POM_Jequery_class jq = new POM_Jequery_class(driver);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		jq.Iframe_handles();
		jq.Boxdrag();

	}

	@Test(priority = 6)
	public void TestB() {
		POM_Jequery_class jq = new POM_Jequery_class(driver);
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		jq.Iframe_handlesA();
		jq.Resizable();
	}

	@AfterTest
	public void AfterTest() {
		driver.close();
	}

}
