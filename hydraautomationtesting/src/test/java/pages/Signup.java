package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Signup {

	WebDriver driver;	
	public Signup(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='firstName']")
	public WebElement firstName;	
	
	@FindBy(xpath = "//input[@id='lastName']")
	public WebElement lastName;	
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement email;	
	
	@FindBy(xpath = "//div[@id='countryCode']")
	public WebElement countryCode;	
	
	@FindBy(xpath = "//input[@id='phone']")
	public WebElement phone;	
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;	
	
	@FindBy(xpath = "//input[@id='confirmPassword']")
	public WebElement confirmPassword;	
	
	@FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
	public WebElement captchaCheckBox;	
		
	@FindBy(xpath = "//button[text()='Signup']")
	public WebElement signupButton;	
	
	@FindBy(xpath = "//button[text()='Reset']")
	public WebElement resetButton;	
	
	@FindBy(xpath = "//button[text()='Make Payment']")
	public WebElement makePayment;	
	
	@FindBy(xpath = "//h2[text()='team']//following::button[1]")
	public WebElement buyPlanButton;
	
	@FindBy(xpath = "//h2[text()='team']//following::button[1]")
	public WebElement teamsBuyPlanButton;
	@FindBy(xpath = "//div[contains(text(),'Pay with card')]//following::button")
	public WebElement subscribeButton;
	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailField;
	@FindBy(xpath = "//input[@id='cardNumber']")
	public WebElement cardNumber;
	@FindBy(xpath = "//input[@id='cardExpiry']")
	public WebElement expDate;
	@FindBy(xpath = "//input[@id='cardCvc']")
	public WebElement CVC;
	@FindBy(xpath = "//input[@id='billingName']")
	public WebElement nameOnCard;
	@FindBy(xpath = "//select[@id='billingCountry']")
	public WebElement countryDropdown;
	@FindBy(xpath = "//input[@id='billingAddressLine1']")
	public WebElement addressLine;
	@FindBy(xpath = "//input[@id='billingLocality']")
	public WebElement cityLine;
	@FindBy(xpath = "//input[@id='billingPostalCode']")
	public WebElement zipLine;
	@FindBy(xpath = "//select[@id='billingAdministrativeArea']")
	public WebElement stateLine;
}