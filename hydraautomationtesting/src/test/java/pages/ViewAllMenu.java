package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAllMenu {
	
	WebDriver driver;
	public ViewAllMenu(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
		

	@FindBy(xpath = "//button[@class='btn-link dashboard_viewAll__9fvw4'][text()='View All']")
	public WebElement viewAllButton;
	
	@FindBy(xpath = "//div[contains(text(),' Channels')]")
	public WebElement totalChannelCount;
	
	//used to call webElements and add to a list for counting
	@FindBy(xpath = "//div[@class='channel_channelTitle__YXzEZ']")
	public WebElement totalChannelList;
	
	
	public WebElement workspaceChannel(String channelName) {
		String Xpath = "//div[@class='channel_channelTitle__YXzEZ'][text()='"+channelName+"']";
		return driver.findElement(By.xpath(Xpath));
	}
	
	public List<WebElement> workspaceChannelList(){
		
		List<WebElement> listOfElements = driver.findElements(By.xpath("//div[@class='channel_channelTitle__YXzEZ']"));
		
		return listOfElements;
		
	}
	
	public WebElement channelViewButton(String channelName) {
		String Xpath = "//div[@class='channel_channelTitle__YXzEZ'][text()='"+channelName+"']//following::div[2]";
		return driver.findElement(By.xpath(Xpath));
	}
	
	

	
	
}
