
package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import GenericLibrary.RandomNumber;
import PojoClass.CreateProjectWithPojoClass;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

@Test
public class dataprov {
	public void data(String createdBy, String projectName, String Status, int teamSize, String projectId, String createdOn )
	{
		RandomNumber jlib = new RandomNumber();
		
		CreateProjectWithPojoClass plib = new CreateProjectWithPojoClass( projectName,  projectId,  Status, teamSize, createdBy,createdOn);
		baseURI="http://localhost";
		port=8084;
		
		given()
		.body(plib)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/addProject")
		
		.then().assertThat().statusCode(201).log().all();
		
		
	}
	@DataProvider(name = "data")
	public Object[][] data()
	{
		Object [][]data = new Object[2][2];
		data[0][0]="Ty_001";
		data [0][1]="RR-01";
		data[0][2]="completed";
		data[0][3]=4;
		data[0][4]="rushi";
		data[0][5]="23/12/2022";
		
		data[1][0]="TYR-02";
	    data[1][1]="RR-02";
		data[1][2]="created";
		data[1][3]=5;
		data[1][4]="rushi";
		data[1][5]="24/12/2022";
		
		data[1][0]="TYR-03";
	    data[1][1]="RR-021";
		data[1][2]="on-going";
		data[1][3]=6;
		data[1][4]="rushikesh";
		data[1][5]="25/12/2022";
		return data;
		
	}

}
