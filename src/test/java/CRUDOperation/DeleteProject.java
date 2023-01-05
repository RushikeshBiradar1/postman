package CRUDOperation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteProject {
	@Test
	public void delete()
	{
		when()
		.delete("http://localhost:8084/projects/TY_PROJ_1008")
		.then().log().all();
	}

}
