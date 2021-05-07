package Testng.Practice;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DependsonMethod {
	@Test(expectedExceptions = ArithmeticException.class)
	public void test1()
	{
		Assert.assertEquals(2, 2);
		int i = 9/0;
		System.out.println("Test1");
	}
	
	@Test(dependsOnMethods = "test1")
	public void test2()
	{
		System.out.println("Test2");
	}

}
