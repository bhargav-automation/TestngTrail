package Dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dataprovider1 {
	
	
	@Parameters({"path"})
	@DataProvider
	public Object[][] getdata(String path) throws IOException
	{
	   Object data[][] = testutility1.readdatafromxl(path);
		return data;
	}
	
	@Test(dataProvider = "getdata")
	public void testing(String firstname,String Lastname, String Age) 
	{
		System.out.println(firstname+" "+Lastname+" "+Age);
	}
	

}
