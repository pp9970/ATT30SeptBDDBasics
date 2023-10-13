package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationfeature\\PlacingOrder.feature"},
		glue = {"steps"}
		
//		dryRun = true
		)
public class OrderPlacingRunner extends AbstractTestNGCucumberTests{

}
