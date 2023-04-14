package stepDefenitionUI;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.ConfigFileReader;
import utility.HydraCommon;
import utility.WebDriverLibrary;
import pages.Login;
import pages.LoginOTP;
import pages.Sidebar;
import pages.Signup;

public class SideBarSteps extends WebDriverLibrary {
	public String uRL;	
	List<String>sideBarChannelsLists = List.of("Facebook Ads", "Facebook Pages", "Google Analytics", "Google Ads","Google Merchant Center", "Google My Business", "Google Search Console","Google Tag Manager",  "LinkedIn Ads", "LinkedIn Pages", "Twitter Ads", "Instagram","Tiktok","Tiktok Ads","Youtube Ads");
	ConfigFileReader configFileReader = new ConfigFileReader();
	Signup signup = new Signup(driver);
	Sidebar sideBar = new Sidebar(driver);
	HydraCommon hydraCommon = new HydraCommon(driver);
	Login login = new Login(driver);
	LoginOTP loginOTP = new LoginOTP(driver);
	public ArrayList<String> tabs;

	@When("Open side bar menu")
	public void open_side_bar_menu() throws InterruptedException {
		Thread.sleep(3000);
		moveToElementAfterLoad(sideBar.openCloseSideBarMenu);	    
	}

	@When("Click on Dashboard meu")
	public void click_on_dashboard_meu() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElementAfterLoad(sideBar.dashBoard);
	}

	@Then("Click on Trends meu")
	public void click_on_trends_meu() throws InterruptedException {
		Thread.sleep(3000);
		clickOnElementAfterLoad(sideBar.trends);
	}

	@Then("Click on Messaging meu")
	public void click_on_messaging_meu() throws InterruptedException {
		clickOnElementAfterLoad(sideBar.messaging);
	}

	@Then("Click on User menu")
	public void click_on_user_meu() throws InterruptedException {
		Thread.sleep(5000);
		tabs = new ArrayList<String> (driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(0));	
		Thread.sleep(5000);		
		clickOnElementAfterLoad(sideBar.user);
	}

	@Then("Verify User Management opened")
	public void verify_user_management_opened() {
		Assert.assertTrue(IsElementDisplayed(sideBar.userManagementScreenTitle));
	}
	
	@When("Authenticate {string} channel")
	public void authenticate_channel(String channelName) throws InterruptedException {
		Thread.sleep(5000);
		clickOnElementAfterLoad(sideBar.sideBarChannelsListAddChannelButton(channelName));
	}
	
	@Then("Verify the listed channles list on side bar")
	public void verify_the_listed_channles_list_on_side_bar() {
	   Assert.assertEquals(sideBarChannelsLists, sideBar.getSideBarChannelList());
	}
}