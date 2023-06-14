package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclassexpedia {
ChromeDriver driver;
@BeforeTest
public void expediatest()
{
	driver=new ChromeDriver();
	}
@BeforeMethod
public void expediabefore()
{
	driver.get("https://www.expedia.co.in/");
	
}
}
