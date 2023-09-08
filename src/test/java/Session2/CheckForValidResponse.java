package Session2;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CheckForValidResponse 
{
	@Test
	void TestCase01()
	{
		//Specify base url
		RestAssured.baseURI= "https://reqres.in/api/users/2";
		
		//Get Request Specification of the request
		RequestSpecification requestSpec = RestAssured.given();
		
		//call get method
		Response response = requestSpec.get();
		
		//get response code
		int statuCode = response.getStatusCode();
		
		//validat Expected and Actual
		Assert.assertEquals(statuCode, 200,"Incorrcect statusCode Returned");
		
		String statusLine = response.getStatusLine();
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK","Incorrcect statusLine Returned");
		
	}
	
	@Test
	void TestCase02()  // IN BDD
	{
		RestAssured.given().when().get("https://reqres.in/api/users/2").then().statusCode(200).statusLine("HTTP/1.1 200 OK");
	}

}
