package Validation;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;
import org.hamcrest.Matcher;
public class ResponseTimeValodation {
	@Test
	public void ResponseTimeValidation()
	{
		when().get("http://localhost:8084/projects")
		.then().assertThat().time(Matchers.lessThan(100L),TimeUnit.MILLISECONDS).log().all();
	}
}
