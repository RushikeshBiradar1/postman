package CRUDWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibrary.RandomNumber;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
	@Test
	public void addProject()
	{
		RandomNumber jlib = new RandomNumber();
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Rushi");
		jobj.put("projectName", "tyss_01"+jlib.GetRandomNumber());
		jobj.put("status", "created");
		jobj.put("teamSize", 7);
		
		RequestSpecification resp = RestAssured.given();
		resp.body(jobj);
		resp.contentType(ContentType.JSON);
		
		Response res = resp.post("http://localhost:8084/addProject");
		res.then().log().all();
		int statuscode = res.statusCode();
		
	}

}
