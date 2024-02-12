package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day6 {
	
	@BeforeTest
	public void z()
	{
		System.out.println("Beforetest Method ");
	}

	
	@AfterTest
	public void x()
	{
		System.out.println("AfterTest Method ");
	}
	
	@Test
	public void c()
	{
		System.out.println("c method");
	}
	@Test(groups= {"smoke"})
	public void group6()
	{
		System.out.println("Smoke group method called from Day6");
	}
}
