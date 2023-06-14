package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	ChromeDriver driver;
	@BeforeTest
	public void googlebeforetest()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void googlebeforemethod()
	{
		driver.get("https://google.com");
	}
	@Test(priority=2)
	public void googletest()
	{
		boolean b=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
		if(b)
		{
			System.out.println("Logo is present");
		}
		else
		{
			System.out.println("Logo is not present");
		}}
	
		@Test(priority=1)
		public void googleclick()
		{
			driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Virat Kohli",Keys.ENTER);
			
		}
      @AfterMethod
      public void googleaftermethod()
      {
    	  System.out.println("AFTERMETHOD");
      }
      @AfterTest
      public void googleaftertest()
      {
    	  driver.quit();
      }
      }

		
		



