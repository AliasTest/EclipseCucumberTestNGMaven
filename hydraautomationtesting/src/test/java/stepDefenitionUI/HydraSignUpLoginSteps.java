package stepDefenitionUI;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.TestContext;
import enums.Context;
import common.Time;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.ConfigFileReader;
import utility.HydraCommon;
import utility.WebDriverLibrary;
import pages.HydraHome;
import pages.Login;
import pages.LoginOTP;
import pages.Signup;

public class HydraSignUpLoginSteps extends WebDriverLibrary {

	TestContext testContext;
	private String uniqueEmail;
	private String uniqueMobile;
	private String uniquefirstName;
	private String uniquelastName;
	public String emailToVerify;
	private String viewerEmail;

	public HydraSignUpLoginSteps(TestContext context) {
		testContext = context;
	};

	Time time = new Time();
	ConfigFileReader configFileReader = new ConfigFileReader();
	Signup signup = new Signup(driver);
	HydraHome hydraHome = new HydraHome(driver);
	HydraCommon hydraCommon = new HydraCommon(driver);
	Login login = new Login(driver);
	LoginOTP loginOTP = new LoginOTP(driver);

	@Then("click {string} button")
	public void click_button(String string) throws InterruptedException {
		Thread.sleep(10000);		
		clickOnElementAfterLoad(hydraHome.Button(string));
	}	
	
	
	@Then("^Enter username \"(.*)\" and \"(.*)\" and \"(.*)\" phone number and \"(.*)\" and \"(.*)\"$")
	public void enter_and_and_and_phone_number_and_and(String lastName, String email, String countryCode,
			String password, String retypePassword) throws InterruptedException {
		uniqueEmail = time.getCurrentTime() + email;
		uniquefirstName = time.getUniqueAlephabeticString(30);
		testContext.scenarioContext.setContext(Context.FIRST_NAME, uniquefirstName);
		testContext.scenarioContext.setContext(Context.ADMIN_LAST_NAME, lastName);
		Thread.sleep(4000);
		signup.firstName.click();
		signup.firstName.sendKeys(uniquefirstName);
		signup.lastName.click();
		signup.lastName.sendKeys(lastName);
		signup.email.click();
		signup.email.sendKeys(uniqueEmail);
		uniqueMobile = time.getCurrentTimeForUniqueMobile();
		signup.phone.click();
		signup.phone.sendKeys(uniqueMobile);
		signup.password.click();
		signup.password.sendKeys(password);
		signup.confirmPassword.click();
		signup.confirmPassword.sendKeys(password);
	}

	@When("Enter viewer email and {string} of the created user")
	public void enter_viewer_email_and_of_the_created_user(String password) throws InterruptedException {
		viewerEmail = (String) testContext.scenarioContext.getContext(Context.VIEWER_EMAIL);
		sendKeyElements(login.emailEditBox, viewerEmail);
		sendKeyElements(login.passwordEditBox, password);
	}

	@Then("Enter email and {string} of the created user")
	public void enter_email_and_of_the_created_user(String password) throws InterruptedException {
		Thread.sleep(6000);
		sendKeyElements(login.emailEditBox, uniqueEmail);
		Thread.sleep(1000);
		sendKeyElements(login.passwordEditBox, password);
	}

	@When("Enter AdminEmail and {string} of the created user")
	public void enter_AdminEmail_and_of_the_created_user(String password) throws InterruptedException {
		emailToVerify = (String) testContext.scenarioContext.getContext(Context.ADMIN_EMAIL);
		sendKeyElements(login.emailEditBox, emailToVerify);
		sendKeyElements(login.passwordEditBox, password);
	}

	@Then("Check the captca")
	public void check_the_captca() throws InterruptedException {
		Thread.sleep(3000);
		hydraCommon.captchaClick();
	}

	@Then("Click on Sign up button")
	public void click_on_sign_up_button() throws InterruptedException {
		clickOnElementAfterLoad(signup.signupButton);
	}

	@Then("Scroll page down")
	public void Scroll_Page_Down() throws InterruptedException {
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform(); // Page Down
		Thread.sleep(2000);
	}
	
	@Then("click team Buy Plan button")
	public void click_team_Buy_Plan_button() throws InterruptedException {
		Thread.sleep(3000);
		clickOnElementAfterLoad(signup.teamsBuyPlanButton);
		Thread.sleep(2000);
	}
	 

	@Then("Click Login button on Hydra homepage")
	public void click_Login_button_on_Hydra_Homepage() throws InterruptedException {
		Thread.sleep(10000);
		hydraHome.loginButtononHydraHome.click();
		Thread.sleep(2000);
	}

