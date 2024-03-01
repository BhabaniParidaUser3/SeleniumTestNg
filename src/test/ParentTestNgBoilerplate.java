package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ParentTestNgBoilerplate {
	
	public void Parentmethod1()
	{
		System.out.println("ParentMethod1");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}

	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}
}
