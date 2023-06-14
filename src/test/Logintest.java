package test;


import org.testng.annotations.Test;

import page.Excelutils;
import page.Loginpage;

public class Logintest extends Baseclass1 {
	
	@Test
	public void logintest()
	{
		Loginpage lb=new Loginpage(driver);
		String xl="D:\\EXCEL SHEET PROGRAM.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutils.getRowCount(xl, Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String Username=Excelutils.getCellValue(xl, Sheet, i, 0);
			System.out.println("username is"+Username);
			String password=Excelutils.getCellValue(xl, Sheet, i, 1);
			lb.setvalues(Username, password);
			lb.login();
		}
	}

}
