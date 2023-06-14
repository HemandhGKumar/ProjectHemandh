package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass1 {
	ChromeDriver driver;
	@BeforeTest
	public void fbtest()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void fbbfremthd()
	{
		driver.get("https://www.facebook.com/");
		}

}
