package Tugas5;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Tugas5Test{

	@Test
	public void testRegister() {

		RestAssured.baseURI = "https://kolakproject.herokuapp.com";
		Faker faker = new Faker();
		String username = faker.name().fullName();
		String email = faker.internet().emailAddress();
		String phoneNumber = faker.phoneNumber().cellPhone();
		String password = "123123";
		
		String registerPayload = String.format("{\"username\": \"%s\", \"password\":\"%s\", \"email\":\"%s\", \"phonenumber\":\"%s\"}", username, password, email, phoneNumber);
		System.out.println(registerPayload);
		Response response = RestAssured.given().contentType("application/json").body(registerPayload).when().post("/register");
		assertEquals(response.getStatusCode(), 201);
	}

}

