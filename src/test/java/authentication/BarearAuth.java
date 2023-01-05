package authentication;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BarearAuth {
	@Test
	public void barearAuth()
	
	{
		baseURI="https://api.github.com";
		JSONObject jobj = new JSONObject();
		jobj.put("name", "onlineReastAssured-1.00");
		
		given()
		.auth()
		.oauth2("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")
		.body(jobj)
		.contentType(ContentType.JSON)
		
		.when()
		.post("./user/repos")
		
		.then().log().all();
		
		
		
	}

}
