package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {
	@Given("user should get logged in")
	public void loginToApp() {
	   System.out.println("Login to the application");
	}
	
	
	@Given("user should be at orders page")
	public void user_should_be_at_orders_page() {
	   System.out.println("nav to orders page");
	}

	@When("user click on current orders")
	public void user_click_on_current_orders() {
	   System.out.println("Click on current order");
	}

	@Then("user should see currently placed order")
	public void user_should_see_currently_placed_order() {
	   System.out.println("Fetching currently placed order");
	}

	@When("user click on past orders")
	public void user_click_on_past_orders() {
		 System.out.println("Click on past order");
	}

	@Then("user should see previously placed order")
	public void user_should_see_previously_placed_order() {
		System.out.println("Fetching past placed order");
	}

	@When("user click on cancel orders")
	public void user_click_on_cancel_orders() {
		System.out.println("Click on cancel order");
	}

	@Then("user should see cancelled information")
	public void user_should_see_cancelled_information() {
		System.out.println("Fetching cancelled order information");
	}

}
