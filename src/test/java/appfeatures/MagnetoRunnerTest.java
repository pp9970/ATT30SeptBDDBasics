package appfeatures;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures"},
		
		glue = {"appfeatures"},
		
		plugin = {"pretty", "html:target/cucumber-reports/reports.html"}
	)




public class MagnetoRunnerTest extends AbstractTestNGCucumberTests {

}
