package Validation;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticValifation {
	@Test
	public void staticVal()
	{
		String expData="TY_PROJ_1002";
		baseURI ="http://localhost:";
		port =8084;
		
		Response resp = when().get("/projects");
		
		//validation
        String actData = resp.jsonPath().getString("[0].projectId");
		Assert.assertEquals(actData, expData);
		System.out.println("data verified");
		
		resp.then().log().all();
		
	}

}
