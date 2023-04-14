package utility;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import groovyjarjarantlr4.v4.codegen.model.Action;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class WebDriverLibrary {

	public static WebDriver driver;
	private WebDriverWait wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	boolean isElementDisplayed;

	public void chromeDriverSetup()  {
		try {
			ChromeOptions option = new ChromeOptions();
            option.addArguments("--remote-allow-origins=*");
            option.addArguments("chrome.switches", "--disable-extensions --disable-extensions-file-access-check --disable-extensions-http-throttling --disable-infobars --enable-automation --start-maximized");
           
            //Disable save password popup
            Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			option.setExperimentalOption("prefs", prefs);
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver(option);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
	}

	public void fireFoxDriverSetup() {
		try {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ieDriverSetup() {
		try {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void closeBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void waitForElementToLoad(WebElement element) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			System.out.println("Waited for 60 seconds");
			e.printStackTrace();
		}
	}

	public String getElementText(WebElement element) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			System.out.println("Waited for 60 seconds");
			e.printStackTrace();
		}
		return element.getText();
	}

	public void clickOnElementAfterLoad(WebElement element) {
		waitForElementToLoad(element);
		element.click();
	}
	
	public void moveToElementAfterLoad(WebElement element) {
		waitForElementToLoad(element);
		Actions action= new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	public boolean IsElementDisplayed(WebElement element) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(element));
			isElementDisplayed = true;
		} catch (Exception e) {
			System.out.println("Waited for 60 seconds");
			e.printStackTrace();
			isElementDisplayed = false;
		}
		return isElementDisplayed;
	}

	public boolean IsElementEnabled(WebElement element) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			System.out.println("Waited for 60 seconds");
			e.printStackTrace();
		}
		return element.isEnabled();
	}

	public void sendKeyElements(WebElement element, String text) {
		try {
			waitForElementToLoad(element);
			element.click();
			element.clear();
			element.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void dragAndDrop(WebElement Sourcelocator, WebElement Destinationlocator) {
		try {
			waitForElementToLoad(Sourcelocator);
			waitForElementToLoad(Destinationlocator);
			final String java_script = "var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEffe"
					+ "ct:'',effectAllowed:'all',files:[],items:{},types:[],setData:fun"
					+ "ction(format,data){this.items[format]=data;this.types.append(for"
					+ "mat);},getData:function(format){return this.items[format];},clea"
					+ "rData:function(format){}};var emit=function(event,target){var ev"
					+ "t=document.createEvent('Event');evt.initEvent(event,true,false);"
					+ "evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);};emit('"
					+ "dragstart',src);emit('dragenter',tgt);emit('dragover',tgt);emit("
					+ "'drop',tgt);emit('dragend',src);";
			js.executeScript(java_script, Sourcelocator, Destinationlocator);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}