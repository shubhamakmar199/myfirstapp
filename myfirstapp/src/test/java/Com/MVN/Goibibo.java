package Com.MVN;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Goibibo {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.goibibo.com/hotels/");
		driver.findElement(By.xpath("//input[@class=\"HomePageAutosuggeststyles__SearchInputStyles-sc-1v6s32j-1 euhecC\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='Mysore']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\'search-widget-checkin-input\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-testid=\"date_li_3_7_2023\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-testid=\"date_li_16_7_2023\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"SearchWidgetUIstyles__PaxWrapperStyle-sc-1pb2jm7-4 kRnkxX\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-testid=\"button-adult-add\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-testid=\"button-child-add\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h4[text()='Select']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='UPDATE SEARCH']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"HotelCardstyles__ImageGalleryWrapperDiv-sc-1s80tyk-2 kWNbWZ\"]/div")).click();

	}

}
