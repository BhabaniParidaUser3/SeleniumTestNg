package test;

import org.testng.annotations.Test;

public class AnnotationHelperAttribute {

	@Test(timeOut=4000)
	public void SignUppage()
	{
		System.out.println("SignUp Page");
		
	}
	
	@Test(enabled=true)
	public void Loginpage()
	{
		System.out.println("logIn Page");
		
	}
	
	@Test(dependsOnMethods= {"SignUppage","Loginpage"})
	public void Homepage()
	{
		System.out.println("Home Page");
		
	}
	
	
}
