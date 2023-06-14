package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Uploadfileguru99 {
	ChromeDriver driver;
	@BeforeTest
	public void uploadbeforetsrt()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void uploadbeforemthd()
	{
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void testupload()
	{
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/form/div[2]/div[1]/div/div/input")).sendKeys("C:\\Users\\heman\\OneDrive\\Pictures\\1338279.jpg");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/ul/li/div[1]/button")).click();
	}

}
