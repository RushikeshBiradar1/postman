package CRUDWithoutBDD;

import java.util.Random;

import org.json.simple.JSONObject;
import org.junit.Test;

import GenericLibrary.RandomNumber;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class UpdateProject {
	@Test
	public void update()
	{
		RandomNumber jlib = new RandomNumber();
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "MMR");
		jobj.put("createdOn", "21/12/2022");
		jobj.put("status", "created");
		jobj.put("ProjectName", "RRRM_001"+jlib.GetRandomNumber());
		jobj.put("projectId", "1223Rm");
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON)
		.request().body(jobj.toJSONString())
		.when()
		.put("http://localhost:8084/projects/TY_PROJ_808")
		.then().log().all();
		
		
	}

}
