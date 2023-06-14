package javaprojectsample;

import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinksample {
	ChromeDriver driver;
	@Before
	public void brokenbefore()
	{
		driver=new ChromeDriver();
		driver.get("https://www.audi.in");
	}
	
	@Test
	public void fbtest() throws Exception
	{
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links="+links.size());
		
		for(WebElement lnk:links)
		{
			String link=lnk.getAttribute("href");
			verify(link);
		}
	}

	private void verify(String link) throws Exception {
		URL n=new URL(link);
		HttpURLConnection con=(HttpURLConnection)n.openConnection();
		if(con.getResponseCode()==200)
		{
			System.out.println("RESPONSE CODE IS 200"+link);
		}
		else if(con.getResponseCode()==400)
		{
			System.out.println("RESPONSE CODE IS 400"+link);
			
		}
	}
		
		
	}
	
			
		
		


