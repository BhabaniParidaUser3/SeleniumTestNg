package test;

import org.testng.annotations.Test;

public class Day1 {
	@Test
	public void add()
	{
		System.out.println("Hello");
	}
	
	@Test
	public void substarct()
	{
		System.out.println("subhello");
	}
	
	@Test(groups= {"smoke"})
	public void group1()
	{
		System.out.println("Smoke group method called from Day1");
	}

}
