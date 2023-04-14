package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GoogleMerchantCenterViewChannel {
	
	WebDriver driver;

	public GoogleMerchantCenterViewChannel(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[contains(text(),'Add User')]")
	public WebElement addUserButton;
	
	@FindBy(xpath="//div[text()='Google Analytics']//following::div[2]")
	public WebElement viewChannelButton;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement emailField;
	
	@FindBy(xpath="//button[contains(text(),'Add User')]")
	public WebElement addUserFinalButton;
	
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	public WebElement cancelfinalButton;
	
	@FindBy(xpath="//div[@class='hydra-dropdown__input-container css-ackcql']")
	public Select dropDownSelector;

	@FindBy(xpath="//div[text()='Hi Hydra']")
	public WebElement merchantChannelName;


}
