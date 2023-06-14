package testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngcrossbrowser {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void crossbrowserbefore(String brwsr)
	{
	if(brwsr.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(brwsr.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(brwsr.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
	}
}
	@Test
	public void fbtestcross()
	{
		driver.get("https://www.facebook.com/");
	}
	}


