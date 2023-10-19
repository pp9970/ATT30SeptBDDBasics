package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

	WebDriver driver;
	
	WebDriverWait wait;

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

	@FindBy(xpath = "//*[@id='maincontent']//*[text()='Men123']")
	WebElement menSection;
	
	

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public void clickOnSection() {
		menlink.click();
	}

	public boolean sectionInfo() {
		boolean isDisplaying = menSection.isDisplayed();

		return isDisplaying;

	}

	public void selectProduct() {
		clickOnSection();

		heroHoodie.click();

	}

	public boolean verifyingButton() {
		boolean isDisplaying = addToCartButton.isDisplayed();

		return isDisplaying;
	}

	public void selectSize() {
		size.click();
		color.click();
	}

	public void clickOnAddToCart() {
		addToCartButton.click();
	}

	public String fetchMessage() {
		
		wait.until(ExpectedConditions.visibilityOf(toastMessage));
		
		String message = toastMessage.getText();

		return message;
	}

}
