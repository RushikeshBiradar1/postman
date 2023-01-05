package CRUDOperation;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class getSingleProject {
	@Test
	public void GetSingleProject()
	{

		when()
		.get("http://localhost:8084/projects/TY_PROJ_621")
			  .then()
			  .statusCode(200)
			  .and()
			  .log().all();
			 
	}

}
