package org.stepsfile;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Sample1_GetMethod {

	Response response;
	
	@Given("User should pass the valid url in respective get method")
	public void user_should_pass_the_valid_url_in_respective_get_method() {
		 response = RestAssured.get("https://reqres.in/api/users?page=2");
	}
	
	@Given("User should pass the invalid url in respective get method")
	public void user_should_pass_the_invalid_url_in_respective_get_method() {
		response = RestAssured.get("https://reqres.in/api?page=2");
	}
	
	@When("User should get the response time")
	public void user_should_get_the_response_time() {
	    long time = response.getTime();
	    System.out.println("The response time of the get method is" + time);
	}
	@When("User should get the body in json format")
	public void user_should_get_the_body_in_json_format() {
	    String asPrettyString = response.getBody().asPrettyString();
	    System.out.println("The body is in a json format" + asPrettyString);
	}
	@Then("User should get the response code and verify")
	public void user_should_get_the_response_code_and_verify() {
	    int statusCode = response.getStatusCode();
	    Assert.assertEquals(statusCode, 200);
	}
	
	@Then("User should get the response code and verify the error msg")
	public void user_should_get_the_response_code_and_verify_the_error_msg() {
	   int errorStatusCode = response.getStatusCode();
	   Assert.assertNotEquals("The success code in not equal", errorStatusCode, 202);
	}
}
