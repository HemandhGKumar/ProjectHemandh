package javaprojectsample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Reddiffradiobutton {
	
	ChromeDriver driver;
	
	@Before
	public void reddiffbefore()
	{
		driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void reddifftest()
	{
		boolean a=driver.findElement(By.xpath("//input[@value='m']")).isSelected();
		if(a)
		{
			System.out.println("Male is selected by default");
		}
		else
		{
			System.out.println("Female is selected by default");
		}
	}
	

}
