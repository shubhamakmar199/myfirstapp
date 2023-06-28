package Com.MVN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FB {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label=\'First name\']")).sendKeys("Shubham");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Akmar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("7744078910");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("hsu bha5bjsb9");
		Thread.sleep(2000);
		WebElement ww = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select select=new Select(ww);
		select.selectByIndex(4);
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select select1=new Select(month);
		select1.selectByIndex(7);
		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select select2=new Select(year);
		select2.selectByIndex(7);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
	
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
