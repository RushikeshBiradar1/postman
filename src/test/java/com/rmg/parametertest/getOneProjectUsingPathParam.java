package com.rmg.parametertest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class getOneProjectUsingPathParam {
	@Test
	public void getRepoTest()
	{
		
    given()
     .auth().basic("rmgyantra","rmgy@9999")
     .pathParam("ownerName", "RushikeshBiradar1")
     .pathParam("repo","Rushi");
     when()
     .get("https://github.com/{ownerName}/{repo}")
    .then()
   .log().all();
	}

}
