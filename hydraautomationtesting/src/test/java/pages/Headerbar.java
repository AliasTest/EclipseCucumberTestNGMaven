package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Headerbar {

	WebDriver driver;	
	public Headerbar(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@aria-label='Open Profile']")
	public WebElement OpenProfile;
	
	@FindBy(xpath = "//a[text()='My Profile']")
	public WebElement MyProfile;
	
	@FindBy(xpath = "//button[@aria-label='Alert Notifications']")
	public WebElement AlertNotifications;
	
	@FindBy(xpath = "//button[@aria-label='Search Bar toggle']")
	public WebElement SearchBarToggle;
	
	@FindBy(xpath = "//h2[text()='Notifications']")
	public WebElement NotificationsScreen;
	
	@FindBy(xpath = "//input[contains(@placeholder,'search')]")
	public WebElement SerachPlaceHolder;
	
	@FindBy(xpath = "//button[@aria-label='Support']")
	public WebElement Support;
	
	@FindBy(xpath = "//span[text()='Frequently Asked Questions']")
	public WebElement FrequentlyAskedQuetions;	
	
	@FindBy(xpath = "//button[contains(@class, ' text-gray-dark1')]")
	public WebElement CloseNotifications;	
}