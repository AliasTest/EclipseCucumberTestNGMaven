package stepDefenitionUI;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
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
import pages.Login;
import pages.Sidebar;
import pages.Signup;
import pages.UserManagement;

public class UserMangementSteps extends WebDriverLibrary {
	
	public UserMangementSteps(TestContext context) {
		testContext = context;
	};
	public String adminUserEmail;
	ConfigFileReader configFileReader = new ConfigFileReader();
	Signup signup = new Signup(driver);
	Sidebar sideBar = new Sidebar(driver);
	HydraCommon hydraCommon = new HydraCommon(driver);
	Login login = new Login(driver);
	UserManagement userManagement = new UserManagement(driver);
	Time time = new Time();
	List<String>userManagementActualTitles = List.of("USER", "TYPE", "ADDED BY","VERIFICATION STATUS","LAST LOGIN", "ACTIONS");
	TestContext testContext;
	public ArrayList<String> tabs;
	String[] emailToVerify = new String[1];
	int userRowNumber;
	
	@When("Click on Add User")
	public void click_on_add_user() throws InterruptedException {
		Thread.sleep(2000);
		tabs = new ArrayList<String> (driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(0));	
		Thread.sleep(2000);
		clickOnElementAfterLoad(userManagement.addUser);
	}
	
	@Then("Get {string} to create new adim user")
	public void get_admin_email_to_create_new_adim_user(String email) {
		adminUserEmail= email.split("@")[0]+"+"+time.getCurrentTime()+"@"+email.split("@")[1];
		testContext.scenarioContext.setContext(Context.ADMIN_EMAIL, adminUserEmail);	
	}
	@Then("Verify the user added verifcation status {string}")
	public void verify_the_user_added_verifcation_status(String verificationStatus) throws InterruptedException {
		Thread.sleep(5000);
		emailToVerify[0] = (String)testContext.scenarioContext.getContext(Context.ADMIN_EMAIL);	
		driver.navigate().refresh();
		Thread.sleep(5000);
		userRowNumber=hydraCommon.getRowNumberAdminUserListed(emailToVerify[0]);		
		Assert.assertEquals(getElementText(userManagement.userManagementScreenUserVerificationStatusElement(userRowNumber)),verificationStatus);
	}
	
	@When("Enter email")
	public void enter_email_and_add_user() {		
		sendKeyElements(userManagement.userEmail, adminUserEmail);			
	}
	
	@And("Add user")
	public void add_user() throws InterruptedException {
	Thread.sleep(3000);
	clickOnElementAfterLoad(userManagement.addUserButton);
	Thread.sleep(5000);
	clickOnElementAfterLoad(userManagement.addUserMessageClose);	
	}
	
	
	@Then("Verfiy the user management table title")
	public void Verfiy_the_user_management_table_title() throws InterruptedException {		
		Assert.assertEquals(userManagementActualTitles,userManagement.getuserManagementPageTableTitles());		
	}
	
	@And("Verify the {string} user added details displayed on user management screen")
	public void Verify_the_user_added_details_displayed_on_user_management_screen(String numberOfUser) throws InterruptedException {
		Thread.sleep(6000);
		Assert.assertEquals(getElementText(userManagement.userManagementScreenUserAddedName(Integer.valueOf(numberOfUser))),adminUserEmail);
		emailToVerify[0] = (String)testContext.scenarioContext.getContext(Context.ADMIN_EMAIL);	
		driver.navigate().refresh();
		userRowNumber=hydraCommon.getRowNumberAdminUserListed(emailToVerify[0]);		
		Assert.assertEquals(getElementText(userManagement.userManagementScreenUserVerificationStatusElement(userRowNumber)),"Not Verified");		
		Assert.assertEquals(getElementText(userManagement.createdByUserFirst).replace("\n", " ")+getElementText(userManagement.createdByUserSecond),"You License Owner");
	}
	
	@Then("Verify the Suspend all user button enabled")
		public void verify_the_suspend_all_user_button_enabled() {
	    Assert.assertTrue(IsElementEnabled(userManagement.suspendAllUsers));
	}
	
	@Then("Verify SuspedAll user button disabled")
	public void verify_the_suspend_all_user_button_disabled() {
    Assert.assertFalse(IsElementEnabled(userManagement.suspendAllUsers));
	}
	
	@When("Cancel the opened New User adding dialog")
	public void cancel_the_opened_new_user_adding_dialog() {
		clickOnElementAfterLoad(userManagement.cancelAddUserButton);  
	}	
}