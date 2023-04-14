package utility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.UserManagement;

public class HydraCommon {

	public HydraCommon(WebDriver driver) {
		this.driver = driver;
	}
	
	private WebDriverWait wait;
	private WebDriver driver;
	UserManagement userManagement = new UserManagement(driver);
	int userRowNumber;
	int rowNumber;

	public void captchaClick() throws InterruptedException {
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(
				"//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='recaptcha-checkbox-border']")))
				.click();
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
	}

	public int getRowNumberAdminUserListed(String emailToVerify) throws InterruptedException
	{
		Thread.sleep(5000);
		List<WebElement> users=driver.findElements(By.xpath("//tbody/tr/td[1]/div[1]"));
		//List<WebElement> users=userManagement.userManagementListRow;
		rowNumber = 1;
		for (WebElement userManagementRow : users) {
			String myText = userManagementRow.getText();
			if (myText.contains(emailToVerify)) {
				userRowNumber = rowNumber;
			}
			rowNumber++;
		}
		return userRowNumber;
	}
}
