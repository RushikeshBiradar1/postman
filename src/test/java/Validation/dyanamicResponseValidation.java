package Validation;

import org.junit.Test;
import org.testng.Assert;

import groovyjarjarantlr.collections.List;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class dyanamicResponseValidation {
	@Test
	public void dynamicvalidation()
	{
		String expData="TY_PROJ_1002";
		baseURI ="http://localhost";
		port =8084;
		
		Response resp = when().get("/projects");
		
		//validation
		boolean flag=false;
	java.util.List<String> pIDs = resp.jsonPath().get("projectId");
		
	for(String projectID : pIDs)
	{
		if(projectID.equalsIgnoreCase(expData))
	}
	}

}
