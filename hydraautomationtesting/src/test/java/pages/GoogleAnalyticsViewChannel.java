package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GoogleAnalyticsViewChannel {

	WebDriver driver;

	public GoogleAnalyticsViewChannel(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Add User')]")
	public WebElement addUserButton;

	@FindBy(xpath = "//div[text()='Google Analytics']//following::div[2]")
	public WebElement viewChannelButton;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailField;

	@FindBy(xpath = "//input[@class='hydra-dropdown__input']")
	public WebElement addUserRole;

	@FindBy(xpath = "//button[contains(text(),'Add User')]")
	public WebElement addUserFinalButton;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	public WebElement cancelfinalButton;

	@FindBy(xpath = "//input[@id='react-select-6-input']")
	public WebElement dropDownSelectorAnalytics;

	@FindBy(xpath = "//label[contains(text(),'Standard roles')]//following::div[7]")
	public WebElement dropDownbuttonRoles;

	@FindBy(xpath = "//label[contains(text(),'Email Address')]//following::div[9]")
	public WebElement dropDownSelector;

	@FindBy(xpath = "//div[text()='Google Ads Account']")
	public WebElement googleAnalyticsChannelName;

	@FindBy(xpath = "//div[@class='hydra-dropdown__input-container css-ackcql']//following::input[2]")
	public WebElement dataRestrictions;

	public WebElement emailEntry(String email) {
		String Xpath = "//div[text()='" + email + "']";
		return driver.findElement(By.xpath(Xpath));
	}

}
