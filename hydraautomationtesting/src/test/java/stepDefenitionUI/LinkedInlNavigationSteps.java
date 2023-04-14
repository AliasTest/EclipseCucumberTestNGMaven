package stepDefenitionUI;

import utility.ConfigFileReader;
import utility.WebDriverLibrary;
import io.cucumber.java.en.When;
import pages.Gmail;
import pages.LinkedIn;
import pages.UserManagement;

public class LinkedInlNavigationSteps extends WebDriverLibrary {
	public String uRL;
	public String linkedInUsername;
	public String linkedInPassword;	
	ConfigFileReader configFileReader = new ConfigFileReader();
	Gmail gmail = new Gmail(driver);
	LinkedIn linkedIn = new LinkedIn(driver);
	UserManagement userManagement = new UserManagement(driver);
	
	@When("Login LinkedIn")
	public void LoginLinkedIn() throws InterruptedException {
		Thread.sleep(5000);
		try {
			linkedInUsername = configFileReader.getProprtyUrl("gmail2Username");
			linkedInPassword = configFileReader.getProprtyUrl("gmail2Password");
			sendKeyElements(linkedIn.loginlUserName, linkedInUsername);
			sendKeyElements(linkedIn.loginPassword, linkedInPassword);
			clickOnElementAfterLoad(linkedIn.loginSignIn);
		}
		catch (Exception e)
		{}
	}	
}
