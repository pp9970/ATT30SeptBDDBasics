package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is at login page")
	public void preRequisite()
	{
		System.out.println("Given statement");
	}
	
	@When("user enters username")
	public void enterUsername()
	{
		System.out.println("Entering username");
	}
	
	@When("user enters password")
	public void enterPassword()
	{
		System.out.println("Entering password");
	}
	
	@When("user click on login button")
	public void clickOnLoginButton()
	{
		System.out.println("Clicking on login button");
	}
	
	@Then("user should redirect to homepage")
	public void validateLogin()
	{
		System.out.println("Validating login behavior");
	}
	
//	@Given("user should be at login page")//CTRL + SHIFT + C
//	public void user_should_be_at_login_page() {
//	    System.out.println("Given statement for title scenario");
//	}
	@Then("title of page should visible")
	public void title_of_page_should_visible() {
	    System.out.println("Then statement for title");
	}
	
	
	
}
