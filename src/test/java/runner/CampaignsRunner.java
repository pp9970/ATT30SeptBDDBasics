package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationfeature\\Campaigns.feature"},
		glue = {"steps", "hooks"},
		tags = "@sanity or @regression"
//		dryRun = true
		)
public class CampaignsRunner extends AbstractTestNGCucumberTests {

}
