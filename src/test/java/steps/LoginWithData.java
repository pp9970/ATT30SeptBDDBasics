package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithData {
//	ctrl + shift + o
	@Given("user should be at loginpage")
	public void user_should_be_at_loginpage() {
	   System.out.println("Given for login page"); 
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String uname) {
	    System.out.println("Entered username is "+uname);
	}

	@When("user enters {string} as password")
	public void user_enters_as_password(String pwd) {
	    System.out.println("Entered password is "+pwd);
	}

	@When("user clicks on submit")
	public void user_clicks_on_submit() {
	    System.out.println("Clicking on submit");
	}

	@Then("user should get logged into application")
	public void user_should_get_logged_into_application() {
	   
		System.out.println("Then statement for login");
	}

}
