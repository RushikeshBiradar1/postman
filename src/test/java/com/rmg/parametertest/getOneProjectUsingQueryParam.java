package com.rmg.parametertest;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class getOneProjectUsingQueryParam {
	@Test
	public void getOneProjectUsingQueryParam()
	{
		 given()
	     .auth().basic("rmgyantra","rmgy@9999")
	     .queryParam("ownerName", "RushikeshBiradar1")
	     .queryParam("repo","Rushi");
	     when()
	     .get("https://github.com/{ownerName}/{repo}")
	    .then()
	   .log().all();
		
		
	}

}
