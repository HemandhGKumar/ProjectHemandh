package javaprojectsample;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownsample {
	ChromeDriver driver;
	@Before
	public void reddiffdropdown()
	{
		driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void reddiffdropdowntest()
	{
		
		WebElement dropdownofday=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select daydrop=new Select(dropdownofday);
		daydrop.selectByValue("10");
		List<WebElement>li=daydrop.getOptions();
		System.out.println("Count of day="+li.size());
		
		WebElement dropdownofmonth=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select monthdrop=new Select(dropdownofmonth);
		monthdrop.selectByValue("05");
		List<WebElement>limonth=monthdrop.getOptions();
		System.out.println("Count of month="+limonth.size());
		
		WebElement dropdownofyear=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select yeardropdown=new Select(dropdownofyear);
		yeardropdown.selectByValue("1997");
		List<WebElement>liyear=yeardropdown.getOptions();
		System.out.println("Count of year="+liyear.size());
		
		
	}

}
