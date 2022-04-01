package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class allElements {
	
	public allElements (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//Navigate to Hotel
	
	@FindBy(linkText = "Hotels")
	WebElement hotelBtn;
	
	public void clickHotelBtn () {
		hotelBtn.click();
	}
	
	//Search Switzerland
	
	//@FindBy (xpath = "/html[1]/body[1]/div[3]/div[1]/form[1]/input[1]")
	//@FindBy (xpath = "//input[@placeholder='Where to?']")
	//@FindBy (className = "fhEMT _G B- z _J Cj R0")
	//@FindBy (xpath = "//input[@class='fhEMT _G B- z _J Cj R0']//following::form[1]/input[1]")
	@FindBy (xpath = "//div[contains(@data-test-attribute,'HOTELS')]//input[@type='search']")
	
	WebElement searchLocation;
	
	public void searchDestination () {
		//searchLocation.getAttribute("placeholder");
		searchLocation.sendKeys("Switzerland");
	}
	
	//Select Search Result
	
	//@FindBy (xpath = "//body/div[3]/div[1]/form[1]/div[1]/a[1]")
	@FindBy (xpath = "//div[contains(text(),'Europe')]")
	//@FindBy (xpath = "//body/div[3]/div[1]/form[1]/div[1]/a[1]/div[2]/div[1]")
	WebElement selectLocation;
	
	public void selectDestination () {
		selectLocation.click();
	}
	
	//Select May Month for Check in Date
	
	@FindBy (xpath = "//body/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]")
	WebElement MayMonthSelect;
	
	public void selectMayMonth () {
		MayMonthSelect.click();
	}
	
	//Select Check In Date
	
	@FindBy (xpath = "//div[contains(@aria-label,'Mon May 02 2022')]")
	WebElement CheckInDate;
	
	public void selectCheckInDate () {
		CheckInDate.click();	
	}
	
	//Select Check Out Date
	
	@FindBy (xpath = "//div[contains(@aria-label,'Thu May 05 2022')]")
	WebElement CheckOutDate;
		
	public void selectCheckOutDate () {
		CheckOutDate.click();	
	}
	
	//Select 1 Children
	
	@FindBy (xpath = "//button[contains(@data-test-target, 'ticker-plus-children')]")
	WebElement AddChildren;
	
	public void addChild () {
		AddChildren.click();
	}
	
	//Extend Children Age Dropdown
	
	@FindBy (xpath = "//button[contains(@data-automation, 'child0')]")
	WebElement ChildAgeDropDown;
	
	public void ExtendAgeDropDown () {
		ChildAgeDropDown.click();
	}
	
	//Select Age
	
	@FindBy (xpath = "//button[.='1']")
	WebElement Age;
	
	public void SelectAge () {
		Age.click();
	}
	
	//Update Info
	
	@FindBy (xpath = "//div[contains(@data-automation, 'guestsUpdateBtn')]")
	WebElement UpdateBtn;
	
	public void UpdateInfo () {
		UpdateBtn.click();
	}
	
	//Scroll to Hotel Class Section
	
	//@FindBy (xpath = "//div[contains(@data-automation, 'checkbox')]//input[contains(@id, 'checkbox_17')]")
	//@FindBy (xpath = "//span[.='2 stars']")
	@FindBy (xpath = "//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/div[1]/div[4]/span[1]/div[1]/label[1]/span[1]")
	WebElement sctwoStars;
	
	public void schotelClass (WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sctwoStars);
		Thread.sleep(500);
		//twoStars.click();
	}
	
	//Update Hotel Class
	
	@FindBy (xpath = "//span[.='2 stars']")
	WebElement twoStars;
	
	public void updateHotelClass ( ) {
		twoStars.click();
	}
	
	//Scroll to top
	
	@FindBy (xpath = "//h1[contains(@data-test-target, 'main_h1')]")
	WebElement top;
	
	public void scTop (WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", top);
		Thread.sleep(500);
		
	}
	
	//Get First Hotel Name
	
	@FindBy (linkText = "Hotel Roessli")
	WebElement FirstHotel;
	
	public void getHotelName () {
		FirstHotel.getText();
		System.out.println("First Hotel is: "+FirstHotel);
	}
	
}
