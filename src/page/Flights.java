package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flights {
ChromeDriver driver;
By flightbutton=By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a/span");
By leavingfrombtn=By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div/div/div/div/div/div/div[1]/button");
By cityselectfrom=By.xpath("//*[@id=\"location-field-leg1-origin\"]");
By goingtobutton=By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/button");
By cityselectto=By.xpath("//*[@id=\"location-field-leg1-destination\"]");
By dropdowntrvlr=By.xpath("//*[@id=\"adaptive-menu\"]/button");
By addtraveller=By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[1]/div/button[2]/span");
By addkids=By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[2]/div/button[2]/span");
By kidage=By.xpath("//*[@id=\"child-age-input-0-0\"]");
By donebutton=By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[3]/button");
By flightseatdrop=By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/ul/div[2]/div[2]/div/button");
By firstclass=By.xpath("//*[@id=\"preferred-class-input\"]/div/div/a[4]/span");
By fromdate=By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/div");
By monthnextbutton=By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]");
By junemonth=By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2");
By alldaymonth=By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/table/tbody/tr/td/button");
By donebuttondate=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/button");

public Flights(ChromeDriver driver)
{
	this.driver=driver;
	}
public void clickflight()
{
	driver.findElement(flightbutton).click();
	}
public void boardingselect()
{
	driver.findElement(leavingfrombtn).click();
	
	}
public void boardingname(String fromcityname)
{
	driver.findElement(cityselectfrom).sendKeys(fromcityname,Keys.ENTER);
	}
public void tocity()
{
	driver.findElement(goingtobutton).click();
	}
public void tocityname(String tocitynme)
{
	driver.findElement(cityselectto).sendKeys(tocitynme,Keys.ENTER);
	
	}
public void datefrom()
{
	driver.findElement(fromdate).click();
	
	while(true)
	{
	WebElement buttonjune=driver.findElement(junemonth);
	String june=buttonjune.getText();
	
	
		if(june.equals("August 2023"))
		{
			System.out.println(june);
			break;
		}
			else
			{
				driver.findElement(monthnextbutton).click();
			}
	}
		
		List<WebElement>allthedates=driver.findElements(alldaymonth);
		for(WebElement all:allthedates)
		{
			String selecteddate=all.getAttribute("data-day");
			if(selecteddate.equals("21"))
			{
				all.click();
				
				}
			
			}}
public void done()
{
	driver.findElement(donebuttondate).click();	
}


public void travellerselect()
{
	
driver.findElement(dropdowntrvlr).click();
driver.findElement(addtraveller).click();

driver.findElement(addkids).click();	

Select kiddrop=new Select(driver.findElement(kidage));
kiddrop.selectByValue("3");
driver.findElement(donebutton).click();
}
public void economy()
{
driver.findElement(flightseatdrop).click();
driver.findElement(firstclass).click();
}
	}

