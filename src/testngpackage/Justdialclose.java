package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Justdialclose {
	ChromeDriver driver;
	@BeforeTest
	public void before()
	{
		ChromeOptions co=new ChromeOptions(); 
		co.addArguments("--disable-notifications");
		driver=new ChromeDriver(co);
	}
	@BeforeMethod
	public void method()
	{
		driver.get("https://www.justdial.com/");
	}
@Test
public void test1()
{
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/section[2]/div/div/div[2]/a[2]/div[1]/span/img")).click();
	}
}
