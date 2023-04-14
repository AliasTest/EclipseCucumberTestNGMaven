package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Channels {

	WebDriver driver;
	String xpath;

	public Channels(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='channel_channelTitle__GaCt2'][text()='Google Analytics']")
	public WebElement googleAnalyticsChannel;

	@FindBy(xpath = "//button[@aria-label='Edit']")
	public WebElement channelEdit;

	@FindBy(xpath = "//button[@aria-label='Filter']")
	public WebElement channelFilter;

	@FindBy(xpath = "//button[@aria-label='Apply this filter']")
	public WebElement applyThisFilter;

	@FindBy(xpath = "//div[@class='form-check-circle']")
	public WebElement filterFirstCheckBox;
	
	@FindBy(xpath = "//div[@class='channel_externalLink__uf6cU']/a")
	public WebElement viewChannelInAllChannelDialog;
	
	@FindBy(xpath = "(//button[contains(@aria-label,'Edit Permission')])[1]")
	public WebElement editPermissions;
	
	@FindBy(xpath = "//input[@class='hydra-dropdown__input']")
	public WebElement editRoles;
	
	@FindBy(xpath = "//div[@class='text-xs font-medium leading-4.5 text-gray-medium']/span")
	public WebElement editRoleValue;	
	
	@FindBy(xpath = "//button[@aria-label='Save Permission']")
	public WebElement savePermissions;	
	
	@FindBy(xpath = "//a[@aria-label='Go back to previous screen']")
	public WebElement goBackPreviousScreen;	
	
	@FindBy(xpath = "//div[@class='css-xb97g8 hydra-dropdown__multi-value__remove']")
	public WebElement userAccessRemove;	
	
	//Added from Ashwin
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Facebook Pages']//following::div[4]")
	public WebElement facebookPages;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Facebook Pages']//following::div[7]")
	public WebElement facebookPagesPermission;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Facebook Ads']//following::div[4]")
	public WebElement facebookAdsPages;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Facebook Ads']//following::div[7]")
	public WebElement facebookAdsPermission;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Google Analytics']//following::div[4]")
	public WebElement googleAnalyticsPages;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Google Analytics']//following::div[7]")
	public WebElement googleAnalyticsPermission;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Google Ads']//following::div[4]")
	public WebElement googleAdsPages;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Google Ads']//following::div[7]")
	public WebElement googleAdsPermission;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Google Merchant Center']//following::div[4]")
	public WebElement googleMerchantCenterPages;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Google Merchant Center']//following::div[7]")
	public WebElement googleMerchantCenterPermission;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Google My Business']//following::div[4]")
	public WebElement googleMyBusinessPages;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Google My Business']//following::div[7]")
	public WebElement googleMyBusinessPermission;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Google Search Console']//following::div[4]")
	public WebElement googleSearchConsolePages;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Google Search Console']//following::div[7]")
	public WebElement googleSearchConsolePermission;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Google Tag Manager']//following::div[4]")
	public WebElement googleTagsManagerPages;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Google Tag Manager']//following::div[7]")
	public WebElement googleTagsManagerPermission;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='LinkedIn Ads']//following::div[4]")
	public WebElement linkedinAdsPages;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='LinkedIn Ads']//following::div[7]")
	public WebElement linkedinAdsPermission;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='LinkedIn Pages']//following::div[4]")
	public WebElement linkedinPages;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='LinkedIn Pages']//following::div[7]")
	public WebElement linkedinPagesPermission;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Twitter Ads']//following::div[4]")
	public WebElement twitterPages;
	
	@FindBy(xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Twitter Ads']//following::div[7]")
	public WebElement twitterPermission;
	
	@FindBy(xpath = "//span[contains(text(),'My Profile')]")
	public WebElement MyProfileLabel;
	
	@FindBy(xpath = "//button[contains(text(),'Proceed')]")
	public WebElement proceedButton;
	
	@FindBy(xpath = "//span[contains(text(),'Proceed')]")
	public WebElement proceedToRemoveChannelUser;	
	
	@FindBy(xpath = "//input[@placeholder='search for a user']")
	public WebElement channelUserSearch;	
	
	@FindBy(xpath = "//div[@class='truncate text-xs font-semibold leading-4.5 text-gray-dark']")
	public List<WebElement>  userDetailsInAllChannelDialog;	
	
	
	public WebElement channelPageDisplayed(String channelPageName) {
		String Xpath = "//div[contains(text()[1],'Account: ') and contains(text()[2],'" + channelPageName+"')]";
		return driver.findElement(By.xpath(Xpath));
	}	
	public WebElement pageCountDisplayedFacebookPages() {
		String Xpath = "";
		return driver.findElement(By.xpath(Xpath));
	}
	
	public WebElement pageCountDisplayedFacebookAds() {
		String Xpath = "";
		return driver.findElement(By.xpath(Xpath));
	}
	
	public WebElement pageCountDisplayedGoogleAnalytics() {
		String Xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Google Analytics']//following::div[4]";
		return driver.findElement(By.xpath(Xpath));
	}
	
	public WebElement permissionCountDisplayedTwitter() {
		String Xpath = "//div[@class='dashboard_cardTitle__GSAqJ'][text()='Twitter Ads']//following::div[7]";
		return driver.findElement(By.xpath(Xpath));
	}
	
	//REMOVE BUTTON ELEMENTS
	
	
	public WebElement editButtonTile(String userName) {
		String Xpath = "//div[contains(text(),'"+userName+"')]//following::div[1]";
		return driver.findElement(By.xpath(Xpath));
	}
	
	public WebElement removeButton() {
		String Xpath = "//span[contains(text(),'Remove')]";
		return driver.findElement(By.xpath(Xpath));
	}
	
	public WebElement userEmail(String userName) {
		String Xpath = "//div[contains(text(),'"+userName+"')]";
		return driver.findElement(By.xpath(Xpath));
	}
	
	@FindBy(xpath = "//span[contains(text(),'Edit')]")
	public WebElement editUsersButton;
	
	@FindBy(xpath = "//span[contains(text(),'Redirect to Account')]")
	public WebElement redirectButton;
	
	
	public WebElement channelSelect(String channelName) {
		String Xpath = "//div[text(),='"+channelName+"']";
		return driver.findElement(By.xpath(Xpath));
	}

	public WebElement channelDisplayed(String channelName) {
		xpath = "//div[text()='" + channelName + "']";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement editIconChannelUserRole(String channelUser) {
		xpath = "//div[text()='" + channelUser + "']//following::button";
		return driver.findElement(By.xpath(xpath));
	}
	
	public WebElement removeMultiRole(String roleName) {
		xpath = "//div[@aria-label='Remove " + roleName + "']";
		return driver.findElement(By.xpath(xpath));
	}	
}