package pages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagement {

	WebDriver driver;
	List<String> userManagementTitleTexts = new ArrayList<>();

	public UserManagement(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[normalize-space()='Add User']")
	public WebElement addUser;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement userEmail;

	@FindBy(xpath = "//button[text()='Add User']")
	public WebElement addUserButton;

	@FindBy(xpath = "//button[text()='Cancel']")
	public WebElement cancelAddUserButton;

	@FindBy(xpath = "//button[@class='absolute top-4 right-4 z-10 text-white']")
	public WebElement addUserMessageClose;

	public WebElement userManagementScreenUserAddedName(int userRowNumber)
	{
		String Xpath = "//table/tbody/tr[" + (userRowNumber+1)+"]/td[1]";
		return driver.findElement(By.xpath(Xpath));	
	}

	@FindBy(xpath = "//table/thead/tr/th/button")
	public List<WebElement> userManagementPageTableTitles;

	@FindBy(xpath = "//span[text()='Suspend all users']")
	public WebElement suspendAllUsers;

	@FindBy(xpath = "//table/tbody/tr[2]/td[3]/div")
	public WebElement createdByUserFirst;

	@FindBy(xpath = "//table/tbody/tr[2]/td[3]/div/span")
	public WebElement createdByUserSecond;

	@FindBy(xpath = "//tbody/tr/td[1]/div[1]")
	public List<WebElement> userManagementListRowToupdate;	

	public Collection<String> getuserManagementPageTableTitles() {
		userManagementTitleTexts.clear();
		for (WebElement userManagementTitle : userManagementPageTableTitles) {
			userManagementTitleTexts.add(userManagementTitle.getText());
		}
		return userManagementTitleTexts;
	}

	public WebElement userManagementScreenUserVerificationStatusElement(int userRowNumber)
	{
		String Xpath = "//table/tbody/tr[" + userRowNumber+"]/td[4]";
		return driver.findElement(By.xpath(Xpath));	
	}
}
