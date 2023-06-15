package Com.MVN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Jequery_class {
	WebDriver driver;

	public POM_Jequery_class(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
	}
	// Jquery
	@FindBy(id = "draggable")
	WebElement drag;
	@FindBy(id = "droppable")
	WebElement drop;
	@FindBy(xpath = "//*[@id=\"content\"]/iframe")
	WebElement Iframe;
	@FindBy(xpath = "//*[@id='content']/iframe")
	WebElement Iframe2;
	@FindBy(xpath = "//div[@id=\"resizable\"]/descendant::div[@class=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\"]")
	WebElement Resize;
	
	public void Iframe_handles() {
		driver.switchTo().frame(Iframe);

	}

	public void Boxdrag() {
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).build().perform();
	}

	public void Iframe_handlesA() {
		driver.switchTo().frame(Iframe2);

	}

	public void Resizable() {
		Actions a = new Actions(driver);
		a.dragAndDropBy(Resize, 300, 100).perform();
	}
	

}
