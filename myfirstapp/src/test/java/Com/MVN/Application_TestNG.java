package Com.MVN;

import java.lang.reflect.Proxy;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.Proxy;

public class Application_TestNG {
	@Test
	public void TestA() throws InterruptedException {
//	ChromeOptions chromeOptions = new ChromeOptions();
	org.openqa.selenium.Proxy p=new org.openqa.selenium.Proxy();
	p.setAutodetect(false);
//	p.setHttpProxy("localhost:8080");
	p.setSslProxy("localhost:8888");
	ChromeOptions chromeOptions = new ChromeOptions();
//	DesiredCapabilities d=new DesiredCapabilities();
	chromeOptions.setCapability("proxy", p);
		
		
		
//		
//       chromeOptions.setProxy(null);
//        chromeOptions.setAcceptInsecureCerts(true);
		 
		WebDriverManager.chromedriver().setup();

//		WebDriver driver = new EdgeDriver();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();
		driver.get("https://airtable.com/");
		Thread.sleep(2000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@data-tracking-name=\"sign in\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("sbdvtest@yopmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]/ancestor::div[@id=\"sign-in-form-fields-root\"]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Testing@1234");
		Thread.sleep(2000);
		driver.findElement(By.name("//button[@type=\"submit\"]")).click();

		// password
	}
}
