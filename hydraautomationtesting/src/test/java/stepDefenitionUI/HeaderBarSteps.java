package stepDefenitionUI;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.ConfigFileReader;
import utility.HydraCommon;
import utility.WebDriverLibrary;
import pages.Headerbar;
import pages.Login;
import pages.LoginOTP;
import pages.Signup;

public class HeaderBarSteps extends WebDriverLibrary {
	public String uRL;
	ConfigFileReader configFileReader = new ConfigFileReader();
	Signup signup = new Signup(driver);
	Headerbar headerbar = new Headerbar(driver);
	HydraCommon hydraCommon = new HydraCommon(driver);
	Login login = new Login(driver);
	LoginOTP loginOTP = new LoginOTP(driver);

	@When("Click on user profile icon")
	public void click_on_user_profile_icon() {
		clickOnElementAfterLoad(headerbar.OpenProfile);
	}

	@Then("Verify Account section menu of the user opened")
	public void verify_account_section_menu_of_user_opened() {
		Assert.assertTrue(IsElementDisplayed(headerbar.MyProfile));
	}

	@When("Click on Notifications icon")
	public void click_on_notifications_icon() {
		clickOnElementAfterLoad(headerbar.AlertNotifications);
	}

	@Then("Verify Notification screen opened")
	public void verify_notifications_screen_opened() {
		Assert.assertTrue(IsElementDisplayed(headerbar.NotificationsScreen));
	}

	@When("Click on the Help icon")
	public void click_on_help_icon() {
		clickOnElementAfterLoad(headerbar.Support);
	}
 
	@When("Close Notifcations screen")
	public void close_Notifications() {
		clickOnElementAfterLoad(headerbar.CloseNotifications);
	}		
	
	@Then("Verify navigates to the FAQ section displayed")
	public void verify_navigates_to_the_faq_help_section_displayed() {
		Assert.assertTrue(IsElementDisplayed(headerbar.FrequentlyAskedQuetions));
	}

	@Then("Verify Search place holder available")
	public void navigate_to_search_results() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(IsElementDisplayed(headerbar.SerachPlaceHolder));
	}
}