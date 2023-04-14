package stepDefenitionUI;

import io.cucumber.java.en.When;
import pages.Facebook;
import pages.Gmail;
import pages.UserManagement;
import utility.ConfigFileReader;
import utility.WebDriverLibrary;

public class FacebookNavigationSteps extends WebDriverLibrary{
	public String uRL;
	public String facebookEmail;
	public String facebookPassword;	
	ConfigFileReader configFileReader = new ConfigFileReader();
	Gmail gmail = new Gmail(driver);
	Facebook facebook = new Facebook(driver);
	UserManagement userManagement = new UserManagement(driver);
	
	@When("Login Facebook")
	public void LoginFacebook() throws InterruptedException {
		Thread.sleep(5000);
		try {
			facebookEmail = configFileReader.getProprtyUrl("gmail2Username");
			facebookPassword = configFileReader.getProprtyUrl("facebookPassword");
			sendKeyElements(facebook.loginlEmail, facebookEmail);
			sendKeyElements(facebook.loginPassword, facebookPassword);
			clickOnElementAfterLoad(facebook.loginSignIn);
		}
		catch (Exception e)
		{}
	}	

}
