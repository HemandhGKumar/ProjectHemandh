package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class reddifftestng {
	ChromeDriver driver;
	
	@BeforeTest
	public void beforereddiff()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void beforemethodreddiff()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	
	@Test
	public void reddifftest1()
	{
		
	WebElement button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));	
	if(button.getAttribute("value").matches("Check availability"))
	{
		System.out.println("TEST PASS");
		
	}
	else
	{
		System.out.println("TEST FAIL");
	}
		
		}
		
	
	@AfterMethod
	public void reddiffaftermethod()
	{
		System.out.println("reddiffaftermethod");
	}
	@AfterTest
	public void reddiffaftertest()
	{
		driver.quit();
	}

}
