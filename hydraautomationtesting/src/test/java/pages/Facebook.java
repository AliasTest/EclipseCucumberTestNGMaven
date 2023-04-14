package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	
	WebDriver driver;	
	public Facebook(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath = "//input[@id='email']")
	public WebElement loginlEmail;	
	
	@FindBy(xpath = "//input[@id='pass']")
	public WebElement loginPassword;
	
	@FindBy(xpath = "//button[@id='loginbutton']")
	public WebElement loginSignIn;	
}
