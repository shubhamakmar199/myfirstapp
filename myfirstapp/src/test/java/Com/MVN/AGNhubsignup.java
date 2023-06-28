package Com.MVN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AGNhubsignup {
	WebDriver driver;
	@Test
	public void TestA() {
		 driver = new ChromeDriver();
		driver.get("https://agnhub.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//i[@class=\"fa-sharp fa-solid fa-right-to-bracket\"]")).click();
		driver.findElement(By.name("name")).sendKeys("1’or’1’=‘1");
		driver.findElement(By.name("pwd")).sendKeys("1’or’1’=‘1");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//a[@href=\"register.php\"]")).click();
		driver.findElement(By.name("name")).sendKeys("Shubham");
		driver.findElement(By.name("email")).sendKeys("shubhamakmar199@gmail.com");
		driver.findElement(By.name("mobile")).sendKeys("7744078910");
		driver.findElement(By.name("address")).sendKeys("Karve nagar,Pune");
		WebElement ele= driver.findElement(By.name("course_id"));
		Select s=new Select(ele);
		s.selectByIndex(6);
		driver.findElement(By.name("pwd")).sendKeys("Shubham@123");
		driver.findElement(By.name("signup")).click();
		driver.findElement(By.xpath("//i[@class=\"fa-sharp fa-solid fa-right-to-bracket\"]")).click();
		driver.findElement(By.name("name")).sendKeys("Shubham");
		driver.findElement(By.name("pwd")).sendKeys("Shubham@123");
		driver.findElement(By.name("login")).click();
		driver.close();
	}

}
