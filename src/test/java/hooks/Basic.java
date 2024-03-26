package hooks;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Basic {
	
	
	@Test
	public void testCase()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='a-carousel-card']//img[@alt='Outdoortoys']")));
		
		WebElement element = driver.findElement(By.xpath("//*[@class='a-carousel-card']//img[@alt='Outdoortoys']"));
		
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].click();", element);
	}

}
