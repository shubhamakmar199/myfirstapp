package Com.MVN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpW3S {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@id,'signupbtn_topnav')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@style='margin-top: 35px;']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\'email\']")).sendKeys("shubhamakmar199@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\'new-password\']")).sendKeys("Shubhamakmar199@");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Sign up for free']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\'first_name\']")).sendKeys("Shubham");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Akmar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu\"]")).click();
		driver.close();
		

	}

}
