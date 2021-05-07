package Dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	
	
	@DataProvider
	public Object[][] getdata() throws IOException
	{
		Object data[][] = testutility.readExcelfile(".//Utility//Data Validation.xlsx");
		return data;
		
	}
	
	
	@Test(dataProvider = "getdata")
	public void filling(String Firstname, String Lastname, String Age)
	{
		System.out.println(Firstname+" "+Lastname+" "+Age);
	}

}
