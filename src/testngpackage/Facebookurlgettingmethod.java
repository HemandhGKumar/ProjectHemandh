package testngpackage;



import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebookurlgettingmethod {
	ChromeDriver driver;
	@BeforeTest
	public void beforefburl()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void beforemethodurl()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void testfburl()
	{
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("8848751248");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("lkjh");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		String expect="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjg1NDM4NTAxLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
		String actual=driver.getCurrentUrl();
		if(actual.equals(expect))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}

