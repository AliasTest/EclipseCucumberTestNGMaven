package stepDefenitionUI;

import org.testng.Assert;
import cucumber.TestContext;
import enums.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utility.ConfigFileReader;
import utility.HydraCommon;
import utility.WebDriverLibrary;
import pages.DashBoardHome;
import pages.Login;
import pages.LoginOTP;
import pages.Signup;
import pages.Channels;

public class DashBoardSteps extends WebDriverLibrary {
	public String uRL;	
	private String firstName;
	TestContext testContext;
	
	public DashBoardSteps(TestContext context) {
		testContext = context;
	};
	
	ConfigFileReader configFileReader = new ConfigFileReader();
	Signup signup = new Signup(driver);
	DashBoardHome dashBoardHome = new DashBoardHome(driver);
	Channels channels = new Channels(driver);
	HydraCommon hydraCommon = new HydraCommon(driver);
	Login login = new Login(driver);
	LoginOTP loginOTP = new LoginOTP(driver);

@Then("Verify Channels heading displayed")
public void Verify_Hello_Welcome_Back_Message_Heading_Displayed() throws InterruptedException {
	Thread.sleep(4000);
	Assert.assertTrue(dashBoardHome.channelsHeading.isDisplayed());
}

@Then("Verify first name and {string} displayed on the hello welcome back message")
public void verify_first_name_and_displayed_on_the_hello_welcome_back_message(String lastName) throws InterruptedException {
	Thread.sleep(4000);
	firstName = (String)testContext.scenarioContext.getContext(Context.FIRST_NAME);
	Assert.assertTrue(IsElementDisplayed(dashBoardHome.dashBoardWelcomeMessage(firstName, lastName)));	
}

@And("Verify the user license used information from footer")
public void verify_the_user_license_used_information_from_footer() {
    Assert.assertTrue(IsElementDisplayed(dashBoardHome.licenceUsedFooter));
}

@And("Verify View All button available in Channels section")
public void verify_view_all_button_available_in_channels_section() {
	 Assert.assertTrue(IsElementDisplayed(dashBoardHome.channelsViewAllButton));
}

@And("Click on View All button available in Channels section")
public void Click_view_all_button_available_in_channels_section() throws InterruptedException {
	Thread.sleep(4000);
	clickOnElementAfterLoad(dashBoardHome.channelsViewAllButton);
	Thread.sleep(4000);
	Assert.assertNotNull(channels.googleAnalyticsChannel);	
}

@And("Verify create Workspace button available on Workspaces section")
public void verify_create_workspace_button_available_in_workspaces_section() {
	Assert.assertTrue(IsElementDisplayed(dashBoardHome.createWorksSpaceButton));
}

@And("Click on Filter channel button")
public void click_on_filter_channel() throws InterruptedException {
	Thread.sleep(4000);
	clickOnElementAfterLoad(channels.channelFilter);
	}

@And("Click on Edit channel button")
public void click_on_edit_channel() {
	clickOnElementAfterLoad(channels.channelEdit);
}

//ADDED BY ASHWIN

@And("Click New Authentication button for first time auth")
public void newAuth_Button_Click() throws InterruptedException {
	Thread.sleep(3000);
	waitForElementToLoad(dashBoardHome.newAuthButton);
	dashBoardHome.newAuthButton.click();
}
}