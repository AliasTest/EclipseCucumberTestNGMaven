package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HydraHome {

	WebDriver driver;	
	public HydraHome(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath = "//button[text()='Login']")
	public WebElement loginButtononHydraHome;
	
	public void loginButtonClickOnHydraHome()
	{loginButtononHydraHome.click();}		
	
	public WebElement Button(String buttonName) {
		String Xpath = "//button[text()='" + buttonName + "']";
		return driver.findElement(By.xpath(Xpath));
	}
	
	@FindBy(xpath = "(//button[text()='Buy Plan'])[2]")
	public WebElement teamBuyPlanButton;
	
}