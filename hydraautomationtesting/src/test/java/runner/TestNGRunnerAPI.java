package runner;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utility.ConfigFileReader;
import java.util.Properties;


@CucumberOptions(tags = "@HydraAPI_Smoke", features = "src/test/java/featuresAPI", glue = { "stepDefenitionAPI"}, plugin = { "json:target/UI_cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class TestNGRunnerAPI extends AbstractTestNGCucumberTests {
	public static Properties CONFIG = null;
	public static Properties OR = null;

	@Parameters("browser")
	@BeforeClass
	public void beforeclass(String browser) throws IOException {
		ConfigFileReader configFileReader = new ConfigFileReader();
		configFileReader.setProprtyKeyValue("browserType", browser);
	}
}
