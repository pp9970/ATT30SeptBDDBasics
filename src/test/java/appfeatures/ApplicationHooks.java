package appfeatures;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.DriverFactory;

public class ApplicationHooks {
	DriverFactory df;
	
	WebDriver driver;
	
	@Before
	public void launchBrowser()
	{
		df = new DriverFactory();
		
		driver = df.initBrowser("Chrome");
	
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	

}
