package authentication;

import static io.restassured.RestAssured.*;

import org.junit.Test;

public class BasicAuth {
	@Test
	public void basicauth()
	{
		
		baseURI="http://localhost";
		port=8084;
		given()
		.auth().basic("rmgyantra","rmgy@9999")
		.when()
		.get("/login")
		.then()
		.assertThat().statusCode(202).log().all();
		
		
	}

}
