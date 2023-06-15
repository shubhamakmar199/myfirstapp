package Com.MVN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_class {
	WebDriver driver;

	public POM_class(WebDriver d) {
		driver=d;
		
	}

	By username=By.id("user-name");
	By pass=By.id("password");
	By login=By.id("login-button");
	
	public void enterusername(String Uname) {
		driver.findElement(username).sendKeys(Uname);
	}
	public void enterPassword(String password) {
		driver.findElement(pass).sendKeys(password);
	}
	public void loginButton() {
		driver.findElement(login).click();
	}

}
