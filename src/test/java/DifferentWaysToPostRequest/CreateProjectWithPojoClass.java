package DifferentWaysToPostRequest;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;

public class CreateProjectWithPojoClass {
	
	/**
	 * Post(): create the resource inside the server
	 * URI :http://localhost:8084/addProject
	 */
	
	@Test
	public void createProjectTest() {
		
		PojoClass.CreateProjectWithPojoClass pObj = new PojoClass.CreateProjectWithPojoClass("TestYantra", "Ty-1222", "created", 10, "prakash", "17/12/2022");

		given().contentType(ContentType.JSON).
		body(pObj,ObjectMapperType.JACKSON_1).
		when().post("http://localhost:8084/addProject").
		then().log().all();
		
		
	}

}