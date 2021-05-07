package Testng.Practice;

import org.testng.annotations.Test;

public class Grops {
	
	@Test(groups = "veg")
	public void test1()
	{
		System.out.println("This is monday");
	}
	
	@Test(groups = "Nonveg")
	public void test2()
	{
		System.out.println("This is tuesday");
	}
	@Test(groups = "Nonveg")
	public void test3()
	{
		System.out.println("This is wednesday");
	}
	@Test(groups = "veg")
	public void test4()
	{
		System.out.println("This is Thursday");
	}
	@Test(groups = "Nonveg")
	public void test5()
	{
		System.out.println("This is Friday");
	}
	@Test(groups = "Veg & Nonveg")
	public void test6()
	{
		System.out.println("This is Saturday");
	}
	@Test(groups = "Nonveg")
	public void test7()
	{
		System.out.println("This is SUNDAY");
	}
	

}
