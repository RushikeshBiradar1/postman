package authentication;

import org.junit.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class Oauth2_0 {
	@Test
	public void oauthAuthentication()
	{
		baseURI="http://coop.apps.symfonycasts.com";
		
		 Response resp = given()
				 .formParam("client_Id", "Rushi1")
				 .formParam("client_secret", "9f795f4f55eb98b9ca8e13de87ae11e6")
				 .formParam("grant_type", "client_credentials")
				 .formParam("redirect_uri", "http://example.com")
				 .formParam("code", "authorization_code")
				 
				 .when()
				 .post("http://coop.apps.symfonycasts.com");
		String token = resp.jsonPath().get("access_token");
		 
		 given()package genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;



/**
 * This library consist of method related to Database
 * @author Kalpana Shetty
 *
 */
public class DatabaseLibrary {

	Driver driverRef;
	Connection con;
	
	/**
	 * this method will establish the connection with mysql db
	 * @author Kalpana Shetty
	 * @throws SQLException
	 */
	public void connectToDB() throws SQLEx
subham priyadarshi15:44
mam please paste full codes
		 .auth().oauth2(token)
		 .pathParam("USER_ID", 4139);
		 when()
		 .post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count")
		 .then().log().all();
	}

}
