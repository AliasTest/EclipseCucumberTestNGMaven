package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedIn {

	WebDriver driver;	
	public LinkedIn(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='username']")
	public WebElement loginlUserName;	
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement loginPassword;
	
	@FindBy(xpath = "//button[@aria-label='Sign in']")
	public WebElement loginSignIn;	
}