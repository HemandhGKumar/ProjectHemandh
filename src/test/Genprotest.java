package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Excelutils;
import page.Genpropage;

public class Genprotest {
	ChromeDriver driver;
	@BeforeTest
	public void before()
	{
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		driver=new ChromeDriver(ch);
		driver.manage().window().maximize();
	}
@BeforeMethod
public void method2()
{
	
	driver.get("https://www.saucedemo.com/");
}
@Test
public void testing() throws InterruptedException
{
	Genpropage gen=new Genpropage(driver);
	
	String xl="C:\\Users\\heman\\OneDrive\\Desktop\\Genprosheet.xlsx";
	String Sheet="Logindetails";
	int rowCount=Excelutils.getRowCount(xl, Sheet);
	for(int i=1;i<=rowCount;i++)
	{
		String Username1=Excelutils.getCellValue(xl, Sheet, i, 0);
		System.out.println("username is"+Username1);
		String pswrd=Excelutils.getCellValue(xl, Sheet, i, 1);
		System.out.println("password is"+pswrd);
		
		
		gen.login1(Username1, pswrd);
		
		
		gen.dropdwn();
		gen.add();
		gen.cart();
		gen.removeitems();
		gen.checkoutbtn();
		gen.details();
		gen.finishbtn();
		gen.home();
		gen.hbrgr();
		Thread.sleep(3000);

		gen.logout();
		}
	}
	
}

