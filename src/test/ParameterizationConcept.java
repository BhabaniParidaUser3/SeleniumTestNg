package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterizationConcept {
	
	@Parameters({"url","apikey"})
	@Test
	public void LogInpage(String urlname,String apikeyname)
	{
		System.out.println(urlname);
		System.out.println(apikeyname);
	}

}
