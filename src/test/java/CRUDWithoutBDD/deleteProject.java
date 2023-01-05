package CRUDWithoutBDD;

import static org.junit.Assert.assertThat;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class deleteProject {
	@Test
	public void delete()
	{
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_1005");
		int stscode = resp.getStatusCode();
		Assert.assertEquals(stscode, 204);
	}

}
