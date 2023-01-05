package CRUDOperation;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.junit.Test;

import GenericLibrary.RandomNumber;
import io.restassured.http.ContentType;

public class UpdateProject {
	@Test
	public void update()
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
		.post("http://localhost:8084/addProject/TY_PROJ_621")
		.then()
		.log().all();
	}

}
