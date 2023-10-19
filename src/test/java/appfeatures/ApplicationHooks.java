package appfeatures;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.DriverFactory;
import utility.ConfigLoader;

public class ApplicationHooks {
	DriverFactory df;
	
	WebDriver driver;
	
	@Before
	public void launchBrowser() throws IOException
	{
		df = new DriverFactory();
		
		driver = df.initBrowser(ConfigLoader.readConfigData("browser"));
		
		driver.manage().window().maximize();
	
	}
	
	@After(order = 2)
	public void tearDown(Scenario scenario)
	{
		if(	scenario.isFailed())
		{
			String nameOfScenario = scenario.getName();
			
			String ScenarioName = nameOfScenario.replace(" ", "_");
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
		 byte[] source = ts.getScreenshotAs(OutputType.BYTES);
		 
		 scenario.attach(source, "image/png", ScenarioName);
			
		}
	}
	
	@After(order = 1)
	public void closingBrowser()
	{
		driver.quit();
	}
	

}
