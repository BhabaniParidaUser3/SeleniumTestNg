package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListnersTest {
	
	@Test
	public void m1()
	{
		System.out.println("m1 method listen by listner because its a success method");
	}

	
	@Test
	public void m2()
	{
		System.out.println("m2 method listen by listner because its a success method");
	}
	
	@Test
	public void m3()
	{
		System.out.println("m3 method listen by listner because its a failed method");
		Assert.assertTrue(false);
	}
	
	
}
