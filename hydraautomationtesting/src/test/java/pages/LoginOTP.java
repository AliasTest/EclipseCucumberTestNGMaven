package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.WebDriverLibrary;

public class LoginOTP extends WebDriverLibrary {

	WebDriver driver;	
	public LoginOTP(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath = "//input")
	public List<WebElement> otpInputs;	
	
	public void EnterotpInputs(String otp1, String otp2, String otp3, String otp4) throws InterruptedException
	{
		Thread.sleep(3000);
		sendKeyElements(otpInputs.get(0),otp1);		
		Thread.sleep(3000);
		sendKeyElements(otpInputs.get(1),otp2);	
		Thread.sleep(3000);
		sendKeyElements(otpInputs.get(2),otp3);		
		Thread.sleep(3000);
		sendKeyElements(otpInputs.get(3),otp4);	
		Thread.sleep(3000);		
	}
}
	