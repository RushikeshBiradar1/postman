package CRUDWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getSingleProject {
	@Test
	public void getsingle()
	{
	Response resp = RestAssured.get("http://localhost:8084/project/TY_PROJ_1007");
	resp.getStatusCode();
	resp.contentType();
	resp.then().log().all();
	}

}
