package stepDefenitionUI;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.testng.Assert;

import common.Time;
import cucumber.TestContext;
import enums.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.ConfigFileReader;
import utility.HydraCommon;
import utility.WebDriverLibrary;
import pages.Channels;
import pages.DashBoardHome;
import pages.Login;
import pages.LoginOTP;
import pages.MyProfile;
import pages.Signup;
import pages.Worksapce;

public class WorkspaceSteps extends WebDriverLibrary {
	public String uRL;
	private String firstName;
	private String lastName;
	TestContext testContext;
	public String viewerEmail;

	public WorkspaceSteps(TestContext context) {
		testContext = context;
	};

	ConfigFileReader configFileReader = new ConfigFileReader();
	Signup signup = new Signup(driver);
	DashBoardHome dashBoardHome = new DashBoardHome(driver);
	Worksapce worksapce = new Worksapce(driver);
	Channels channels = new Channels(driver);
	Login login = new Login(driver);
	LoginOTP loginOTP = new LoginOTP(driver);
	Time time = new Time();
	public ArrayList<String> tabs;

	@When("Click create workspace button")
	public void click_create_workspace_button() throws InterruptedException {
		Thread.sleep(4000);		
		tabs = new ArrayList<String> (driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(0));			
		Thread.sleep(2000);
		clickOnElementAfterLoad(dashBoardHome.createWorksSpaceButton);
	}

	@Then("Enter workspace name {string}")
	public void enter_workspace_name(String workspaceName) {
		sendKeyElements(worksapce.workspaceName, workspaceName);

	}

	@Then("Add a channel page to workspace")
	public void add_a_channel_page_to_workspace() {
		dragAndDrop(worksapce.channelDragLocation, worksapce.channelDropLocation);
	}

	@Then("Click workspace creation Save button")
	public void click_workspace_creation_save_button() throws InterruptedException {
		Thread.sleep(3000);
		clickOnElementAfterLoad(worksapce.saveWorkspace);
	}

	@And("Verify Cancel button available")
	public void Verify_Cancel_button_available() {
		Assert.assertNotNull(worksapce.cancelWorkspace);
	}

	@Then("Add User to channel")
	public void add_user_to_channel() throws InterruptedException {
		Thread.sleep(1000);
		clickOnElementAfterLoad(worksapce.addUsersOnCreateWorkspace);
	}

	@And("Select the user to workspace")
	public void Select_the_user_to_workspace() throws InterruptedException {
		Thread.sleep(3000);
		firstName = (String) testContext.scenarioContext.getContext(Context.FIRST_NAME);
		lastName = (String) testContext.scenarioContext.getContext(Context.ADMIN_LAST_NAME);
		clickOnElementAfterLoad(worksapce.selectAUserOnWorkspaceCretion(firstName, lastName));
	}

	@Then("Click on Submit button")
	public void Click_on_Submit_button() {
		clickOnElementAfterLoad(worksapce.submitButtonOnAddUsersForCreateWorkspace);
	}

	@Then("Verify workspace {string} displayed")
	public void verify_workspace_available(String string) throws InterruptedException {
		Thread.sleep(7000);
		Assert.assertTrue(IsElementDisplayed(worksapce.workspaceDisplayed(string)));
	}
	
