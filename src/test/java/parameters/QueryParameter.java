package parameters;

import org.junit.Test;

import static  io.restassured.RestAssured.*;

public class QueryParameter {
	@Test
	public void queryPara()
	{
		String BaseUri="http://localhost";
		String port="8084";
		
		=when().get("projectId");
	}

}
