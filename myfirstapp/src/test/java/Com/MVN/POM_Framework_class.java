package Com.MVN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Framework_class {
	 WebDriver driver;

	public POM_Framework_class(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}

	// Bluestone.com

	@FindBy(xpath = "//ul[@class=\"two-col\"]/descendant::a[@title=\"Diamond Rings\"]")
	WebElement Diamond;
	@FindBy(xpath = "//div/section/span/span[text()='Metal']")
	WebElement Metal;
	@FindBy(xpath = "//span[text()=' Gold ']")
	WebElement Gold;
	@FindBy(xpath = "//*[@id=\"product_list_ui\"]/li[1]/div/div/a[2]/span")
	WebElement Video;
	@FindBy(xpath = "//a[@title=\"Close\"]")
	WebElement Closevideo;
	@FindBy(xpath = "//img[@alt=\"The Ulrika Ring\"]")
	WebElement ClickRing;
	@FindBy(xpath = "//a[text()='Rings ']")
	WebElement RingH;
	@FindBy(xpath = "//span[text()='Price']")
	WebElement Price;
	@FindBy(xpath = "//span[@data-displayname=\"rs 40000 to rs 50000\"]")
	WebElement PriceValue;
	@FindBy(xpath = "//h1[text()=' Diamond Rings ']")
	WebElement Dtext;
	// bluestone 3
	@FindBy(xpath = "//span[@class=\"view-by-wrap title style-outline i-right\"]")
	WebElement Sort;
	@FindBy(xpath = "//a[text()='Popular ']")
	WebElement Popular;
	@FindBy(xpath = "//a[text()='Price Low to High ']")
	WebElement LtoH;
	@FindBy(xpath = "//a[text()='Price High to Low ']")
	WebElement HtoL;
	@FindBy(xpath = "//a[text()='Discount ']")
	WebElement Discount;
	// Bluestone 04
	@FindBy(xpath = "//input[@name=\"search_query\"]")
	WebElement SearchBar;
	@FindBy(xpath = "//input[@value=\"Search\"]")
	WebElement S_Icon;
	@FindBy(xpath = "//input[@id=\"userPincodeStoreTAH\"]")
	WebElement Pincode;
	@FindBy(xpath = "//span[@class=\"filter-item style-fill\"]/ancestor::div[@class=\"middle-filter-blocks tah\"]")
	WebElement TryAtHome;
	@FindBy(xpath = "//span[@class=\"filter-item style-fill\"]/ancestor::div[@class=\"middle-filter-blocks store\"]")
	WebElement DisignInStrore;
	@FindBy(xpath = "//input[@value=\"Submit\"]")
	WebElement submitButton;

	// Bluestone05
	@FindBy(xpath = "//span[@data-p=\"gifts,m\"]")
	WebElement Gift;
	@FindBy(xpath = "//span[@data-p=\"gifts-birthday,m\"]")
	WebElement Birthday;
	@FindBy(xpath = "//span[text()='Price']")
	WebElement HoverPrice;
	@FindBy(xpath = "//span[text()=\" 10,000 \"]")
	WebElement Valuediamond;
	@FindBy(xpath = "//span[text()='Gender']")
	WebElement HoverGender;
	@FindBy(xpath = "//span[text()=' Unisex ']")
	WebElement Unisex;
	@FindBy(xpath = "//span[text()='By Occasion']/ancestor::div[@class=\"top-filter-blocks\"]")
	WebElement byOccation;
	@FindBy(xpath = "//span[@data-displayname=\"party wear\"]")
	WebElement PartyWear;

	// Bluestone06
	@FindBy(xpath = "//a[@title=\"Coins\"]")
	WebElement HoverCoins;
	@FindBy(xpath = "//span[text()=\"Coins by Purity\"]")
	WebElement CoinsByPurity;
	@FindBy(xpath = "//span[text()=\"weight (Gram)\"]")
	WebElement CoinWeight;
	@FindBy(xpath = "//span[text()=\"5 Gram\"]")
	WebElement FiveGrams;
	@FindBy(xpath = "//span[@class=\"title style-fill i-right\"]/descendant::span[text()='Purity']")
	WebElement HoverPurity;
	@FindBy(xpath = "//span[text()='24 Kt']")
	WebElement TwentyfourKT;
	@FindBy(xpath = "//img[@alt=\"1 gram 24 KT Gold Coin\"]")
	WebElement ViewDetails;
	@FindBy(xpath = "//span[text()=\"More Filters\"]")
	WebElement MoreFilterButton;
	@FindBy(xpath = "//span[@data-displayname=\"tulip\"]")
	WebElement Tulip;
	@FindBy(xpath = "//b[@class=\"icon-ion-android-close\"]")
	WebElement Closedbutton;
	// Bluestone 07
	@FindBy(xpath = "//span[@data-p=\"offers,m\"]")
	WebElement OffersBTN;
	@FindBy(xpath = "//span[text()='Up To 20% Off Making Charges']")
	WebElement OfferOne;
	@FindBy(xpath = "//span[@onclick=\"window.location='/jewellery/offers.html'\"]")
	WebElement Alloffers;
	@FindBy(xpath = "//span[text()=\"25% Off your first Gold Mine installment\"]")
	WebElement percent25;

	// Bluestone 01

	public void RingHover() {
		Actions a2 = new Actions(driver);
		a2.moveToElement(RingH).perform();
	}

	public void diamondClick() {
		Diamond.click();
	}

	public void Hover_Metal() {
		Actions a1 = new Actions(driver);
		a1.moveToElement(Metal).perform();
	}

	public void GoldClick() {
		Gold.click();
	}

	public void PlayVideo() {
		Video.click();
	}

	public void closeVideo() {
		Closevideo.click();
	}

	public void ClickRingMetal() {
		ClickRing.click();
	}

	// Bluestone 02
	public void Hoverprice() {
		Actions a2 = new Actions(driver);
		a2.moveToElement(Price).perform();
	}

	public void Price_filter() {
		PriceValue.click();
	}

	public void DiamondText() {
		String text = Dtext.getText();
	}

	// Bluestone 03
	public void Sorting() {
		Actions a4 = new Actions(driver);
		a4.moveToElement(Sort).build().perform();
	}

	public void sort_Popular() {
		Popular.click();
	}

	public void LowToHigh() {
		LtoH.click();
	}

	public void HighToLow() {
		HtoL.click();
	}

	public void sort_Discount() {
		Discount.click();
	}

	// Bluestone 04
	public void searchBox() {
		SearchBar.sendKeys("Nose ring");
	}

	public void search_Icon() {
		S_Icon.click();
	}
	public void pincodetextBox() {
		Pincode.sendKeys("411058");
	}

	public void tryAthome() {
		TryAtHome.click();
	}
	public void SubmitB() {
		submitButton.click();
	}
	public void DesignInstors() {
		DisignInStrore.click();
	}

	// Bluestone 05
	public void hover_Gift() {
		Actions a = new Actions(driver);
		a.moveToElement(Gift).build().perform();
	}

	public void clickBirthday() {
		Birthday.click();
	}

	public void Hover_price() {
		Actions a = new Actions(driver);
		a.moveToElement(HoverPrice).perform();
	}

	public void FourtykTO50k() {
		Valuediamond.click();
	}

	public void Hover_Gender() {
		Actions a1 = new Actions(driver);
		a1.moveToElement(HoverGender).perform();
	}

	public void WoMen_click() {
		Unisex.click();
	}

	public void by_occasion() {
		Actions a3 = new Actions(driver);
		a3.moveToElement(byOccation).perform();
	}

	public void partyWear_Click() {
		PartyWear.click();
	}

//blueston 5
	public void Hover_Coin() {
		Actions a3 = new Actions(driver);
		a3.moveToElement(HoverCoins).perform();
	}

	public void Coins_purity() {
		CoinsByPurity.click();
	}

	public void Hover_Weight() {
		Actions a3 = new Actions(driver);
		a3.moveToElement(CoinWeight).perform();
	}

	public void FiveGms() {
		FiveGrams.click();
	}

	public void Hover_purity() {
		Actions a3 = new Actions(driver);
		a3.moveToElement(HoverPurity).perform();
	}

	public void twentyfour_KTS() {
		TwentyfourKT.click();
	}

	public void Detail_view() {
		ViewDetails.click();
	}
	public void MoreFilterButton() {
		MoreFilterButton.click();
		
	}
	public void tulipButton() {
		Tulip.click();
		
	}
	public void closeMorefilter() {
		Closedbutton.click();
		
	}
	// blueston 6
	public void offersButton() {
		Actions a3 = new Actions(driver);
		a3.moveToElement(OffersBTN).perform();
	}

	public void offersOne() {
		OfferOne.click();
	}

	public void offerAll() {
		Alloffers.click();
	}

	public void percentTwentyfive() {
		percent25.click();
	}
	

}
