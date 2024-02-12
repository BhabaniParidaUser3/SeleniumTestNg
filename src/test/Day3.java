package test;

import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void mobileLogincarLoan()
	{
		System.out.println("mobilelogincarLoan");
	}

	@Test
	public void apiLogincarLoan()
	{
		System.out.println("apilogincarloan");
	}

	@Test
	public void webLogincarLoan()
	{
		System.out.println("weblogincarloan");
	}
	
	@Test(groups= {"smoke"})
	public void group3()
	{
		System.out.println("Smoke group method called from Day3");
	}
}
