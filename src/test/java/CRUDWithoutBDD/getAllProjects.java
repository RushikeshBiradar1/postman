package CRUDWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class getAllProjects {
	@Test
	public void getsingle()
	{
	Response resp = RestAssured.get("http://localhost:8084/projects");
	resp.getStatusCode();
	resp.contentType();
	resp.then().log().all().assertThat().statusCode(200).contentType(ContentType.JSON);
	}

}
