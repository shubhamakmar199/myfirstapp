package Com.MVN;

import javax.xml.xpath.XPath;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Goibibo_class {
	WebDriver driver;

	public POM_Goibibo_class(WebDriver d) {
	
		driver = d;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@class=\"HomePageAutosuggeststyles__SearchInputStyles-sc-1v6s32j-1 euhecC\"]") WebElement Searchbar;
	@FindBy(xpath = "//p[text()='Mysore']") WebElement clickCity;
	@FindBy(xpath = "//input[@id='search-widget-checkin-input']") WebElement CheckIN;
	@FindBy(xpath = "//li[@data-testid=\"date_li_12_5_2023\"]") WebElement dateIn;
	@FindBy(xpath = "//li[@data-testid=\"date_li_16_5_2023\"]") WebElement dateOut;
	@FindBy(xpath = "//div[@class=\"SearchWidgetUIstyles__PaxWrapperStyle-sc-1pb2jm7-4 kRnkxX\"]/input") WebElement Guest_room;
	@FindBy(xpath = "//span[@data-testid='button-adult-add']") WebElement Adult;
	@FindBy(xpath = "//span[@data-testid=\"button-child-add\"]") WebElement Child;
	@FindBy(xpath = "//h4[text()='Select']") WebElement Age;
	@FindBy(xpath = "//li[text()='4']") WebElement Agevalue;
	@FindBy(xpath = "//button[text()='Done']") WebElement DoneButton;
	@FindBy(xpath = "//button[text()='UPDATE SEARCH']") WebElement Update;
	@FindBy(xpath = "//div[@class=\"HotelCardstyles__ImageGalleryWrapperDiv-sc-1s80tyk-2 kWNbWZ\"]/div") WebElement ClickHotel;

	
	public void setSearchbar() {
		Searchbar.click();
	}
	
	public void setClickCity() {
		clickCity.click();
	}
	
	public void setCheckIN() {
		CheckIN.click();
	}
	
	public void setDateIn() {
		dateIn.click();
	}
	
	public void setDateOut() {
		dateOut.click(); 
	}
	
	public void setGuest_room() {
		Guest_room.click();
	}
	
	public void setAdult() {
		Adult.click();
	}
	
	public void setChild() {
		Child.click();
	}
	
	public void setAge() {
		Age.click();
	}
	
	public void setAgevalue() {
		Agevalue.click();
	}
	
	public void setDoneButton() {
		DoneButton.click();
	}
	
	public void setUpdate() {
		Update.click();
	}
	
	public void setClickHotel() {
		ClickHotel.click();
	}
	
	
	


}
