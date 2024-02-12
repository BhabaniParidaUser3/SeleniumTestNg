package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day7 {

	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("after suite");
	}
	
	@Test(groups= {"smoke"})
	public void group7()
	{
		System.out.println("Smoke group method called from Day7");
	}
}
