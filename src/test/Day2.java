package test;

import org.testng.annotations.Test;

public class Day2 {
	
	@Test
	public void ass()
	{
		System.out.println("ass");
	}

	@Test(groups= {"smoke"})
	public void group2()
	{
		System.out.println("Smoke group method called from Day2");
	}
}
