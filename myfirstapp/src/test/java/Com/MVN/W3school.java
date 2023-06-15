package Com.MVN;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3school {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()=\'Video Tutorial\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='vjs-big-play-button']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
