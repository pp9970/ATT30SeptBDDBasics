package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class AppHooks {

//	@BeforeStep
//	public void beforeStep()
//	{
//		System.out.println("Before step");
//	}
//	
//	@AfterStep
//	public void afterStep()
//	{
//		System.out.println("After step");
//	}
	
	@After("@sanity")
	public void afterHook1()
	{
		System.out.println("after hook1 is executing");
	}
	
//	@After(order = 2)
//	public void afterHook2()
//	{
//		System.out.println("after hook2 is executing");
//	}
	
	@Before("@regression")
	public void beforeHook1()
	{
		System.out.println("before hook1 is executing");
	}
	
	
	
	
//	@Before(order = 2)
//	public void beforeHook2()
//	{
//		System.out.println("before hook2 is executing");
//	}
	
	
}
