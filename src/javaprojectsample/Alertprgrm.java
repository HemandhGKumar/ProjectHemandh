package javaprojectsample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgrm {
	ChromeDriver driver;
	@Before
	public void alertbefore()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/heman/OneDrive/Documents/website.html");
	}
	@Test
	public void alerttest()
	{
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		a.accept();
		if(text.equals("HELLO,IAM AN ALERT BOX"))
		{
			System.out.println("Pass");
				
		}
		else
		{
			System.out.println("Fail");
		}
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("HEMANDH");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("G KUMAR");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	}

}
