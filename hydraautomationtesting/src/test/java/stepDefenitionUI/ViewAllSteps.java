package stepDefenitionUI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pages.Channels;
import pages.Login;
import pages.LoginOTP;
import pages.Sidebar;
import pages.Signup;
import pages.ViewAllMenu;
import utility.ConfigFileReader;
import utility.HydraCommon;
import utility.WebDriverLibrary;

public class ViewAllSteps extends WebDriverLibrary{
	public String uRL;
	public int channelCount;
	public int expectedCount = 7;
	ConfigFileReader configFileReader = new ConfigFileReader();
	Signup signup = new Signup(driver);
	Sidebar sideBar = new Sidebar(driver);
	HydraCommon hydraCommon = new HydraCommon(driver);
	Login login = new Login(driver);
	LoginOTP loginOTP = new LoginOTP(driver);
	Channels channels = new Channels(driver);
	ViewAllMenu viewall = new ViewAllMenu(driver);
	
	@Then("Check {string} for number of permissions and pages")
	public void check_For_Permissions(String channelName) {
		
	}
	
	@Then("Check for channel count")
	public void channel_Count() throws InterruptedException {
		Thread.sleep(2000);
		int channelCount = viewall.workspaceChannelList().size();
		System.out.println("The count of channels are: "+ channelCount);
		
		Assert.assertEquals(expectedCount, channelCount);
	}
	
	@Then("Click View All button")
	public void click_ViewAll_Button() throws InterruptedException {
		Thread.sleep(4000);
		viewall.viewAllButton.click();
	}
	
	
}
