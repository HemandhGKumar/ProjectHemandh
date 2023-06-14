package javaprojectsample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitsample {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://www.audi.com");
	

}
	@Test
	public void Sample()
	{
	String actualtitle=driver.getTitle();
	System.out.println("ActualTitle is "+actualtitle);
	String sc=driver.getPageSource();
	if(sc.contains("audi"))
	{
		System.out.println("SUCCESS");
		
	}
	else
	{
		System.out.println("FAIL");
	}
	}
	
    @After
    public void End()
    {
    	driver.quit();
    }}



