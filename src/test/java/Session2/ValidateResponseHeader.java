package Session2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateResponseHeader 
{
	@Test()
	void TestCase01()
	{
		RequestSpecification requestSpec = RestAssured.given();
		
		//specify base url
		requestSpec.baseUri("https://reqres.in/");
		requestSpec.basePath("/api/users/2");
		Response response =requestSpec.get();
	}
	
	
	
	
	
	

}
