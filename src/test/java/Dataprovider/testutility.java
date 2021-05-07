package Dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testutility {

	public static Object[][] readExcelfile(String path) throws IOException 
	{
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("TestData");
		int row = sh.getLastRowNum();
		int column = sh.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[row][column];
		for(int i =0; i < row; i++)
		{
			for(int j=0; j < column; j++)
			{
				data[i][j] = sh.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
		
	}

}

