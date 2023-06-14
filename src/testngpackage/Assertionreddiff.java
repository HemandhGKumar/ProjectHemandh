package testngpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionreddiff {
	ChromeDriver driver;
	@BeforeTest
	public void Assertreddbefore()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void assertreddiffbefore()
	{
		driver.get("https://www.rediff.com/");
	}
	@Test
	public void asserreddifftest()
	{
		WebElement button=driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/p/a[2]"));
		String createbutton=button.getText();
		String exp="Create Account";
		Assert.assertEquals(createbutton, exp);
		System.out.println("YES");
	}

}
