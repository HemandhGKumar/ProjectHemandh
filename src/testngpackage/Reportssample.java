package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class Reportssample {
	ChromeDriver driver;
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void beftest()
	{
		driver=new ChromeDriver();
		reporter=new ExtentHtmlReporter("./Report/Testreport.html");
		reporter.config().setDocumentTitle("Automation report");
		reporter.config().setReportName("Functional test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Testername", "Hemandh");
		extent.setSystemInfo("Browsername", "Chrome");
		
	}
	@BeforeMethod
	public void setup()
	{
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void fbtitle()
	{
		test=extent.createTest("fbtitle");
		WebElement fbtext=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2"));
		String act=fbtext.getText();
		String exp="Facebook helps you connect and share with the people in your life.";
		Assert.assertEquals(act, exp);
	}
	@Test
	public void fbbutton()
	{
		test=extent.createTest("fbbutton");
		WebElement loginbutton=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
		String actlogin=loginbutton.getText();
		String explogin="Log in";
		Assert.assertEquals(actlogin, explogin);
		
	}
	@AfterTest
	public void fbafter()
	{
		extent.flush();
	}
	@AfterMethod
	public void finalfb(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "testcase failed is "+result.getName());
			test.log(Status.FAIL, "testcase failed is "+result.getThrowable());
			
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is "+result.getName());
			
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "Passed test case is "+result.getName());
		}
	}
	
	
	
	

}
