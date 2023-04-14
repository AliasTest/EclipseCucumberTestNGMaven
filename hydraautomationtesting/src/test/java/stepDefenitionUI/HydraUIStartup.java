package stepDefenitionUI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HydraHome;
import utility.ConfigFileReader;
import utility.WebDriverLibrary;
import java.io.IOException;
import org.testng.Assert;

public class HydraUIStartup extends WebDriverLibrary {	
	
	public String uRL;
	ConfigFileReader configFileReader = new ConfigFileReader();	
	HydraHome hydraHome = new HydraHome(driver);

	@Given("Start HydraUI")
	public void start_Hydra_UI() throws IOException, InterruptedException {		
		uRL = configFileReader.getProprtyUrl("hydraDevUrl");		
		driver.get(uRL);
		Thread.sleep(10000);
	}

	@Then("Verify {string} button should be displayed")
	public void verify_the_text_displayed(String ExpectedGoogleText) {		
		Assert.assertNotNull(hydraHome.Button(ExpectedGoogleText));    
	}	
}