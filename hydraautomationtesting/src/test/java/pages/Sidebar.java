package pages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sidebar {

	WebDriver driver;
	List<String> sideBarChannelTexts = new ArrayList<>();

	public Sidebar(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='header_navItem__i5KA2'][@aria-label='Home']")
	public WebElement dashBoard;
			
	@FindBy(xpath = "//div[@class='header_closeHeader__qTS0C']//following::a[1]")
	public WebElement dashBoard2;

	@FindBy(xpath = "//span[text()='Report']")
	public WebElement trends;

	@FindBy(xpath = "//a[@aria-label='Messaging']")
	public WebElement messaging;

	@FindBy(xpath = "//a[@aria-label='User']")
	public WebElement user;

	@FindBy(xpath = "//button[@aria-label='Open menu'][@class='header_menuIcon__TY184']")
	public WebElement openCloseSideBarMenu;

	@FindBy(xpath = "//span[text()='User Management']")
	public WebElement userManagementScreenTitle;

	@FindBy(xpath = "//div[@class='channel_title__yoRgx']")
	public List<WebElement> sideBarChannelsList;	
	
	@FindBy(xpath = "//button[@class='absolute top-4 right-4 z-10 text-gray-dark1']")
	public WebElement closeChannelAddedMessage;	

	public WebElement sideBarChannelsListAddChannelButton(String channelName) {
		String Xpath = "//div[contains(text(),'" + channelName + "')]/..//button[@aria-label='Add the Channel']";
		return driver.findElement(By.xpath(Xpath));
	}

	public Collection<String> getSideBarChannelList() {
		for (WebElement sideBarChannel : sideBarChannelsList) {
			sideBarChannelTexts.add(sideBarChannel.getText());
		}
		return sideBarChannelTexts;
	}
}