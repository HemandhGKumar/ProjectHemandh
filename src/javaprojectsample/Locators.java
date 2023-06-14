package javaprojectsample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	ChromeDriver driver;
	
	@Before
	public void first()
	{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	}
	@Test
	public void testing()
	{
		driver.findElement(By.name("q")).sendKeys("ms dhoni",Keys.ENTER);
	}
}
