package stepDefenitionUI;

import java.util.ArrayList;

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

public class EditUserSteps extends WebDriverLibrary{
	public String uRL;	
	//private String firstName;
	TestContext testContext;
	
	public EditUserSteps(TestContext context) {
		testContext = context;
	};
	
	ConfigFileReader configFileReader = new ConfigFileReader();
	Signup signup = new Signup(driver);
	DashBoardHome dashBoardHome = new DashBoardHome(driver);
	Channels channels = new Channels(driver);
	HydraCommon hydraCommon = new HydraCommon(driver);
	Login login = new Login(driver);
	LoginOTP loginOTP = new LoginOTP(driver);
	ViewAllMenu viewAllMenu = new ViewAllMenu(driver);
	public ArrayList<String> tabs;
	
	
	@Then("Click {string} channel name")
	public void select_ChannelName(String channelName) throws InterruptedException
	{
		Thread.sleep(2000);
		clickOnElementAfterLoad(channels.channelSelect(channelName));
		
	}
	@Then("Click Edit User button")
	public void click_EditUser() {
		clickOnElementAfterLoad(channels.editUsersButton);
	}
	
	@Then("Click Redirect to account button")
	public void click_RedirectButton() {
		clickOnElementAfterLoad(channels.redirectButton);
	}
	
	@And("Verify that user is redirected to {string}")
	public void verify_URL_Of_Redirect(String expectedURL) throws InterruptedException {
		Thread.sleep(2000);
		tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
		String actualURL = driver.getCurrentUrl();
		Assert.assertTrue(actualURL.contains(expectedURL));
		
	}
}
