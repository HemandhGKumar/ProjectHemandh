package javaprojectsample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooktwo {
	ChromeDriver driver;
	@Before
	public void test()
	{
		driver=new ChromeDriver();
	
	}
	@Test
	public void test2()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@After
	public void test3()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hig@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("545662",Keys.ENTER);
	}
	

}
