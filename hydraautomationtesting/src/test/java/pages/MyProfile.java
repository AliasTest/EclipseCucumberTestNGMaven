package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfile {

	WebDriver driver;

	public MyProfile(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}	
		
	@FindBy(xpath = "//button[@aria-label='Open Profile']")
	public WebElement profileButton;
	@FindBy(xpath = "//a[contains(text(),'My Profile')]")
	public WebElement myProfileSelector;

}