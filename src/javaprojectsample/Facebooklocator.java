package javaprojectsample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklocator {
	ChromeDriver driver;
	
	@Before
	public void facebooktesting()
	{
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void maintesting()
	
	{
		
		driver.findElement(By.name("email")).sendKeys("weth@gmail.com");
	
		driver.findElement(By.name("pass")).sendKeys("54545");
	
	
	
		driver.findElement(By.name("login")).click();
	

}}
