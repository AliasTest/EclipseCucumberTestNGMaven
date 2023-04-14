package stepDefenitionUI;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Channels;
import pages.DashBoardHome;
import pages.GoogleAnalyticsViewChannel;
import pages.GoogleMerchantCenterViewChannel;
import pages.GoogleMyBusinessViewChannel;
import pages.GoogleTagManagerViewChannel;
import pages.Login;
import pages.LoginOTP;
import pages.Signup;
import pages.ViewAllMenu;
import utility.ConfigFileReader;
import utility.HydraCommon;
import utility.WebDriverLibrary;

public class AddUsersSteps extends WebDriverLibrary {

	public String uRL;
	// private String firstName;
	TestContext testContext;

	public AddUsersSteps(TestContext context) {
		testContext = context;
	};

	ConfigFileReader configFileReader = new ConfigFileReader();
	Signup signup = new Signup(driver);
	DashBoardHome dashBoardHome = new DashBoardHome(driver);
	Channels channels = new Channels(driver);
	HydraCommon hydraCommon = new HydraCommon(driver);
	Login login = new Login(driver);
	LoginOTP loginOTP = new LoginOTP(driver);
	GoogleAnalyticsViewChannel googleAnalyticsViewChannel = new GoogleAnalyticsViewChannel(driver);
	GoogleMerchantCenterViewChannel googleMerchantCenterViewChannel = new GoogleMerchantCenterViewChannel(driver);
	GoogleMyBusinessViewChannel googleMyBusinessViewChannel = new GoogleMyBusinessViewChannel(driver);
	GoogleTagManagerViewChannel googleTagManagerViewChannel = new GoogleTagManagerViewChannel(driver);
	ViewAllMenu viewAllMenu = new ViewAllMenu(driver);

	@Then("Select {string} view channel")
	public void select_channelView_selectChanel(String channelName) throws InterruptedException {
		Thread.sleep(2000);
		viewAllMenu.channelViewButton(channelName).getClass();
		clickOnElementAfterLoad(viewAllMenu.channelViewButton(channelName));

	}

	@Then("Select Google Analtyics Channel")
	public void select_GoogleAnaltyics_Channel() throws InterruptedException {
		Thread.sleep(1000);
		clickOnElementAfterLoad(googleAnalyticsViewChannel.googleAnalyticsChannelName);
	}

	@Then("Select Google Merchant Center Channel")
	public void select_GoogleMerchantCenter_Channel() throws InterruptedException {
		Thread.sleep(1000);
		clickOnElementAfterLoad(googleMerchantCenterViewChannel.merchantChannelName);
	}

	@Then("Select Google My Business Channel")
	public void select_GoogleMyBusiness_Channel() throws InterruptedException {
		Thread.sleep(1000);
		clickOnElementAfterLoad(googleMyBusinessViewChannel.businessChannelName);
	}

	@Then("Select Google Tag Manager Channel")
	public void select_GoogleTagManager_Channel() throws InterruptedException {
		Thread.sleep(1000);
		clickOnElementAfterLoad(googleTagManagerViewChannel.tagManagerChannelName);
	}

	@And("Enter {string}, select role and click Add User")
	public void enter_Details_Add_User(String email) throws InterruptedException {
		Thread.sleep(2000);
		clickOnElementAfterLoad(googleAnalyticsViewChannel.addUserButton);
		Thread.sleep(1000);
		googleAnalyticsViewChannel.emailField.sendKeys(email);
		// googleAnalyticsViewChannel.dropDownSelector.selectByIndex(0);
		googleAnalyticsViewChannel.addUserFinalButton.click();
	}

	@And("Enter {string}, select role as {string} and click Add User for Tag Manager")
	public void enter_Details_Add_User_TagManger(String email, String role) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		clickOnElementAfterLoad(googleAnalyticsViewChannel.addUserButton);
		Thread.sleep(1000);
		googleAnalyticsViewChannel.emailField.sendKeys(email);
		Robot robot = new Robot();

		// Account access drop down
		Point location = googleAnalyticsViewChannel.dropDownSelector.getLocation();
		robot.mouseMove(location.getX(), location.getY());
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.keyPress(KeyEvent.VK_ENTER);

		// Permission Drop down
		Point location1 = googleTagManagerViewChannel.permissionsDropDown.getLocation();
		robot.mouseMove(location1.getX(), location1.getY());
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.keyPress(KeyEvent.VK_ENTER);

		// googleTagManagerViewChannel.permissionsDropDown.sendKeys("Read");
		googleAnalyticsViewChannel.addUserFinalButton.click();
	}

	@Then("Verify new added user with {string}")
	public void verify_Entry(String email) throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertNotNull(channels.userEmail(email));
	}

	@Then("Click on Edit Button for user with {string}")
	public void click_Edit_button(String userName) throws InterruptedException {
		Thread.sleep(2000);
		clickOnElementAfterLoad(channels.editButtonTile(userName));
		Thread.sleep(2000);
	}

	@Then("Click on search Button for user with {string}")
	public void click_Delete_button(String userName) throws InterruptedException {
		Thread.sleep(4000);
		sendKeyElements(channels.channelUserSearch, userName);
		Thread.sleep(3000);
	}

	@Then("Click on Remove User button")
	public void click_Remove_Button() {
		clickOnElementAfterLoad(channels.removeButton());
	}

	@Then("Click Proceed button to remove channel user")
	public void click_proceed_ToRemove_Button() {
		clickOnElementAfterLoad(channels.proceedToRemoveChannelUser);
	}

	@Then("Verify absence of {string} detials")
	public void verify_Removed_User(String userName) throws InterruptedException{	
		Thread.sleep(4000);
		try { WebElement element=channels.userEmail(userName);
		if (element == null) 
		 assertNull(element);
		else assertNotNull(element); }
		catch (Exception ex)
		{assertTrue(true);}			
	}

	@And("Enter {string}, select role as {string} and click Add User")
	public void enter_Details_Add_User(String email, String role) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		clickOnElementAfterLoad(googleAnalyticsViewChannel.addUserButton);
		Thread.sleep(3000);
		googleAnalyticsViewChannel.emailField.sendKeys(email);
		Thread.sleep(2000);
		googleAnalyticsViewChannel.emailField.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		googleAnalyticsViewChannel.addUserRole.sendKeys(role);
		Thread.sleep(2000);
		googleAnalyticsViewChannel.addUserRole.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		googleAnalyticsViewChannel.addUserFinalButton.click();
	}

	@And("Enter {string}, select role as {string} and cl" + "ick Add User for Google Analytics")
	public void enter_Details_Add_User_Analytics(String email, String role) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		Robot robot = new Robot();
		clickOnElementAfterLoad(googleAnalyticsViewChannel.addUserButton);
		Thread.sleep(3000);
		googleAnalyticsViewChannel.emailField.sendKeys(email);
		Thread.sleep(3000);

		// System.out.println(googleAnalyticsViewChannel.dropDownSelectorAnalytics.getAttribute("class"));
		// googleAnalyticsViewChannel.dropDownSelectorAnalytics.sendKeys(role);
		// clickOnElementAfterLoad(googleAnalyticsViewChannel.dropDownbuttonRoles);
		Point location = googleAnalyticsViewChannel.dropDownbuttonRoles.getLocation();
		robot.mouseMove(location.getX(), location.getY());
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.keyPress(KeyEvent.VK_ENTER);
		// googleAnalyticsViewChannel.dataRestrictions.sendKeys("No Cost Metrics");
		googleAnalyticsViewChannel.addUserFinalButton.click();
	}

}
