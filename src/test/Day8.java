package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day8 {
	@BeforeMethod
	public void before()
	{
		System.out.println("this method call before each method call");
	}
	
	@AfterMethod
	public void after()
	{
		System.out.println("this method call after ecah method call");
	}
	
	@Test
	public void PersonalLona1() {
		System.out.println("Method1 call");
	}
	
	@Test
	public void PersonalLona2() {
		System.out.println("Method2 call");
	}
	
	@Test(groups= {"smoke"})
	public void group8()
	{
		System.out.println("Smoke group method called from Day8");
	}

}
