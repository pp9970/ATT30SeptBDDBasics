package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignSteps {
	@Given("user is at campaigns page")
	public void user_is_at_campaigns_page() {
	   System.out.println("Given statement");
	}

	@When("user click on create campaign")
	public void user_click_on_create_campaign() {
	    System.out.println("Click on create button");
	}

	@When("user enters information")
	public void user_enters_information() {
		System.out.println("Entering the information");
	}

	@Then("status of campaign should get draft")
	public void status_of_campaign_should_get_draft() {
		System.out.println("Campaign should gets created");
	}

	@When("user click on edit campaign")
	public void user_click_on_edit_campaign() {
		System.out.println("Click on edit button");
	}

	@When("enter the date and time")
	public void enter_the_date_and_time() {
	   System.out.println("Entering date and time");
	}

	@Then("status of campaign should get scheduled")
	public void status_of_campaign_should_get_scheduled() {
	  System.out.println("Status of campaign changed to scheduled");
	}

	@When("user click on active button")
	public void user_click_on_active_button() {
	    System.out.println("Clicking on active button");
	}

	@Then("status of campaign should get sent")
	public void status_of_campaign_should_get_sent() {
	    System.out.println("Status changed to sent");
	}


}
