package test;

import org.testng.annotations.Test;

public class Day5 {
	@Test
	public void MobileLoginHomePage()
	{
		System.out.println("MobileLoginHomePage");
		
	}
	
	@Test
	public void MobileLoginSignInPage()
	{
		System.out.println("MobileLoginSignInPage");
	}
	@Test
	public void MobileLoginSignUpPage()
	{
		System.out.println("MobileLoginSignUpPage");
	}
	@Test
	public void WebLoginHomePage()
	{
		System.out.println("WebLoginHomePage");
	}
	
	@Test
	public void WebLoginSignInPage()
	{
		System.out.println("WebLoginSignInPage");
	}
	@Test
	public void WebLoginSignUpPage()
	{
		System.out.println("WebLoginSignUpPage");
	}

	@Test(groups= {"smoke"})
	public void group5()
	{
		System.out.println("Smoke group method called from Day5");
	}

}
