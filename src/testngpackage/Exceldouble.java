package testngpackage;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exceldouble {
	ChromeDriver driver;
	@BeforeTest
	public void testexcel1()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void beforeexceltest1()
	{
		driver.get("https://www.facebook.com/");
	}
	
	
	@Test
	public void testexcel() throws Exception
	{
		FileInputStream f=new FileInputStream("D:\\EXCEL SHEET PROGRAM.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(f);
		XSSFSheet sh=w.getSheet("Sheet1");
		int row=sh.getLastRowNum();
		for(int i=1;i<=row;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			int password=(int)sh.getRow(i).getCell(1).getNumericCellValue();
			String pswrd=String.valueOf(password);
			
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).clear();
			driver.findElement(By.name("pass")).sendKeys(pswrd,Keys.ENTER);
			
			
			
			
			
		}
		}
	}


