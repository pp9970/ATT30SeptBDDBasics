package steps;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderConfirmationSteps {

	AddingProduct addingProduct;
	
	public OrderConfirmationSteps(AddingProduct addingProduct)
	{
		this.addingProduct = addingProduct;
	}
	
	
	@When("I click on place order button")
	public void i_click_on_place_order_button() {
	   System.out.println("confirming the order");
	}

	@Then("Order should get confirmed")
	public void order_should_get_confirmed() {
	   System.out.println("Order id generated");
	   
	   String productName = addingProduct.getProductName();
	   
	   System.out.println("Received productname is "+productName);
	   
	   Assert.assertEquals("Black jacket", productName);
	   
	   
	}

	
}
