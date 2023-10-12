package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationfeature\\Campaigns.feature"},
		glue = {"steps", "hooks"},
		publish = true,
		tags = "@sanity or @regression"
				
		)



public class CampaignsRunner extends AbstractTestNGCucumberTests {

}
