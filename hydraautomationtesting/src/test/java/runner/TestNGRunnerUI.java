package runner;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utility.ConfigFileReader;
import java.util.Properties;


@CucumberOptions(tags = "@UI_VerifyRemoveUser", features = "src/test/java/featuresUI", glue = { "stepDefenitionUI"}, plugin = { "json:target/UI_cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class TestNGRunnerUI extends AbstractTestNGCucumberTests {
	public static Properties CONFIG = null;
	public static Properties OR = null;
	public static boolean isBrowserOpen = false;

	@Parameters("browser")
	@BeforeClass
	public void beforeclass(String browser) throws IOException {
		ConfigFileReader configFileReader = new ConfigFileReader();
		configFileReader.setProprtyKeyValue("browserType", browser);
	}
}
