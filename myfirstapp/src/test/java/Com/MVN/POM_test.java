package Com.MVN;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POM_test {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		POM_class test=new POM_class(driver);
		test.enterusername("SHubham");
		test.enterPassword("Passwor@123");
		test.loginButton();

	}

}
