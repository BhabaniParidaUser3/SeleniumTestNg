package test;

import org.testng.annotations.Test;

public class Day4 {
	
	@Test
	public void mobileLoginHomeLoan()
	{
		System.out.println("mobileloginHomeLoan");
	}

	@Test
	public void apiLoginHomeLoan()
	{
		System.out.println("apiloginHomeloan");
	}

	@Test
	public void webLoginHomeLoan()
	{
		System.out.println("webloginHomeloan");
	}
	@Test(groups= {"smoke"})
	public void group4()
	{
		System.out.println("Smoke group method called from Day4");
	}
}
