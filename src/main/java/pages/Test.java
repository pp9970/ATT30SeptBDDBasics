package pages;

import org.openqa.selenium.WebDriver;

public class Test {
	
	WebDriver driver;//null
	
	public void m1()
	{
		driver.close();
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.m1();
		
	}

}
