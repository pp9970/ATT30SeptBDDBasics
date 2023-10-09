package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@Given("user is at signup page")
	public void user_is_at_signup_page() {
	   System.out.println("Given statement");
	}

	@When("user enters {string} inside form")
	public void user_enters_inside_form(String name) {
	    System.out.println("Entered name is "+name);
	}

	@When("user enters age as {int}")
	public void user_enters_age_as(Integer age) {
	    System.out.println("Entered age is "+age);
	}

	@When("user confirms {string} checkbox")
	public void user_confirms_checkbox(String gender) {
	   System.out.println("Selected gender is "+gender);
	}

	@Then("user gets created")
	public void user_gets_created() {
	    System.out.println("User id has created");
	}

	
	@Then("url of should contains {string}")
	public void urlValidation(String word) {
	    System.out.println("word is "+word);
	}

}
