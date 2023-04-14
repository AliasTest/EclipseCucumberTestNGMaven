package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Worksapce {

	WebDriver driver;

	public Worksapce(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='workspaceName']")
	public WebElement workspaceName;

	@FindBy(xpath = "//div[@draggable='true']")
	public WebElement channelDragLocation;

	@FindBy(xpath = "//div[@class='flex h-full w-full flex-col items-center justify-start']")
	public WebElement channelDropLocation;

	@FindBy(xpath = "//button[@aria-label='Save button']")
	public WebElement saveWorkspace;
	
	@FindBy(xpath = "//button[@aria-label='Cancel']")
	public WebElement cancelWorkspace;
	
	@FindBy(xpath = "//button[@aria-label='add user button']")
	public WebElement addUsersOnCreateWorkspace;
		
	@FindBy(xpath = "//div[@class='dashboard_btnWrapper__eNgdf']//button[@aria-label='View All']")
	public WebElement worksSpaceViewAllButton;
	
	@FindBy(xpath ="//input[@id='mailID']")
	public WebElement viewerMailID;
	
	@FindBy(xpath ="//button[text()='Viewers']")
	public WebElement viewersButton;
	
	@FindBy(xpath ="//button[normalize-space()='Add to workspace']")
	public WebElement addToWorkSpace;	
	
	@FindBy(xpath ="//div[@data-testid='workspacelist_naviagte_id']")
	public WebElement viewWorkSpace;		
	
	public WebElement selectAUserOnWorkspaceCretion(String firstName, String lastName) {
		String Xpath = "//input[contains(@id,'"+firstName + lastName+"')]";
		return driver.findElement(By.xpath(Xpath));
	}
	
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement submitButtonOnAddUsersForCreateWorkspace;
	
	public WebElement workspaceDisplayed(String workspaceName) {
		String Xpath = "//div[text()='" + workspaceName+"']";
		return driver.findElement(By.xpath(Xpath));
	}	
	
	@FindBy(xpath ="//span[normalize-space()='Edit Workspace']")
	public WebElement editWorkspace;
	
	public WebElement workspaceDisplayedForViewer(String workspaceName) {
		String Xpath = "(//div[text()='" + workspaceName+"'])[2]";
		return driver.findElement(By.xpath(Xpath));
	}
	public WebElement workspaceDisplayedOnViewAll(String workspaceName) {
		String Xpath = "//div[@class='flex items-center border-b border-white200 p-4 md:hidden']//div[text()='" + workspaceName+"']";
		return driver.findElement(By.xpath(Xpath));
	}
	
	//ADDED BY ASHWIN
	public WebElement channelNameDisplayed(String channelName) {
		String Xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='"+ channelName+"']";
		return driver.findElement(By.xpath(Xpath));
	}
	

}