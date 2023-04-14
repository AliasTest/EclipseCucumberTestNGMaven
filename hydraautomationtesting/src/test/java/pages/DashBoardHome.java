package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardHome {

	WebDriver driver;

	public DashBoardHome(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	public WebElement dashBoardWelcomeMessage(String firstName, String lastName) {
		String Xpath = "//*[(normalize-space()='Hello " + firstName + " " + lastName+"')][@class='dashboard_title__ldMnO']";
		return driver.findElement(By.xpath(Xpath));
	}

	@FindBy(xpath = "//h3[contains (text(), 'Channels')]")
	public WebElement channelsHeading;

	@FindBy(xpath = "//div[@class='dashboard_channelHeader__LIBmx']/button[@aria-label='View All']")
	public WebElement channelsViewAllButton;

	@FindBy(xpath = "//button[@aria-label='Create Workspace']")
	public WebElement createWorksSpaceButton;

	@FindBy(xpath = "//div[@class='dashboard_alertBoxWeb__wFuoN']//div[@class='dashboard_alertTitle__ehoH6'][normalize-space()='1 user license has been used']")
	public WebElement licenceUsedFooter;
	
	//ADDED BY ASHWIN
	@FindBy(xpath = "//h2[contains(text(),'No profiles found')]//following::button[1]")
	public WebElement newAuthButton;	
	
	@FindBy(xpath = "//a[contains(text(),'My Profile')]")
	public WebElement myProfileSelector;
	
	@FindBy(xpath = "//button[@aria-label='Open Profile']")
	public WebElement profileButton;
	}