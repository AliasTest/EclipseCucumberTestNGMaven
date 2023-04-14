package stepDefenitionUI;

import utility.ConfigFileReader;
import utility.WebDriverLibrary;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Gmail;
import pages.UserManagement;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;

public class GmailNavigationSteps extends WebDriverLibrary {
	public String uRL;
	public String gmailUsername;
	public String gmailPassword;
	public ArrayList<String> tabs;
	ConfigFileReader configFileReader = new ConfigFileReader();
	Gmail gmail = new Gmail(driver);
	UserManagement userManagement = new UserManagement(driver);

	@Given("Login Google")
	public void login() throws IOException, InterruptedException {
		Thread.sleep(3000);
		try {
			gmailUsername = configFileReader.getProprtyUrl("gmail3Username");
			gmailPassword = configFileReader.getProprtyUrl("gmail2Password");
			sendKeyElements(gmail.gmailUserName, gmailUsername);
			clickOnElementAfterLoad(gmail.gmailSignInNext);
			sendKeyElements(gmail.gmailPassword, gmailPassword);
			clickOnElementAfterLoad(gmail.gmailSignInNext);
			/*
			 * clickOnElementAfterLoad(gmail.continueGmail); Thread.sleep(2000); Actions act
			 * = new Actions(driver); act.sendKeys(Keys.PAGE_DOWN).build().perform(); //
			 * Page Down Thread.sleep(2000); clickOnElementAfterLoad(gmail.continueGmail);
			 */
		} catch (Exception e) {
		}
	}

	@Given("Login Google page")
	public void login_Page() throws IOException, InterruptedException {
		Thread.sleep(3000);
		try {
			gmailUsername = configFileReader.getProprtyUrl("gmailUsername");
			gmailPassword = configFileReader.getProprtyUrl("gmailPassword");
			sendKeyElements(gmail.gmailUserName, gmailUsername);
			clickOnElementAfterLoad(gmail.gmailSignInNext);
			sendKeyElements(gmail.gmailPassword, gmailPassword);
			clickOnElementAfterLoad(gmail.gmailSignInNext);
		} catch (Exception e) {
		}
	}

	@Given("Navigate to gmail page")
	public void navigate() throws IOException, InterruptedException, AWTException {
		Robot robot = new Robot();
		robot.delay(7000);
		uRL = configFileReader.getProprtyUrl("gmailUrl");
		robot.delay(7000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.delay(7000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		robot.delay(7000);
		tabs = new ArrayList<String>(driver.getWindowHandles());
		robot.delay(9000);
		driver.switchTo().window(tabs.get(1));
		robot.delay(8000);
		driver.get(uRL);
	}

	@Given("Open the first email")
	public void open_the_first_email() throws InterruptedException {
		Thread.sleep(10000);
		//a[text()='Sign in']
		clickOnElementAfterLoad(gmail.firstEmail);
	}

	@Given("Click on the amazon verification link")
	public void click_on_the_amazon_verification_link() throws InterruptedException {
		Thread.sleep(8000);
		clickOnElementAfterLoad(gmail.emailAmazonLinkToClick);
		Thread.sleep(3000);
	}

	@Given("Close the opened tabs except the hydra application")
	public void close_the_opened_tabs_except_the_hydra_application() throws InterruptedException {
		tabs = new ArrayList<String>(driver.getWindowHandles());
		for (int i = driver.getWindowHandles().size() - 1; i > 0; i--) {
			driver.switchTo().window(tabs.get(i));
			driver.close();
		}
		driver.switchTo().window(tabs.get(0));
		driver.navigate().refresh();
		String s = driver.getTitle();
		Thread.sleep(2000);
		tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(2000);
	}

	@Then("Verify the admin user added link")
	public void verify_the_admin_user_added_link() throws InterruptedException {
		Thread.sleep(5000);
		try {
			clickOnElementAfterLoad(gmail.showTrimmedContent);
		} catch (Exception ex) {
		}
		Thread.sleep(6000);
		clickOnElementAfterLoad(gmail.hydraEmailVerificationLink);
		Thread.sleep(4000);
	}
}