	@Then("Verify workspace {string} displayed for viewer")
	public void verify_workspace_available_for_viewer(String string) throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(IsElementDisplayed(worksapce.workspaceDisplayedForViewer(string)));
	}
	

	@Then("Verify workspace {string} displayed on ViewAll screen")
	public void verify_workspace_available_on_ViewAll_screen(String string) throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(IsElementDisplayed(worksapce.workspaceDisplayedOnViewAll(string)));
	}

	@Then("Click on View All workspace button")
	public void click_on_view_all_workspace_button() {
		clickOnElementAfterLoad(worksapce.worksSpaceViewAllButton);
	}

	@Then("Click on view workspace button")
	public void click_on_view_workspace_button() {
		clickOnElementAfterLoad(worksapce.viewWorkSpace);
	}	
	
	@Then("Click on Edit workspace button")
	public void click_on_Edit_workspace_button() {
		clickOnElementAfterLoad(worksapce.editWorkspace);
	}	
	
	@And("Verify View All button available in Workspaces section")
	public void verify_view_all_button_available_in_workspaces_section() {
		Assert.assertTrue(IsElementDisplayed(worksapce.worksSpaceViewAllButton));
	}

	@Then("Verify channel {string} displayed")
	public void verify_channel_displayed(String channelName) throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(IsElementDisplayed(channels.channelDisplayed(channelName)));
	}

	@And("Verify the page {string} displayed")
	public void verify_the_page_page1_displayed(String channelPageName) {
		Assert.assertTrue(IsElementDisplayed(channels.channelPageDisplayed(channelPageName)));
	}

	@Then("Verify the user {string} available in the account")
	public void verify_the_user_available_in_the_account(String userEmail) {
		Assert.assertTrue(IsElementDisplayed(channels.channelDisplayed(userEmail)));
	}

	@Then("Select the Viewers tab on Add Users page")
	public void select_the_viewers_tab_on_add_users_page() {
		clickOnElementAfterLoad(worksapce.viewersButton);
	}

	@Then("Enter viewer email")
	public void enter_viewer_email_id() throws InterruptedException {
		Thread.sleep(4000);	
		sendKeyElements(worksapce.viewerMailID, viewerEmail);
		Thread.sleep(2000);	
		worksapce.viewerMailID.sendKeys(Keys.ENTER);
	}

	@Then("Click on Add to workspace button")
	public void click_on_add_to_workspace_button() {
		clickOnElementAfterLoad(worksapce.addToWorkSpace);
	}

	@Then("Get {string} to create new viewer user")
	public void get_admin_email_to_create_new_adim_user(String email) {
		viewerEmail = email.split("@")[0] + "+" + time.getCurrentTime() + "@" + email.split("@")[1];
		testContext.scenarioContext.setContext(Context.VIEWER_EMAIL, viewerEmail);
	}
	
	//ADDED BY ASHWIN
	
	@When("Verify {string} is authenticated and present in workspace")
	public void verify_channel_in_workspace(String channelName) throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(worksapce.channelNameDisplayed(channelName).isDisplayed());
		System.out.println("Authentication success");
	}
	@Then("Verify Pages and Permissions count for Facebook Pages")
	public void verify_pages_Permission_Count_FacebookPages() throws InterruptedException {
		Thread.sleep(5000);
		String facebookPagesExpected = "2 Pages";
		String facebookPermissionExpected = "16 Permissions";
		String facebookPagesActual = channels.facebookPages.getText();
		String facebookPermissionActual = channels.facebookPagesPermission.getText();
		Assert.assertEquals(facebookPagesActual, facebookPagesExpected);
		Assert.assertEquals(facebookPermissionActual, facebookPermissionExpected);
		System.out.println(facebookPagesExpected+ facebookPermissionActual);
	}
	
	@Then("Verify Pages and Permissions count for Facebook Ads")
	public void verify_pages_Permission_CountFacebookAds() throws InterruptedException {
		Thread.sleep(2000);
		String facebookAdsPagesExpected = "1 Page";
		String facebookAdsPermissionExpected = "1 Permission";
		String facebookAdsPagesActual = channels.facebookAdsPages.getText();
		String facebookAdsPermissionActual = channels.facebookAdsPermission.getText();
		Assert.assertEquals(facebookAdsPagesActual, facebookAdsPagesExpected);
		Assert.assertEquals(facebookAdsPermissionActual, facebookAdsPermissionExpected);
	}
	@Then("Verify Pages and Permissions count for Google Analytics")
	public void verify_pages_Permission_CountGoogleAnalytics() throws InterruptedException {
		Thread.sleep(2000);
		String GoogleAnalyticsPagesExpected = "1 Page";
		String GoogleAnalyticsPermissionExpected = "34 Permissions";
		String GoogleAnalyticsPagesActual = channels.googleAnalyticsPages.getText();
		String GoogleAnalyticsPermissionActual = channels.googleAnalyticsPermission.getText();
		Assert.assertEquals(GoogleAnalyticsPagesActual, GoogleAnalyticsPagesExpected);
		Assert.assertEquals(GoogleAnalyticsPermissionActual, GoogleAnalyticsPermissionExpected);
	}
	
	@Then("Verify Pages and Permissions count for Google Ads")
	public void verify_pages_Permission_CountGoogleAds() throws InterruptedException {
		Thread.sleep(2000);
		String GoogleAdsPagesExpected = "1 Page";
		String GoogleAdsPermissionExpected = "1 Permission";
		String GoogleAdsPagesActual = channels.googleAdsPages.getText();
		String GoogleAdsPermissionActual = channels.googleAdsPermission.getText();
		Assert.assertEquals(GoogleAdsPagesActual, GoogleAdsPagesExpected);
		Assert.assertEquals(GoogleAdsPermissionActual, GoogleAdsPermissionExpected);
	}
	
	@Then("Verify Pages and Permissions count for Google Merchant Center")
	public void verify_pages_Permission_CountGoogleMerchantCenter() throws InterruptedException {
		Thread.sleep(2000);
		String GoogleMerchantCenterPagesExpected = "1 Page";
		String GoogleMerchantCenterPermissionExpected = "19 Permissions";
		String GoogleMerchantCenterPagesActual = channels.googleMerchantCenterPages.getText();
		String GoogleMerchantCenterPermissionActual = channels.googleMerchantCenterPermission.getText();
		Assert.assertEquals(GoogleMerchantCenterPagesActual, GoogleMerchantCenterPagesExpected);
		Assert.assertEquals(GoogleMerchantCenterPermissionActual, GoogleMerchantCenterPermissionExpected);
	}
	
	@Then("Verify Pages and Permissions count for Google My Business")
	public void verify_pages_Permission_CountGoogleMyBusiness() throws InterruptedException {
		Thread.sleep(2000);
		String GoogleMyBusinessPagesExpected = "1 Page";
		String GoogleMyBusinessPermissionExpected = "14 Permissions";
		String GoogleMyBusinessPagesActual = channels.googleMyBusinessPages.getText();
		String GoogleMyBusinessPermissionActual = channels.googleMyBusinessPermission.getText();
		Assert.assertEquals(GoogleMyBusinessPagesActual, GoogleMyBusinessPagesExpected);
		Assert.assertEquals(GoogleMyBusinessPermissionActual, GoogleMyBusinessPermissionExpected);
	}
	
		@Then("Verify Pages and Permissions count for Google Search Consoles")
		public void verify_pages_Permission_CountGoogleSearchConsoles() throws InterruptedException {
			Thread.sleep(2000);
			String GoogleSearchConsolePagesExpected = "2 Pages";
			String GoogleSearchConsolePermissionExpected = "13 Permissions";
			String GoogleSearchConsolePagesActual = channels.googleSearchConsolePages.getText();
			String GoogleSearchConsolePermissionActual = channels.googleSearchConsolePermission.getText();
			Assert.assertEquals(GoogleSearchConsolePagesActual, GoogleSearchConsolePagesExpected);
			Assert.assertEquals(GoogleSearchConsolePermissionActual, GoogleSearchConsolePermissionExpected);
		}
		
		@Then("Verify Pages and Permissions count for Google Tag Manager")
		public void verify_pages_Permission_CountGoogleTagManager() throws InterruptedException {
			Thread.sleep(2000);
			String GoogleTagManagerPagesExpected = "1 Page";
			String GoogleTagManagerPermissionExpected = "1 Permission";
			String GoogleTagManagerPagesActual = channels.googleTagsManagerPages.getText();
			String GoogleTagManagerPermissionActual = channels.googleTagsManagerPermission.getText();
			Assert.assertEquals(GoogleTagManagerPagesActual, GoogleTagManagerPagesExpected);
			Assert.assertEquals(GoogleTagManagerPermissionActual, GoogleTagManagerPermissionExpected);
		}
		
		@Then("Verify Pages and Permissions count for Linkedin Ads")
		public void verify_pages_Permission_CountLinkedinAds() throws InterruptedException {
			Thread.sleep(2000);
			
			String LinkedInAdsPagesExpected = "1 Page";
			String LinkedInAdsPermissionExpected = "11 Permissions";
			String LinkedInAdsPagesActual = channels.linkedinAdsPages.getText();
			String LinkedInAdsPermissionActual = channels.linkedinAdsPermission.getText();
			Assert.assertEquals(LinkedInAdsPagesActual, LinkedInAdsPagesExpected);
			Assert.assertEquals(LinkedInAdsPermissionActual, LinkedInAdsPermissionExpected);
		}
		
		@Then("Verify Pages and Permissions count for Linkedin Pages")
		public void verify_pages_Permission_CountLinkedinPages() throws InterruptedException {
			Thread.sleep(2000);
			String LinkedInPagesExpected = "1 Page";
			String LinkedInPermissionExpected = "15 Permissions";
			String LinkedInPagesActual = channels.linkedinPages.getText();
			String LinkedInPermissionActual = channels.linkedinPagesPermission.getText();
			Assert.assertEquals(LinkedInPagesActual, LinkedInPagesExpected);
			Assert.assertEquals(LinkedInPermissionActual, LinkedInPermissionExpected);
		}
		
		@Then("Verify Pages and Permissions count for Twitter Ads")
		public void verify_pages_Permission_CountTwitterAds() throws InterruptedException {
			Thread.sleep(2000);
			String TwitterAdsPagesExpected = "1 Page";
			String TwitterAdsPermissionExpected = "1 Permission";
			String TwitterAdsPagesActual = channels.twitterPages.getText();
			String TwitterAdsPermissionActual = channels.twitterPermission.getText();
			System.out.println(TwitterAdsPermissionActual);
			Assert.assertEquals(TwitterAdsPagesActual, TwitterAdsPagesExpected);
			Assert.assertEquals(TwitterAdsPermissionActual, TwitterAdsPermissionExpected);
		}
		
		@Then("Click Proceed button")
		public void proceed_Button_Click() throws InterruptedException {
			Thread.sleep(2000);
			clickOnElementAfterLoad(channels.proceedButton);
			
		}
}