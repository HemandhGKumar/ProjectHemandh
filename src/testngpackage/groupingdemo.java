package testngpackage;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class groupingdemo {
	ChromeDriver driver;
	@BeforeTest(alwaysRun=true)
	public void googlebeforetest()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod(alwaysRun=true)
	public void googlebeforemethod()
	{
		driver.get("https://google.com");
	}
	@Test(groups= {"smoke"})
	public void googletest()
	{
		boolean b=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
		if(b)
		{
			System.out.println("Logo is present");
		}
		else
		{
			System.out.println("Logo is not present");
		}}
	
		@Test(groups= {"sanity"})
		public void googleclick()
		{
			driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Virat Kohli",Keys.ENTER);
			
		}
		@Test(groups= {"smoke"})
		public void googletext()
		{
			
			WebElement link=driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"));
			String li=link.getAttribute("href");
			System.out.println(link.getText());
			System.out.println("THE LINK IS" +li);
			
			
		}
      @AfterMethod
      public void googleaftermethod()
      {
    	  System.out.println("AFTERMETHOD");
      }
      @AfterTest
      public void googleaftertest()
      {
    	  driver.quit();
      }

}
