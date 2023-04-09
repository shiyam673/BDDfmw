package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class RetrieveUser {
	
	@Given("^User is in$")
	public void user_is_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    RestAssured.baseURI = "https://api.github.com/repos";
	    
	}

	@When("^Hit the api and get the response$")
	public void hit_the_api_and_get_the_response() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RequestSpecification httpreq =RestAssured.given().log().all();
		httpreq.request(Method.GET);
	    
	}

	@Then("^Validate the response code and message$")
	public void validate_the_response_code_and_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		
	}

	@Then("^Assert values$")
	public void assert_values() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
