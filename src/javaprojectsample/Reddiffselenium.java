package javaprojectsample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddiffselenium {
	ChromeDriver driver;
	@Before
	public void reddiff()
	{
		driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void reddifftest()
	{
		boolean logo=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr/td/img")).isDisplayed();
	
	if(logo)
	{
		System.out.println("Logo is present");
	}
	else
	{
		System.out.println("Logo not present");
	}
	

}}
