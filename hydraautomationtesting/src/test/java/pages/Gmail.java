package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail {

	WebDriver driver;	
	public Gmail(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@type='email']")
	public WebElement gmailUserName;	
	
	@FindBy(xpath = "//*[@type='password']")
	public WebElement gmailPassword;	
	
	@FindBy(xpath = "//span[text()='Next']")
	public WebElement gmailSignInNext;
	
	@FindBy(xpath = "//div[@class='Cp']//tbody/tr[1]")
	public WebElement firstEmail;
	
	@FindBy(xpath = "//a[contains(@href, 'https://email-verification')]")
	public WebElement emailAmazonLinkToClick;	
	
	@FindBy(xpath = "//button[text()=' Get Started ']")
	public WebElement hydraEmailVerificationLink;
	
	@FindBy(xpath = "//img[@class='ajT']")
	public WebElement showTrimmedContent;
	
	@FindBy(xpath = "//span[text()='Continue']")
	public WebElement continueGmail;	
	
}