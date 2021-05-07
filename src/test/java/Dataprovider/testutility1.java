package Dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testutility1 {

	public static Object[][] readdatafromxl(String Path) throws IOException
	{
		FileInputStream fis = new FileInputStream(Path);
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("TestData");
		int row = sh.getLastRowNum();
		int col = sh.getRow(0).getLastCellNum();
		Object[][] data = new Object[row][col];
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				data[i][j] = sh.getRow(i).getCell(j).toString();
			}
		}
		return data;
	}
}
