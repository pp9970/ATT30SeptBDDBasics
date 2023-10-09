package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	
	@Given("user should be logged in")
	public void user_should_be_logged_in() {
	  System.out.println("Given first statement");
	}

	@Given("User should be at home page")
	public void user_should_be_at_home_page() {
		 System.out.println("Given second statement");
	}

	@When("user click on add profile button")
	public void user_click_on_add_profile_button() {
	    System.out.println("clicking on add profile button");
	      throw new NullPointerException();
	}

	@When("user enters the details")
	public void user_enters_the_details() {
	   System.out.println("Entering the details"); 
	}

	@Then("user should have profile id")
	public void user_should_have_profile_id() {
	  System.out.println("Profile id got created");
	}

	@When("user click on edit profile button")
	public void user_click_on_edit_profile_button() {
	   System.out.println("Click on edit");
	}

	@When("user updates the details")
	public void user_updates_the_details() {
	   System.out.println("Updating the details");
	}

	@Then("user should be able to update")
	public void user_should_be_able_to_update() {
	   System.out.println("Profile gets updated");
	}

	@When("user click on delete profile button")
	public void user_click_on_delete_profile_button() {
	    System.out.println("Click on delete button");
	}

	@Then("user should get deleted")
	public void user_should_get_deleted() {
	   System.out.println("Profile got deleted");
	}


}
