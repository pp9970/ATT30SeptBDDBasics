package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[text()='Men']")
	WebElement menlink;

	@FindBy(xpath = "//*[@class='product-item-details']//*[@title='Hero Hoodie']")
	WebElement heroHoodie;
	
	@FindBy(xpath = "//*[@index='2' and text()='M']")
	WebElement size;
	
	@FindBy(xpath = "//*[@id='option-label-color-93-item-49']")
	WebElement color;
	
	@FindBy(xpath = "//*[@type='submit' and @title ='Add to Cart']")
	WebElement addToCartButton;
	
	@FindBy(xpath = "(//*[@class='messages' ])[1]")
	WebElement toastMessage;

	
	public ProductPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
