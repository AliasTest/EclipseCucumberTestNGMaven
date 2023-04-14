package stepDefenitionUI;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import groovyjarjarantlr4.v4.parse.GrammarTreeVisitor.channelSpec_return;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.ConfigFileReader;
import utility.HydraCommon;
import utility.WebDriverLibrary;
import pages.DashBoardHome;
import pages.Login;
import pages.LoginOTP;
import pages.Sidebar;
import pages.Signup;
import pages.Worksapce;
import pages.Channels;

public class ChannelsSteps extends WebDriverLibrary {
	public String uRL;
	ConfigFileReader configFileReader = new ConfigFileReader();
	Signup signup = new Signup(driver);
	Sidebar sideBar = new Sidebar(driver);
	HydraCommon hydraCommon = new HydraCommon(driver);
	Login login = new Login(driver);
	LoginOTP loginOTP = new LoginOTP(driver);
	Channels channels = new Channels(driver);
	Worksapce worksapce = new Worksapce(driver);
	DashBoardHome dashboard = new DashBoardHome(driver);

	@Then("Close authenticated channel added message")
	public void verify_the_authenticated_channel_added() throws InterruptedException {
		Thread.sleep(5000);
		try {
			if (IsElementDisplayed(sideBar.closeChannelAddedMessage)) {
				clickOnElementAfterLoad(sideBar.closeChannelAddedMessage);
			}

		} catch (Exception ex) {
		}
		Thread.sleep(3000);
	}

	@Then("Click on first check box to filter channel")
	public void click_on_first_check_box_to_filter_channel() throws InterruptedException {
		Thread.sleep(3000);
		clickOnElementAfterLoad(channels.filterFirstCheckBox);
		clickOnElementAfterLoad(channels.applyThisFilter);
	}

	@Then("Verify the Google Analytics not displayed on channel list")
	public void verify_the_google_analytics_not_displayed_on_channel_list() {
		Assert.assertEquals(IsElementDisplayed(channels.googleAnalyticsChannel), false);
	}

	@When("Click on View Channel link")
	public void click_on_view_channel_link() {
		clickOnElementAfterLoad(channels.viewChannelInAllChannelDialog);
	}

	@Then("verify more than one user details displayed")
	public void verify_more_than_one_user_details_displayed() throws InterruptedException {
		Thread.sleep(4000);
		Assert.assertTrue(channels.userDetailsInAllChannelDialog.size() > 1);
	}

	@When("Click on {string}")
	public void click_on(String accountName) throws InterruptedException {
		Thread.sleep(4000);
		clickOnElementAfterLoad(worksapce.workspaceDisplayed(accountName));
	}

	@When("Click on Edit permissions")
	public void click_on_edit_permissions() {
		clickOnElementAfterLoad(channels.editPermissions);
	}

	@When("Change the user role to {string}")
	public void change_the_user_role_to(String uesrRole) throws InterruptedException {
		Thread.sleep(3000);
		channels.editRoles.click();
		Thread.sleep(1000);
		channels.editRoles.sendKeys(uesrRole);
		Thread.sleep(1000);
		channels.editRoles.sendKeys(Keys.ENTER);
	}

	@When("Click on save permissions")
	public void click_on_save_permissions() {
		clickOnElementAfterLoad(channels.savePermissions);
	}

	@When("Click on button to go back to previous page")
	public void click_on_button_to_go_back_to_previous_page() throws InterruptedException {
		Thread.sleep(3000);
		clickOnElementAfterLoad(channels.goBackPreviousScreen);
	}

	@When("Verify the permission role is {string}")
	public void verify_the_permission_role_is(String userRole) {
		Assert.assertEquals(getElementText(channels.editRoleValue), userRole);
	}
	
	@When("Click on Edit permissions for {string} user")
	public void click_on_edit_permissions_for_user(String userName) {
	   clickOnElementAfterLoad(channels.editIconChannelUserRole(userName));
	}
	
	@When("Remove the role {string}")
	public void remove_the_role(String roleName) {
		 clickOnElementAfterLoad(channels.removeMultiRole(roleName));
	}
	
	@When("Verify the permission role {string} is not displayed")
	public void verify_the_permission_role_is_not_displayed(String userName) {		
		Assert.assertNull(channels.editIconChannelUserRole(userName));	    
	}	
	
	@Then("Navigate to dashboard")
	public void navigate_To_Dashboard() throws InterruptedException {
		Thread.sleep(4000);
		sideBar.dashBoard2.click();
		waitForElementToLoad(dashboard.channelsHeading);
	}
}