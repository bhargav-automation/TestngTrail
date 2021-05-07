package Testng.Practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parmeters {
	
	@Test
	@Parameters({"Value1", "Value2"})
	public void login(String Value1, String Value2)
	{
		System.out.println(Value1+" "+Value2);
	}

}
