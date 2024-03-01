package test;

import org.testng.annotations.Test;

public class childtestNgboilerplate extends ParentTestNgBoilerplate{
	
	@Test
	public void childMethod1()
	{
		
		System.out.println("childMethod1");
	}
	
	@Test
	public void childMethod2()
	{
		Parentmethod1();
		
		System.out.println("childMethod2");
	}

}
