package Testng.Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class annotations {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("1.beforesuite");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("2.Before test");
	}
	@BeforeClass
	public void beforclass() {
		System.out.println("3.beforeclass");
	}
	
	@BeforeMethod
	public void beformethod() {
		System.out.println("4.beforemethod");
		
		
	}
	
	@Test
	public void xtest()
	{
		System.out.println("Xtest");
	}
	
	/*
	 * @Test
	 * 
	 * @Parameters({"arg1", "arg2"}) public void test1(String Value1, String Value2)
	 * { System.out.println(Value1+" "+ Value2); }
	 */
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("5.After method");
	
	
	}
	
	@AfterClass
	public void Afterclass()
	{
		System.out.println("6.Afterclass");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("7.Aftertest");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("8.Aftersuite");
	}
	
}
