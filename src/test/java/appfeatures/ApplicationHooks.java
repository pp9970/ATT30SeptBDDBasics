package appfeatures;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
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
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	

}
