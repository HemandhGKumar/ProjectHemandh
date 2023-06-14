package javaprojectsample;






import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;





public class Screenshotprgrm {
	ChromeDriver driver;
	@Before
	public void alertbefore()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/heman/OneDrive/Documents/website.html");
	}
	@Test
	
	public void Screenshot() throws Exception
	{
	
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D://Screenshot.png"));
		WebElement button=driver.findElement(By.xpath("//input[@type='button']"));
		File src1=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./Scrnshot/error.png"));
		
	
	}
	
	
	
}
