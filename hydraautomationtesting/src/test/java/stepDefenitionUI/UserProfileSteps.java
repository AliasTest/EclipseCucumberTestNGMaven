package stepDefenitionUI;

import org.testng.Assert;
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

public class UserProfileSteps extends WebDriverLibrary {
	public String uRL;
	private String firstName;
	private String lastName;
	TestContext testContext;

	public UserProfileSteps(TestContext context) {
		testContext = context;
	};

	ConfigFileReader configFileReader = new ConfigFileReader();
	Signup signup = new Signup(driver);
	DashBoardHome dashBoardHome = new DashBoardHome(driver);
	Worksapce worksapce = new Worksapce(driver);
	Channels channels = new Channels(driver);
	Login login = new Login(driver);
	LoginOTP loginOTP = new LoginOTP(driver);
	MyProfile myProfile=new MyProfile(driver);

	@Then("Click profile icon on dashboard and select My Profile page")
	public void navigate_To_MyProfile() throws InterruptedException
	{
	Thread.sleep(6000);
	clickOnElementAfterLoad(myProfile.profileButton);
	Thread.sleep(2000);
	clickOnElementAfterLoad(myProfile.myProfileSelector);
	}	
}