package Com.MVN;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bluestone {

//	pri;444

	public static void main(String[] args) throws InterruptedException, IOException {
//		Date sdate=new Date();
//		System.out.println(sdate);
//		String filename=sdate.toString().replace(" ", "/");
//		System.out.println(filename);
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.bluestone.com/jewellery/diamond-rings.html");
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebElement ele = driver.findElement(By.xpath("//a[text()='Rings ']"));
//		Actions a = new Actions(driver);
//		a.moveToElement(ele).perform();
//		driver.findElement(By.xpath("//ul[@class=\"two-col\"]//li[2]/a[text()='Diamond']")).click();
//		File ssfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(ssfile, new File(".//screenshots/"+filename+".png"));
//		driver.close();
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/jewellery/pendants.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@role=\\'button\\']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.name("email")).sendKeys("sbdvtest@airtable.com");
//		driver.findElement(By.xpath("//button[@type=\"submit\"]/ancestor::div[@id=\"sign-in-form-fields-root\"]"))
//				.click();
//		driver.findElement(By.name("password")).sendKeys("Testing@1234");
//		driver.findElement(By.name("//button[@type='submit']")).click();

	}

}
