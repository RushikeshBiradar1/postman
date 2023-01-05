package CRUDOperation;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibrary.RandomNumber;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class POSTRequest {
	@Test
	public void PostRequest()
	{
		RandomNumber jlib = new RandomNumber();
		JSONObject jobj = new JSONObject();
		jobj.put("projectId","rm_01j");
		jobj.put("projectName", "MRB"+jlib.GetRandomNumber());
		jobj.put("creadtedBy", "MRB");
		jobj.put("Status", "Created");
		jobj.put("creadtedOn", "29-12-2022");
		jobj.put("teamSize", 5);
		given()
		.contentType(ContentType.JSON)
		.body(jobj.toJSONString())
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.log().all();
		
		
		
	}

	

}
