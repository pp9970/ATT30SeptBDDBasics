package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			
			features = {"src\\test\\resources\\applicationfeature\\AccountDetails.feature"},
			
			glue = {"steps"},
			
			publish = true
					
			)
	
	
	public class AccountDetailsRunner extends AbstractTestNGCucumberTests {
	
	}
