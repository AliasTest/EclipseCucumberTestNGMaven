package stepDefenitionAPI;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.testng.Assert;
import common.Time;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utility.RESTLibrary;

public class HydraUserCreation {

	public Response response;
	public String uniqueEmail;
	RESTLibrary restLibrary = new RESTLibrary();
	Time time = new Time();
	private HashMap<String, String> actualDataMapResponseBody;
	private HashMap<String, String> actualUserMapResponseBody;
	private HashMap<String, HashMap<String, String>> actualDataUserMapResponseBody;
	public RequestSpecification request;
	public JSONObject requestParams;
	public String countryCodeToPassOtherFunctions;
	public String mobileToPassOtherFunctions;
	private String uniqueMobile;

	@Given("^Create a user with \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void i_want_to_create_a_user_with(String email, String password, String firstName, String lastName,
			String countryCode, String type, String captchaToken) throws IOException, InterruptedException {
		Thread.sleep(2000);
		countryCodeToPassOtherFunctions = countryCode;
		request = restLibrary.StartBuildingTheRESTTestInitialise();
		requestParams = new JSONObject();
		uniqueEmail = time.getCurrentTime() + email;
		requestParams.put("email", uniqueEmail);
		requestParams.put("password", password);
		requestParams.put("firstName", firstName);
		requestParams.put("lastName", lastName);
		requestParams.put("countryCode", countryCode);
		uniqueMobile=time.getCurrentTimeForUniqueMobile();
		requestParams.put("mobile", uniqueMobile);
		requestParams.put("type", type);
		requestParams.put("captchaToken", captchaToken);
		request.header("Content-Type", "application/json"); // Add the Json to the body of the request
		request.body(requestParams.toString()); // Post the request and check the response
		response = request.post("/v1/auth/register");
		response.prettyPrint();
	}

	@Then("Verfify the response code should be {int}")
	public void verfify_the_response_code_should_be(Integer responseCode) {
		long LongResponseCode = responseCode;
		Assert.assertEquals(response.getStatusCode(), LongResponseCode);
	}

	@Then("Verify the response header value {string} should be {string}")
	public void verify_the_response_header_is(String headerName, String headerValue) {
		Assert.assertEquals(response.header(headerName), headerValue);
	}

	@Then("Verify the data map response body should include the following in any order")
	public void response_includes_the_following_in_any_order(DataTable dataTable) {
		actualDataMapResponseBody = restLibrary.getJsonBody(response, "data");
		Map<String, String> dataTableKeyValues = dataTable.asMap();
		for (Map.Entry<String, String> ExpectedresponseBody : dataTableKeyValues.entrySet())
			Assert.assertEquals(ExpectedresponseBody.getValue(),
					actualDataMapResponseBody.get(ExpectedresponseBody.getKey()));
	}

	@Then("Verify the data user map response body should include the following in any order")
	public void data_user_map_response_includes_the_following_in_any_order(DataTable dataTable) {
		actualDataUserMapResponseBody = restLibrary.getJsonDataMapInsideMapBody(response, "data");
		actualUserMapResponseBody = actualDataUserMapResponseBody.get("user");
		Map<String, String> dataTableKeyValues = dataTable.asMap();
		for (Map.Entry<String, String> ExpectedresponseBody : dataTableKeyValues.entrySet())
			Assert.assertEquals(ExpectedresponseBody.getValue(),
					actualUserMapResponseBody.get(ExpectedresponseBody.getKey()));
	}

	@Then("Verify the response time should be less than {int} milliseconds")
	public void verify_the_response_time_is_less_than_milliseconds(Integer responseTime) {
		long longResponseTime = responseTime;
		Assert.assertTrue(response.getTime() < longResponseTime);
	}

	@Then("^Login with the created user \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void login_with_the_created_user(String email, String password, String captchaToken) throws IOException {
		request = restLibrary.StartBuildingTheRESTTestInitialise();
		requestParams = new JSONObject();
		requestParams.put("email", uniqueEmail);
		requestParams.put("password", password);
		requestParams.put("captchaToken", captchaToken);
		request.header("Content-Type", "application/json"); // Add the Json to the body of the request
		request.body(requestParams.toString()); // Post the request and check the response
		response = request.post("/v1/auth/login");
	}

	@Then("Send OTP")
	public void send_the_otp() throws IOException {
		request = restLibrary.StartBuildingTheRESTTestInitialise();
		requestParams = new JSONObject();
		requestParams.put("countryCode", countryCodeToPassOtherFunctions);
		requestParams.put("mobile", uniqueMobile);
		requestParams.put("otp", 6543);
		request.header("Content-Type", "application/json"); // Add the Json to the body of the request
		request.body(requestParams.toString()); // Post the request and check the response
		response = request.post("/v1/auth/verify-otp");
		response.prettyPrint();		
	}

	@And("Verify OTP received")
	public void verify_the_otp_received() throws IOException {
		actualDataMapResponseBody = restLibrary.getJsonBody(response, "data");
		Assert.assertNotNull(actualDataMapResponseBody.get("otp"));
	}

	@When("Resend OTP")
	public void resend_otp() throws IOException {
		request = restLibrary.StartBuildingTheRESTTestInitialise();
		requestParams = new JSONObject();
		requestParams.put("countryCode", countryCodeToPassOtherFunctions);
		requestParams.put("mobile", uniqueMobile);
		request.header("Content-Type", "application/json"); // Add the Json to the body of the request
		request.body(requestParams.toString()); // Post the request and check the response
		response = request.post("/v1/auth/resent-otp");
		response.prettyPrint();
	}
	
	@When("Send forgot password link")
	public void send_forgot_password_link() throws IOException {
		request = restLibrary.StartBuildingTheRESTTestInitialise();
		requestParams = new JSONObject();	
		requestParams.put("email", uniqueEmail);
		request.header("Content-Type", "application/json"); // Add the Json to the body of the request
		request.body(requestParams.toString()); // Post the request and check the response
		response = request.post("/v1/auth/forgot-password");
		response.prettyPrint();
	}
}
