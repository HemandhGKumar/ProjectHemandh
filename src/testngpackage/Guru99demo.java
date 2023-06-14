package testngpackage;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99demo {
	ChromeDriver driver;
	@BeforeTest
	public void gurube99before()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void beforemethodguru99()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
	}
	@Test(priority=2)
	public void testguru99()
	{
		
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions action=new Actions(driver);
		action.contextClick(rightclick);
		action.perform();
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
		edit.click();
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		a.accept();
	}
	@Test(priority=1)
	public void test2()
	{
		
		WebElement dbleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions a=new Actions(driver);
		a.doubleClick(dbleclick);
		a.perform();
		Alert b=driver.switchTo().alert();
		System.out.println(b.getText());
		b.accept();
		
	
	}	
		
		
		
		
		
		
		
		
		
	}


