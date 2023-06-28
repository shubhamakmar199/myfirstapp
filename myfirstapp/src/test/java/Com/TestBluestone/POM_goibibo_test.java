package Com.TestBluestone;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import Com.MVN.POM_Goibibo_class;
import io.github.bonigarcia.wdm.WebDriverManager;

public class POM_goibibo_test {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/hotels/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		POM_Goibibo_class pom = new POM_Goibibo_class(driver);
		pom.setSearchbar();
		Thread.sleep(1000);
		pom.setClickCity();
		pom.setCheckIN();
		pom.setDateIn();
		pom.setDateOut();
		pom.setGuest_room();
		pom.setAdult();
		pom.setChild();
		pom.setAge();
		pom.setAgevalue();
		Thread.sleep(1000);
		pom.setDoneButton();
		pom.setUpdate();
		pom.setClickHotel();
		driver.close();
//		driver.get("https://www.goibibo.com/hotels/");

	}

}
