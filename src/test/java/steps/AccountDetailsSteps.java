package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

	public class AccountDetailsSteps {
		
		@Given("user should be at account opening page")
		public void user_should_be_at_account_opening_page() {
		    System.out.println("Given statement");
		}
	
		@When("user enters the following data")
		public void user_enters_the_following_data(DataTable dataTable) {
		    
			List<List<String>> data = dataTable.asLists();
			
			List<String> firstList = data.get(0);
			
			System.out.println(firstList);//[firstname, lastname, email, mobile]
			
			String firstElementOfList = firstList.get(0);
			
			System.out.println(firstElementOfList);//Erin
			String email = data.get(1).get(2);
					
			System.out.println(email);//robert.jackson@gmail.com 
			
//			reading datatable using Map
			
			List<Map<String, String>> data1 = dataTable.asMaps();
			
			String mobilenumber = data1.get(1).get("mobile");
			
			System.out.println(mobilenumber);
			
			
			
			
		}
	
		@When("user click on submit button")
		public void user_click_on_submit_button() {
		    System.out.println("Clicking on submit button");
		}
	
		@Then("user account gets created")
		public void user_account_gets_created() {
		    System.out.println("Account id created");
		}
	
	
	}
