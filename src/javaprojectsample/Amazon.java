package javaprojectsample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	@Before
	public void amazonbefore()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void amazontest()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phones");
		driver.findElement(By.xpath("//div[@id='nav-cart-count-container']/span[2]")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ghi@gmail.com",Keys.ENTER);
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[8]")).click();
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		
	}
	@After
	public void amazonquit()
	{
		driver.quit();
	}

}
