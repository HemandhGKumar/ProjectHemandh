package testngpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99click {
	ChromeDriver driver;
@BeforeTest
public void beforetst()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void beforemthd()
{
	driver.get("https://demo.guru99.com/popup.php");
}
@Test
public void test3()
{
	String parent=driver.getWindowHandle();
	System.out.println("The parentlink is= "+parent);
	driver.findElement(By.xpath("/html/body/p/a")).click();
	Set<String>allhandles=driver.getWindowHandles();
	for(String handle:allhandles)
	{
		if(!handle.equalsIgnoreCase(parent))
		{
			driver.switchTo().window(handle);
			driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
			driver.close();
		}
		else
		{
			driver.switchTo().window(parent);
		}
	}
}}
