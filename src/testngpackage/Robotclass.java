package testngpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Robotclass {
ChromeDriver driver;
	
	@BeforeTest
	public void beforerobot()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void beforemethodrobot()
	{
		driver.get("https://www.ilovepdf.com/jpg_to_pdf");
		
	}
	@Test
	public void testrobots() throws Exception
	{
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[4]/a")).click();
		
		fileUpload("\"C:\\Users\\heman\\OneDrive\\Pictures\\1338279.jpg\"");
	}
	
	public void fileUpload(String p) throws AWTException
	{
		StringSelection strselection=new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
	
	Robot rob=new Robot();
	rob.delay(3000);
	
	rob.keyPress(KeyEvent.VK_CONTROL);
	rob.keyPress(KeyEvent.VK_V);
	rob.keyRelease(KeyEvent.VK_V);
	rob.keyRelease(KeyEvent.VK_CONTROL);
	
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.delay(3000);
	rob.keyRelease(KeyEvent.VK_ENTER);
	}

}
