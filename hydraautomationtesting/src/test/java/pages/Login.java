package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailEditBox;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement passwordEditBox;

	@FindBy(xpath = "//input[@id='s1']")
	public WebElement rememberMeCheckbox;

	@FindBy(xpath = "//button[@class='bg-primary text-white']")
	public WebElement loginButton;

	@FindBy(partialLinkText = "Forgot Password")
	public WebElement forgotPassword;

	@FindBy(xpath = "//button[contains(text(),'Reset')]")
	public WebElement resetPasswordButton;

	@FindBy(xpath = "//main[contains(@class,'fixed z-50 w-full py-7')]//div[@class='mx-auto flex max-w-7xl justify-between px-5']")
	public WebElement closeOpenedDialog;

	@FindBy(xpath = "//div[contains(text(),'OTP has been verified and reset link has been sent to your registered email')]")
	public WebElement resetPasswordSentMessage;
	
	@FindBy(xpath = "//button[contains(text(),'Signup')]")
	public WebElement signUpButtonPopup;

	public void loginButtonClick() {
		loginButton.click();
	}

	public void forgotPasswordClick() {
		forgotPassword.click();
	}

	public void emailEnter() {
		emailEditBox.click();
	}

	public void resetPasswordButtonClick() {
		resetPasswordButton.click();
	}
	
	public void signInPopupButtonClick() {
		signUpButtonPopup.click();
	}

	public void closeOpenedDialog() throws InterruptedException {
		Thread.sleep(3000);
		closeOpenedDialog.click();
	}

}