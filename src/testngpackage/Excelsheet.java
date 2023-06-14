package testngpackage;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelsheet {
	@Test
	public void testexcel() throws Exception
	{
		FileInputStream f=new FileInputStream("D:\\EXCEL SHEET PROGRAM.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int row=sh.getLastRowNum();
		for(int i=1;i<=row;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("The Username="+username+"and"+"Password="+password);
		}
	}
	
	

}
