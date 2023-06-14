package testngpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonphone {
	ChromeDriver driver;
	@BeforeTest
	public void bfre()
	{
	driver=new ChromeDriver();	
	}
	@BeforeMethod
	public void bfremethod()
	{
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void testamzn()
	{
		String parentpage=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobilephones",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();	
		
		Set<String>allpages=driver.getWindowHandles();
		for(String pages:allpages)
		{
			if(!pages.equalsIgnoreCase(parentpage))
			{
				driver.switchTo().window(pages);
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				
			}
			else
			{
				driver.switchTo().window(parentpage);
			}
		}
		}

}
