package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddingProduct {
	
	private String productName;
	
	public String getProductName()
	{
		return productName;
	}
	
	
	
	@Given("I should be at product page")
	public void i_should_be_at_product_page() {
	  System.out.println("Given statement");
	}

	@When("I click on the add to cart button")
	public void i_click_on_the_add_to_cart_button() {
	   System.out.println("Clicking on add to cart");
	}

	@Then("Product should get added")
	public void product_should_get_added() {
		 productName = "Black jacket";
	 System.out.println("Product added and generated id is :"+productName);
	}

	


}
