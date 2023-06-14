package testngpackage;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Expediadate {
	ChromeDriver driver;
	@BeforeTest
	public void beforeexp()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void beforemethodexp()
	{
		driver.get("https://www.expedia.co.in/");
		
	}
	@Test
	public void testexp()
	{
		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
		while(true)
		{
			WebElement button=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2"));
			String buttontext=button.getText();
			if(buttontext.equals("July 2023"))
			{
				System.out.println(buttontext);
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
				
			}
		}
		List<WebElement>alldates=driver.findElements(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));
		for(WebElement date:alldates)
		{
			String date1=date.getAttribute("data-day");
			if(date1.equals("24"))
			{
				date.click();
				System.out.println("24");
			}
		}
		
		
	}

}
