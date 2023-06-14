package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Xmlfacebook {
	ChromeDriver driver;
	@BeforeTest
	public void beforefbxml()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void beforemethodxml()
	{
		driver.get("https://www.facebook.com/");
	}
	@Parameters({"username","password"})
	@Test
	public void testxml(String usnme,String pswrd)
	{
		driver.findElement(By.name("email")).sendKeys(usnme);
		driver.findElement(By.name("pass")).sendKeys(pswrd);
	}

}
