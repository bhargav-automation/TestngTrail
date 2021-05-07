package Testng.Practice;

import org.testng.annotations.Test;

public class invocationcount {
	
	static int sum;
	@Test(invocationCount = 5)
	public void test1()
	{
		int a =10; int b = 20;
		 sum = a+b;
		System.out.println("Sum "+ sum);
	}
	
	@Test(invocationTimeOut = 6000000)
	public void Atest()
	{
		System.out.println("waiting for excution");
	}

}
