package DifferentWaysToPostRequest;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectWithJsonFile {
	@Test
	public void createProject()
	{
		File file = new File("./data/rushi.json");
		given()
		.contentType(ContentType.JSON)
		.body(file)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		//.assertThat().statusCode(201)
		.log().all();
	}

}
