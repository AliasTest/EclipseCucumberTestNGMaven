package stepDefenitionUI;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.testng.Assert;
import common.Time;
import cucumber.TestContext;
import enums.Context;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utility.RESTLibrary;

public class EmailVerification {

	public EmailVerification(TestContext context) {
		testContext = context;
	};

	RESTLibrary restLibrary = new RESTLibrary();
	Time time = new Time();
	public RequestSpecification request;
	public JSONObject requestParams;
	public Response response;
	TestContext testContext;
	String[] emailToVerify = new String[1];

	@Then("Verify {string} for HydraAPI to avoid manual delete from database")
	public void verify_email_for_hydra_api_to_avoid_manual_delete_from_database(String emailType)
			throws IOException, InterruptedException {
		Thread.sleep(4000);
		request = restLibrary.StartBuildingTheRESTTestInitialise();
		requestParams = new JSONObject();
		if (emailType.contains("ViewerEmail")) {
			emailToVerify[0] = (String) testContext.scenarioContext.getContext(Context.VIEWER_EMAIL);
		} else if (emailType.contains("AdminEmail")){
			emailToVerify[0] = (String) testContext.scenarioContext.getContext(Context.ADMIN_EMAIL);
		}
		requestParams.put("emails", emailToVerify);
		request.header("Content-Type", "application/json"); // Add the Json to the body of the request
		request.auth().preemptive().basic("hello", "fduu");
		request.body(requestParams.toString()); // Post the request and check the response
		response = request.post("/v1/emails/verify");
		response.prettyPrint();
	}
}