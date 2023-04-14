package stepDefenitionUI;

import utility.ConfigFileReader;
import utility.WebDriverLibrary;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.TakesScreenshot;
import java.io.IOException;
import org.openqa.selenium.OutputType;

public class Hooks extends WebDriverLibrary {
	WebDriverLibrary webDriverLibrary = new WebDriverLibrary();
	ConfigFileReader configFileReader = new ConfigFileReader();
	public String browserType;

	@Before
	public void browserSetup() throws IOException {

		browserType = configFileReader.getProprtyUrl("browserType");
		if (browserType.contentEquals("Chrome")) {
			webDriverLibrary.chromeDriverSetup();
		} else if (browserType.contentEquals("Firefox")) {
			webDriverLibrary.fireFoxDriverSetup();
		} else if (browserType.contentEquals("IE")) {
			webDriverLibrary.ieDriverSetup();
		}

		else if (browserType.contentEquals("IE")) {
			webDriverLibrary.ieDriverSetup();
		}
	}

	@After
	public void takeScreenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "test");
		}
	}

	@After
	public void teardown() {
		if (!browserType.contentEquals("API"))
			closeBrowser();
	}
}
