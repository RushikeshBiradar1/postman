package DifferentWaysToPostRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectWithJsonObject {
	@Test
	public void createproj()
	{
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Rushi");
		jobj.put("createdOn", "22/12/2022");
		jobj.put("projectName", "RR-11");
		jobj.put("status", "created");
		jobj.put("teamSize", 4);
		 
		given()
		.contentType(ContentType.JSON)
		.body(jobj.toJSONString())
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.log().all();
		
		
	}

}
