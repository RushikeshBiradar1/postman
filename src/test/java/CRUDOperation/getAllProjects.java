package CRUDOperation;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class getAllProjects {
	@Test
	public void getTest()
	{
      
		when()
		.get("http://localhost:8084/projects")
		.then()
		.log().all().statusCode(200).assertThat().contentType(ContentType.JSON);
		
		
		  
		 
	}

}
