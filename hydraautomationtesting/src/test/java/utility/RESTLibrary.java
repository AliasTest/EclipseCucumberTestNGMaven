package utility;

import java.io.IOException;
import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RESTLibrary {	
	
	private HashMap<String, String> jsonBody;
	
	public  RequestSpecification StartBuildingTheRESTTestInitialise() throws IOException
	{
		ConfigFileReader configFileReader = new ConfigFileReader();	
		String apiURL = configFileReader.getProprtyUrl("hydraAPIDevURL");		
		RestAssured.baseURI = apiURL;
		RequestSpecification request = RestAssured.given();
		return request;
	}
	public  HashMap<String, String> getJsonBody(Response response, String key) 
	{
	JsonPath bodyExtract=response.jsonPath();
	jsonBody=bodyExtract.get(key);
	return jsonBody;
	}
	
	public  HashMap<String,HashMap<String, String>> getJsonDataMapInsideMapBody(Response response, String key) 
	{
	JsonPath bodyExtract=response.jsonPath();
	return bodyExtract.get(key);	
	}
	
}
