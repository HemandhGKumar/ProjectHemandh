package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demodropable {
	ChromeDriver driver;
	@BeforeTest
	public void gurube99before()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void beforemethodguru99()
	{
		driver.get("https://demoqa.com/droppable/");
		
	}
	@Test
	public void testdroppable()
	{
		WebElement dragbut=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement dropbut=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions acti=new Actions(driver);
		acti.dragAndDrop(dragbut, dropbut);
		acti.perform();
		WebElement droppedmes=driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		String dropmessage=droppedmes.getText();
		if(dropmessage.contains("Dropped!"))
		{
			System.out.println("SUCCESS");
			
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}
