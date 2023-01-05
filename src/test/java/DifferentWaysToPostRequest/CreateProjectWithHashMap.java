package DifferentWaysToPostRequest;

import org.testng.annotations.Test;

import GenericLibrary.RandomNumber;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class CreateProjectWithHashMap {
	@Test
	public void createproject()
	{
		RandomNumber ran = new RandomNumber();
		HashMap<String, Object> jobj = new HashMap<String, Object>();
		jobj.put("createdBy", "RRR");
		jobj.put("createdOn", "23/12/2022");
		jobj.put("projectName", "MR-11"+ran.GetRandomNumber());
		jobj.put("status", "Ongoing");
		jobj.put("teamSize", 4);
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.when()
		.post("http://localhost:8084/addProject")
		.then().log().all();
	}

}