	@Then("^Enter the \"(.*)\" and \"(.*)\"$")
	public void enter_password_retypePassword(String password, String retypePassword) throws InterruptedException {
		sendKeyElements(signup.password, password);
		sendKeyElements(signup.confirmPassword, retypePassword);
	}

	@Then("Click Login button on Hydra login dialog")
	public void Click_Login_button_on_login_dialog() throws InterruptedException {
		Thread.sleep(2000);
		login.loginButtonClick();
		Thread.sleep(10000);
	}

	@Then("Click on the remember password")
	public void click_on_remember_password() throws InterruptedException {
		Thread.sleep(7000);
		clickOnElementAfterLoad(login.rememberMeCheckbox);
	}

	@Then("Enter otp")
	public void Enter_OTP() throws InterruptedException {
		Thread.sleep(9000);
		loginOTP.EnterotpInputs("6", "5", "4", "3");
	}

	@When("Close the displayed dialog")
	public void close_the_displayed_dialog() throws InterruptedException {
		login.closeOpenedDialog();
	}

	@When("Click on the forgot password")
	public void click_on_the_forgot_password() throws InterruptedException {
		Thread.sleep(3000);
		login.forgotPasswordClick();
	}

	@When("Enter email of the created user")
	public void enter_email_of_the_created_user() {
		login.emailEditBox.click();
		login.emailEditBox.sendKeys(uniqueEmail);
	}

	@When("Click Reset button")
	public void click_reset_button() {
		login.resetPasswordButtonClick();
	}

	@When("Click on Make Payment button")
	public void Click_On_Make_Payment_Button() {
		clickOnElementAfterLoad(signup.makePayment);
		driver.navigate().back();
	}

	@When("Verify Reset password email link sent message displayed")
	public void Verify_Reset_Password_Email_Link_Sent_Message_Displayed() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(login.resetPasswordSentMessage.isDisplayed());
	}

	@And("^Enter the username \"(.*)\" and \"(.*)\" phone number and \"(.*)\" and \"(.*)\"$")
	public void enter_lastname_countrycode_password(String lastName, String countryCode, String password,
			String retypePassword) throws InterruptedException {
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		Thread.sleep(2000);
		uniquefirstName = time.getUniqueAlephabeticString(30);
		testContext.scenarioContext.setContext(Context.FIRST_NAME, uniquefirstName);
		testContext.scenarioContext.setContext(Context.ADMIN_LAST_NAME, lastName);
		Thread.sleep(4000);
		signup.firstName.click();
		signup.firstName.sendKeys(uniquefirstName);		
		signup.lastName.click();
		signup.lastName.sendKeys(lastName);
		uniqueMobile = time.getCurrentTimeForUniqueMobile();
		signup.phone.click();
		signup.phone.sendKeys(uniqueMobile);
		signup.password.click();
		signup.password.sendKeys(password);
		signup.confirmPassword.click();
		signup.confirmPassword.sendKeys(password);
	}

	@When("Login with existing {string} and {string}")
	public void login_with_and_of_the_created_user(String licenceUserEmail, String password) {
		sendKeyElements(login.emailEditBox, licenceUserEmail);
		sendKeyElements(login.passwordEditBox, password);
	}

	@Then("^Enter \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void Enter_Payment_Details(String email,String cardInformation, String expiryDate, String CVC, String nameOnCard, String billingAddressCountry, String addressLine, String city, String PIN, String State) throws InterruptedException
	
	{
	Thread.sleep(10000);	
	sendKeyElements(signup.emailField, email);	
	sendKeyElements(signup.cardNumber, cardInformation);
	sendKeyElements(signup.expDate, expiryDate);	
	sendKeyElements(signup.CVC, expiryDate);	
	sendKeyElements(signup.nameOnCard, nameOnCard);		
	Thread.sleep(3000);
	Select sel = new  Select(signup.countryDropdown);
    sel.selectByVisibleText(billingAddressCountry);
	signup.addressLine.sendKeys(addressLine);
	signup.cityLine.click();
	signup.cityLine.sendKeys(city);
	Thread.sleep(2000);
	signup.zipLine.click();
	signup.zipLine.sendKeys(PIN);
	Select sele = new  Select(signup.stateLine);
	sele.selectByVisibleText(State);
	Thread.sleep(2000);	
	signup.subscribeButton.click();
	Thread.sleep(8000);	
	}
	
	@Then("Click signUp button on Hydra login dialog")
	public void Click_signUp_button_on_login_dialog() throws InterruptedException {
		login.signInPopupButtonClick();
		Thread.sleep(10000);
	}
	@When("Click on Payment Plan")
	public void Click_On_Payment_Plan() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElementAfterLoad(signup.buyPlanButton);
	}
}