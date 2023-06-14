package javaprojectsample;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	ChromeDriver driver;
	
	@Before
	public void fbbefore()
	{
		driver=new ChromeDriver();
		driver.get("https://www.audi.in");
	}
	@Test
	public void fbtest()
	{
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		for(WebElement lnk:links)
		{
			System.out.println(lnk.getText());
			System.out.println(lnk.getAttribute("href"));
		}
		
	}

}


